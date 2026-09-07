package com.cybercraft.ranks.common;

import com.cybercraft.ranks.CyberCraftRanks;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

/**
 * Server to client: the ranks of the players currently online.
 *
 * Nothing in the TAB list needs this -- scoreboard team prefixes are vanilla
 * and a vanilla client renders them on its own. It exists so the client side
 * can draw what vanilla cannot: badges, custom nameplates, the ranks screen
 * and the HUD. The registrar marks it optional, so a client without this mod
 * still connects normally.
 */
public record RankSyncPayload(List<RankData> entries) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<RankSyncPayload> TYPE =
            new CustomPacketPayload.Type<>(
                    ResourceLocation.fromNamespaceAndPath(CyberCraftRanks.MODID, "rank_sync"));

    public static final StreamCodec<RegistryFriendlyByteBuf, RankSyncPayload> STREAM_CODEC =
            StreamCodec.composite(
                    RankData.STREAM_CODEC.apply(ByteBufCodecs.list()), RankSyncPayload::entries,
                    RankSyncPayload::new);

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
