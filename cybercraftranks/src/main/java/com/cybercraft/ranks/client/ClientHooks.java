package com.cybercraft.ranks.client;

import com.cybercraft.ranks.CyberCraftRanks;
import com.cybercraft.ranks.common.RankSyncPayload;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

/**
 * Entry point for everything client-only.
 *
 * The event subscriber is restricted to the physical client. The payload
 * handler in the main class refers to this class inside a lambda that is
 * never invoked on a dedicated server. Client rendering code goes here too --
 * badges, nameplates, the ranks screen, the HUD.
 */
@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = CyberCraftRanks.MODID, value = Dist.CLIENT)
public final class ClientHooks {

    private ClientHooks() {
    }

    @SubscribeEvent
    public static void onLogout(ClientPlayerNetworkEvent.LoggingOut event) {
        ClientRankStore.clear();
    }

    public static void handleRankSync(RankSyncPayload payload, IPayloadContext context) {
        context.enqueueWork(() -> ClientRankStore.accept(payload.entries()));
    }
}
