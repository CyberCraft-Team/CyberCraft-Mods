package com.cybercraft.ranks;

import com.mojang.logging.LogUtils;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import org.slf4j.Logger;

@Mod(CyberCraftRanks.MODID)
public class CyberCraftRanks {
    public static final String MODID = "cybercraftranks";
    public static final Logger LOGGER = LogUtils.getLogger();

    private static String API_URL = "http://127.0.0.1:8000";
    private static int tickCounter = 0;
    private static final int UPDATE_INTERVAL = 20 * 60; // Har 60 sekundda yangilash

    public CyberCraftRanks(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        // API URL ni system property dan olish
        String apiUrl = System.getProperty("cybercraft.api");
        if (apiUrl != null && !apiUrl.isEmpty()) {
            API_URL = apiUrl;
        }

        LOGGER.info("CyberCraft Ranks Mod initialized");
        LOGGER.info("API URL: {}", API_URL);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("CyberCraft Ranks - Common Setup");
        RankManager.setApiUrl(API_URL);
    }

    @SubscribeEvent
    public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) {
            return;
        }

        String username = player.getName().getString();
        LOGGER.info("Player joined: {}, fetching rank...", username);

        // Asinxron rank olish
        RankManager.fetchPlayerRankAsync(username, (rankData) -> {
            if (rankData != null) {
                player.getServer().execute(() -> {
                    TabListHandler.updatePlayerTabName(player, rankData);
                });
            }
        });
    }

    @SubscribeEvent
    public void onPlayerQuit(PlayerEvent.PlayerLoggedOutEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) {
            String username = player.getName().getString();
            RankManager.removePlayerRank(username);
            LOGGER.info("Player {} left, removed from rank cache", username);
        }
    }

    @SubscribeEvent
    public void onServerTick(ServerTickEvent.Post event) {
        tickCounter++;

        // Har 60 sekundda barcha playerlarning ranklarini yangilash
        if (tickCounter >= UPDATE_INTERVAL) {
            tickCounter = 0;

            if (event.getServer() != null) {
                for (ServerPlayer player : event.getServer().getPlayerList().getPlayers()) {
                    String username = player.getName().getString();
                    RankManager.fetchPlayerRankAsync(username, (rankData) -> {
                        if (rankData != null) {
                            player.getServer().execute(() -> {
                                TabListHandler.updatePlayerTabName(player, rankData);
                            });
                        }
                    });
                }
            }
        }
    }
}
