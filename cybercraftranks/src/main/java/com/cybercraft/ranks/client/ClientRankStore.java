package com.cybercraft.ranks.client;

import com.cybercraft.ranks.common.RankData;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The client's copy of who holds which rank.
 *
 * The TAB list does not need this -- vanilla renders team prefixes by itself.
 * This is the data the client-side features are built on: badges, custom
 * nameplates, the ranks screen and the HUD. Everything here arrives from the
 * server; the client never talks to the backend, and holds no API key.
 */
public final class ClientRankStore {

    private static final Map<UUID, RankData> RANKS = new ConcurrentHashMap<>();

    private ClientRankStore() {
    }

    public static void accept(Iterable<RankData> entries) {
        for (RankData entry : entries) {
            RANKS.put(entry.uuid(), entry);
        }
    }

    public static RankData get(UUID uuid) {
        return RANKS.get(uuid);
    }

    public static Map<UUID, RankData> all() {
        return Map.copyOf(RANKS);
    }

    /** Called when leaving a server, so ranks do not leak into the next one. */
    public static void clear() {
        RANKS.clear();
    }
}
