package uz.cybercraft.auth;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

@Mod(CyberCraftAuthMod.MODID)
public class CyberCraftAuthMod {
    public static final String MODID = "cybercraftauth";
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = new Gson();

    private static String API_URL = "http://127.0.0.1:8000";

    public CyberCraftAuthMod() {
        // API URL ni system property dan o'qish (server ishga tushirilganda)
        String apiUrl = System.getProperty("cybercraft.api");
        if (apiUrl != null && !apiUrl.isEmpty()) {
            API_URL = apiUrl;
        }

        LOGGER.info("[CyberCraft Auth] Server-only mod initialized");
        LOGGER.info("[CyberCraft Auth] API URL: {}", API_URL);

        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) {
            return;
        }

        String playerUUID = player.getUUID().toString();
        String playerName = player.getName().getString();

        LOGGER.info("[CyberCraft Auth] Player joining: {} ({})", playerName, playerUUID);

        // Async tekshirish — main thread ni bloklamaslik uchun
        CompletableFuture.runAsync(() -> {
            try {
                boolean allowed = verifySession(playerName, playerUUID);

                if (!allowed) {
                    var server = player.getServer();
                    if (server != null) {
                        server.execute(() -> {
                            player.connection.disconnect(Component.literal(
                                    "§c§lKirish rad etildi!\n\n" +
                                            "§eSiz faqat CyberCraft Launcher orqali kira olasiz.\n" +
                                            "§7Launcher yuklab olish: §bcybercraft.uz/download"));
                        });
                    }
                } else {
                    LOGGER.info("[CyberCraft Auth] Player {} verified successfully!", playerName);
                }
            } catch (Exception e) {
                LOGGER.error("[CyberCraft Auth] Verification failed for {}: {}", playerName, e.getMessage());

                var server = player.getServer();
                if (server != null) {
                    server.execute(() -> {
                        player.connection.disconnect(Component.literal(
                                "§c§lTekshiruv xatosi!\n\n" +
                                        "§eServer bilan bog'lanishda xatolik yuz berdi.\n" +
                                        "§7Iltimos, keyinroq qayta urinib ko'ring."));
                    });
                }
            }
        });
    }

    /**
     * Backend dan session tekshirish.
     * Launcher oldindan session yaratgan bo'lsa, allowed: true qaytadi.
     */
    private boolean verifySession(String username, String uuid) throws Exception {
        URL url = new URL(API_URL + "/api/v1/minecraft/verify/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        try {
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            JsonObject requestBody = new JsonObject();
            requestBody.addProperty("username", username);
            requestBody.addProperty("uuid", uuid);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = GSON.toJson(requestBody).getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();

            if (responseCode == 200) {
                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }

                    JsonObject jsonResponse = GSON.fromJson(response.toString(), JsonObject.class);
                    boolean allowed = jsonResponse.has("allowed") && jsonResponse.get("allowed").getAsBoolean();

                    if (allowed) {
                        LOGGER.info("[CyberCraft Auth] Backend verified player: {}", username);
                    } else {
                        String reason = jsonResponse.has("reason") ? jsonResponse.get("reason").getAsString() : "Unknown";
                        LOGGER.warn("[CyberCraft Auth] Backend rejected player {}: {}", username, reason);
                    }

                    return allowed;
                }
            } else {
                LOGGER.warn("[CyberCraft Auth] Verification failed with status: {} for player: {}", responseCode, username);
                return false;
            }
        } finally {
            conn.disconnect();
        }
    }
}
