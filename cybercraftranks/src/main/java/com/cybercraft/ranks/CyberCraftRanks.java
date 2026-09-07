package com.cybercraft.ranks;

import com.cybercraft.ranks.client.ClientHooks;
import com.cybercraft.ranks.common.RankSyncPayload;
import com.cybercraft.ranks.server.RankBackend;
import com.cybercraft.ranks.server.RankService;
import com.mojang.logging.LogUtils;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.server.ServerStoppingEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.slf4j.Logger;

/**
 * Ranks from the CyberCraft backend, shown in game.
 *
 * One jar, two sides. The server talks to the backend and drives the vanilla
 * TAB prefixes through scoreboard teams; the client side exists for what
 * vanilla cannot draw -- badges, nameplates, the ranks screen, the HUD -- and
 * receives its data from the server, never from the backend directly.
 */
@Mod(CyberCraftRanks.MODID)
public class CyberCraftRanks {

    public static final String MODID = "cybercraftranks";
    public static final Logger LOGGER = LogUtils.getLogger();

    /** Ranks change when someone buys one on the website, so this is slow. */
    private static final int REFRESH_TICKS = 20 * 60;

    private int tickCounter = 0;

    public CyberCraftRanks(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::registerPayloads);
        NeoForge.EVENT_BUS.register(this);

        // Both are handed to the JVM by the panel when it starts the server:
        //   -Dcybercraft.api=<backend>  -Dcybercraft.key=<MOD_API_KEY>
        RankBackend.configure(
                System.getProperty("cybercraft.api"),
                System.getProperty("cybercraft.key"));

        if (!RankBackend.hasKey()) {
            LOGGER.warn("-Dcybercraft.key is not set. A backend with MOD_API_KEY "
                    + "configured will answer 403 to every rank lookup.");
        }
    }

    private void registerPayloads(final RegisterPayloadHandlersEvent event) {
        // optional(): a client without this mod still connects, it simply
        // sees the vanilla team prefixes and none of the extras.
        final PayloadRegistrar registrar = event.registrar("1").optional();
        registrar.playToClient(
                RankSyncPayload.TYPE,
                RankSyncPayload.STREAM_CODEC,
                // Only ever invoked on a client, so ClientHooks is never
                // loaded on a dedicated server.
                (payload, context) -> ClientHooks.handleRankSync(payload, context));
    }

    @SubscribeEvent
    public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) {
            RankService.onJoin(player);
        }
    }

    @SubscribeEvent
    public void onPlayerQuit(PlayerEvent.PlayerLoggedOutEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) {
            RankService.onQuit(player);
        }
    }

    @SubscribeEvent
    public void onServerTick(ServerTickEvent.Post event) {
        if (++tickCounter < REFRESH_TICKS) {
            return;
        }
        tickCounter = 0;
        if (event.getServer() != null) {
            RankService.refreshAll(event.getServer());
        }
    }

    @SubscribeEvent
    public void onServerStopping(ServerStoppingEvent event) {
        RankService.clear();
    }
}
