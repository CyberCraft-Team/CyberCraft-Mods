package com.cybercraft.ranks;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * Rank ma'lumotlarini boshqarish - API bilan bog'lanish va cache
 */
public class RankManager {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Gson GSON = new Gson();
    private static String API_URL = "http://127.0.0.1:8000";

    // Player ranklarini cache qilish
    private static final Map<String, RankData> rankCache = new ConcurrentHashMap<>();

    public static void setApiUrl(String url) {
        API_URL = url;
    }

    /**
     * Player rank ma'lumotlari
     */
    public static class RankData {
        public String username;
        public String rank;
        public String colorCode;
        public String formatted;

        public RankData(String username, String rank, String colorCode, String formatted) {
            this.username = username;
            this.rank = rank;
            this.colorCode = colorCode;
            this.formatted = formatted;
        }
    }

    /**
     * Cache'dan rank olish
     */
    public static RankData getCachedRank(String username) {
        return rankCache.get(username);
    }

    /**
     * Cache'dan rank o'chirish
     */
    public static void removePlayerRank(String username) {
        rankCache.remove(username);
    }

    /**
     * Asinxron API so'rovi bilan rank olish
     */
    public static void fetchPlayerRankAsync(String username, Consumer<RankData> callback) {
        CompletableFuture.runAsync(() -> {
            try {
                RankData rankData = fetchPlayerRank(username);
                if (rankData != null) {
                    rankCache.put(username, rankData);
                }
                callback.accept(rankData);
            } catch (Exception e) {
                LOGGER.error("Failed to fetch rank for {}: {}", username, e.getMessage());

                // Default rank berish xatolik bo'lsa
                RankData defaultRank = new RankData(
                        username,
                        "Player",
                        "§7",
                        "§7[Player]§f " + username);
                rankCache.put(username, defaultRank);
                callback.accept(defaultRank);
            }
        });
    }

    /**
     * API dan rank olish
     */
    private static RankData fetchPlayerRank(String username) throws Exception {
        String encodedUsername = URLEncoder.encode(username, StandardCharsets.UTF_8);
        URL url = new URL(API_URL + "/api/rewards/player-rank/?username=" + encodedUsername);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        try {
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int responseCode = conn.getResponseCode();

            if (responseCode == 200) {
                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }

                    JsonObject json = GSON.fromJson(response.toString(), JsonObject.class);

                    return new RankData(
                            json.get("username").getAsString(),
                            json.get("rank").getAsString(),
                            json.get("color_code").getAsString(),
                            json.get("formatted").getAsString());
                }
            } else if (responseCode == 404) {
                // Foydalanuvchi topilmadi - default rank
                LOGGER.warn("User {} not found in backend, using default rank", username);
                return new RankData(username, "Player", "§7", "§7[Player]§f " + username);
            } else {
                LOGGER.warn("API returned status {} for user {}", responseCode, username);
                return null;
            }
        } finally {
            conn.disconnect();
        }
    }
}
