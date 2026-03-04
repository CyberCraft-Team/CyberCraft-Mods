package com.cybercraft.ranks;

import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Team;
import org.slf4j.Logger;

import java.util.Optional;

/**
 * TAB menyusida player ismlarini rank bilan yangilash
 */
public class TabListHandler {
    private static final Logger LOGGER = LogUtils.getLogger();

    /**
     * Playerning TAB menyusidagi ismini yangilash
     * Format: §7[Player]§f Username
     * 
     * NeoForge 1.21.1 da Scoreboard Teams orqali prefix qo'shiladi
     */
    public static void updatePlayerTabName(ServerPlayer player, RankManager.RankData rankData) {
        if (player == null || rankData == null || player.getServer() == null) {
            return;
        }

        try {
            Scoreboard scoreboard = player.getServer().getScoreboard();
            String teamName = "ccrank_" + rankData.rank.toLowerCase();

            // Team mavjudligini tekshirish yoki yaratish
            PlayerTeam team = scoreboard.getPlayerTeam(teamName);
            if (team == null) {
                team = scoreboard.addPlayerTeam(teamName);

                // Rank prefix ni o'rnatish
                Component prefix = parseColoredString(rankData.colorCode + "[" + rankData.rank + "]§f ");
                team.setPlayerPrefix(prefix);

                LOGGER.info("Created team {} with prefix for rank {}", teamName, rankData.rank);
            }

            // Playerni oldingi teamlaridan olib tashlash
            PlayerTeam oldTeam = scoreboard.getPlayersTeam(player.getScoreboardName());
            if (oldTeam != null && !oldTeam.getName().equals(teamName)) {
                scoreboard.removePlayerFromTeam(player.getScoreboardName(), oldTeam);
            }

            // Playerni yangi teamga qo'shish
            if (!scoreboard.getPlayerTeam(teamName).getPlayers().contains(player.getScoreboardName())) {
                scoreboard.addPlayerToTeam(player.getScoreboardName(), team);
            }

            LOGGER.debug("Updated tab name for {}: [{}]", rankData.username, rankData.rank);
        } catch (Exception e) {
            LOGGER.error("Failed to update tab name for {}: {}", player.getName().getString(), e.getMessage());
        }
    }

    /**
     * Minecraft color kodlarini Component ga parse qilish
     */
    private static Component parseColoredString(String text) {
        Component component = Component.empty();
        StringBuilder currentText = new StringBuilder();
        net.minecraft.ChatFormatting currentColor = net.minecraft.ChatFormatting.WHITE;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '§' && i + 1 < text.length()) {
                // Oldingi textni qo'shish
                if (currentText.length() > 0) {
                    component = component.copy().append(
                            Component.literal(currentText.toString()).withStyle(currentColor));
                    currentText = new StringBuilder();
                }

                // Color kodni aniqlash
                char colorCode = text.charAt(i + 1);
                currentColor = getColorFromCode(colorCode);
                i++; // Color kodni o'tkazib yuborish
            } else {
                currentText.append(c);
            }
        }

        // Qolgan textni qo'shish
        if (currentText.length() > 0) {
            component = component.copy().append(
                    Component.literal(currentText.toString()).withStyle(currentColor));
        }

        return component;
    }

    /**
     * § color kodini ChatFormatting ga aylantirish
     */
    private static net.minecraft.ChatFormatting getColorFromCode(char code) {
        return switch (code) {
            case '0' -> net.minecraft.ChatFormatting.BLACK;
            case '1' -> net.minecraft.ChatFormatting.DARK_BLUE;
            case '2' -> net.minecraft.ChatFormatting.DARK_GREEN;
            case '3' -> net.minecraft.ChatFormatting.DARK_AQUA;
            case '4' -> net.minecraft.ChatFormatting.DARK_RED;
            case '5' -> net.minecraft.ChatFormatting.DARK_PURPLE;
            case '6' -> net.minecraft.ChatFormatting.GOLD;
            case '7' -> net.minecraft.ChatFormatting.GRAY;
            case '8' -> net.minecraft.ChatFormatting.DARK_GRAY;
            case '9' -> net.minecraft.ChatFormatting.BLUE;
            case 'a' -> net.minecraft.ChatFormatting.GREEN;
            case 'b' -> net.minecraft.ChatFormatting.AQUA;
            case 'c' -> net.minecraft.ChatFormatting.RED;
            case 'd' -> net.minecraft.ChatFormatting.LIGHT_PURPLE;
            case 'e' -> net.minecraft.ChatFormatting.YELLOW;
            case 'f' -> net.minecraft.ChatFormatting.WHITE;
            case 'l' -> net.minecraft.ChatFormatting.BOLD;
            case 'o' -> net.minecraft.ChatFormatting.ITALIC;
            case 'n' -> net.minecraft.ChatFormatting.UNDERLINE;
            case 'm' -> net.minecraft.ChatFormatting.STRIKETHROUGH;
            case 'k' -> net.minecraft.ChatFormatting.OBFUSCATED;
            case 'r' -> net.minecraft.ChatFormatting.RESET;
            default -> net.minecraft.ChatFormatting.WHITE;
        };
    }
}
