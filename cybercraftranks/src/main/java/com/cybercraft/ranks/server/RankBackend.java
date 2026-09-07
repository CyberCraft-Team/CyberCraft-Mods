package com.cybercraft.ranks.server;

import com.cybercraft.ranks.common.RankData;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * HTTP access to the CyberCraft backend.
 *
 * One bulk request covers every online player. The previous version asked for
 * one player per request on a sixty second timer, so a full server meant one
 * request per player per minute for data that only changes when someone buys
 * a rank on the website.
 *
 * Requests run on a small dedicated pool. They used to go through
 * CompletableFuture.runAsync, which means the common ForkJoinPool -- a pool
 * shared with everything else that uses parallel streams, blocked for up to
 * ten seconds per call.
 */
public final class RankBackend {

    private static final Logger LOGGER = LogUtils.getLogger();

    private static final ExecutorService IO = Executors.newFixedThreadPool(2, runnable -> {
        Thread thread = new Thread(runnable, "cybercraft-ranks-io");
        thread.setDaemon(true);
        return thread;
    });

    private static final HttpClient HTTP = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(5))
            .executor(IO)
            .build();

    private static String apiUrl = "http://127.0.0.1:8000";
    private static String apiKey = "";

    private RankBackend() {
    }

    public static void configure(String url, String key) {
        if (url != null && !url.isEmpty()) {
            apiUrl = url.replaceAll("/+$", "");
        }
        if (key != null && !key.isEmpty()) {
            apiKey = key;
        }
    }

    public static boolean hasKey() {
        return !apiKey.isEmpty();
    }

    /**
     * Ranks for the given uuids, in one request.
     *
     * Players the backend does not know are simply absent from the result --
     * the caller decides what to show for them.
     */
    public static CompletableFuture<Map<UUID, RankData>> fetch(Map<UUID, String> players) {
        if (players.isEmpty()) {
            return CompletableFuture.completedFuture(Map.of());
        }

        String body = "{\"uuids\":["
                + players.keySet().stream()
                        .map(uuid -> "\"" + uuid + "\"")
                        .collect(Collectors.joining(","))
                + "]}";

        HttpRequest.Builder request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl + "/api/v1/rewards/player-ranks/"))
                .timeout(Duration.ofSeconds(5))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body));

        if (!apiKey.isEmpty()) {
            request.header("X-CyberCraft-Key", apiKey);
        }

        return HTTP.sendAsync(request.build(), HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> parse(response, players))
                .exceptionally(error -> {
                    LOGGER.error("Rank lookup failed: {}", error.getMessage());
                    return Map.of();
                });
    }

    private static Map<UUID, RankData> parse(HttpResponse<String> response, Map<UUID, String> players) {
        if (response.statusCode() == 403) {
            LOGGER.error("Backend rejected the rank lookup (403). Is -Dcybercraft.key set "
                    + "and does it match MOD_API_KEY on the server?");
            return Map.of();
        }
        if (response.statusCode() != 200) {
            LOGGER.warn("Rank lookup returned {}", response.statusCode());
            return Map.of();
        }

        Map<UUID, RankData> result = new HashMap<>();
        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

        for (Map.Entry<UUID, String> player : players.entrySet()) {
            JsonObject entry = json.getAsJsonObject(player.getKey().toString());
            if (entry == null) {
                continue;
            }
            result.put(player.getKey(), new RankData(
                    player.getKey(),
                    player.getValue(),
                    entry.get("rank").getAsString(),
                    entry.get("color_code").getAsString(),
                    entry.has("priority") ? entry.get("priority").getAsInt() : 0));
        }
        return result;
    }
}
