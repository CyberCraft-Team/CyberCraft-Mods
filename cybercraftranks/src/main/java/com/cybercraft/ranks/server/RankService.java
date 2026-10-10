package com.cybercraft.ranks.server;

import com.cybercraft.ranks.common.RankData;
import com.cybercraft.ranks.common.RankSyncPayload;
import com.mojang.logging.LogUtils;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.network.registration.NetworkRegistry;
import org.slf4j.Logger;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Keeps every online player's rank in step with the backend.
 *
 * Ranks change only when someone buys one on the website, so this is a slow
 * refresh rather than a poll of anything hot: one bulk request per interval
 * for all players at once, plus a lookup when a player joins.
 */
public final class RankService {

    private static final Logger LOGGER = LogUtils.getLogger();

    private static final Map<UUID, RankData> CACHE = new ConcurrentHashMap<>();

    private RankService() {
    }

    public static RankData get(UUID uuid) {
        return CACHE.get(uuid);
    }

    public static void forget(UUID uuid) {
        CACHE.remove(uuid);
    }

    public static void clear() {
        CACHE.clear();
    }

    /** One player just joined: fetch their rank and tell everyone. */
    public static void onJoin(ServerPlayer player) {
        MinecraftServer server = player.getServer();
        if (server == null) {
            return;
        }

        UUID uuid = player.getUUID();
        String name = player.getName().getString();

        RankBackend.fetch(Map.of(uuid, name)).thenAccept(ranks ->
                server.execute(() -> {
                    // Ignore a completed lookup for a departed or replaced session.
                    if (server.getPlayerList().getPlayer(uuid) != player) {
                        return;
                    }
                    RankData rank = ranks.getOrDefault(uuid, RankData.fallback(uuid, name));
                    CACHE.put(uuid, rank);
                    TeamPrefixes.apply(player, rank);
                    // The joining client needs everyone's ranks, and everyone
                    // else needs this player's.
                    sendSnapshotTo(player);
                    broadcast(server, List.of(rank));
                }));
    }

    public static void onQuit(ServerPlayer player) {
        forget(player.getUUID());
        TeamPrefixes.remove(player);
    }

    /** Periodic reconciliation: one request for every online player. */
    public static void refreshAll(MinecraftServer server) {
        List<ServerPlayer> players = server.getPlayerList().getPlayers();
        if (players.isEmpty()) {
            return;
        }

        Map<UUID, String> online = new LinkedHashMap<>();
        for (ServerPlayer player : players) {
            online.put(player.getUUID(), player.getName().getString());
        }

        RankBackend.fetch(online).thenAccept(ranks -> {
            if (ranks.isEmpty()) {
                return;
            }
            server.execute(() -> {
                for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                    RankData fresh = ranks.get(player.getUUID());
                    if (fresh == null || fresh.equals(CACHE.get(player.getUUID()))) {
                        continue;
                    }
                    CACHE.put(player.getUUID(), fresh);
                    TeamPrefixes.apply(player, fresh);
                    broadcast(server, List.of(fresh));
                    LOGGER.debug("{} is now {}", fresh.username(), fresh.rank());
                }
            });
        });
    }

    private static void sendSnapshotTo(ServerPlayer player) {
        if (!CACHE.isEmpty()) {
            sendToPlayer(player, new RankSyncPayload(List.copyOf(CACHE.values())));
        }
    }

    private static void sendToPlayer(ServerPlayer player, RankSyncPayload payload) {
        // Optional registration permits joining without the mod, but sending
        // an unnegotiated payload still throws on those connections.
        if (NetworkRegistry.hasChannel(player.connection, RankSyncPayload.TYPE.id())) {
            PacketDistributor.sendToPlayer(player, payload);
        }
    }

    private static void broadcast(MinecraftServer server, List<RankData> changed) {
        if (!changed.isEmpty()) {
            RankSyncPayload payload = new RankSyncPayload(changed);
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                sendToPlayer(player, payload);
            }
        }
    }
}
