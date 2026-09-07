package com.cybercraft.ranks.client;

import com.cybercraft.ranks.common.RankSyncPayload;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.neoforge.network.handling.IPayloadContext;

/**
 * Entry point for everything client-only.
 *
 * The payload handler registered in the main class refers to this class from
 * inside a lambda, so on a dedicated server the lambda is never invoked and
 * the class is never loaded. Client rendering code goes behind here too --
 * badges, nameplates, the ranks screen, the HUD.
 */
@OnlyIn(Dist.CLIENT)
public final class ClientHooks {

    private ClientHooks() {
    }

    public static void handleRankSync(RankSyncPayload payload, IPayloadContext context) {
        context.enqueueWork(() -> ClientRankStore.accept(payload.entries()));
    }
}
