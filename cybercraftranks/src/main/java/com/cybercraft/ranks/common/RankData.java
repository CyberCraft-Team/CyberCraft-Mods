package com.cybercraft.ranks.common;

import net.minecraft.ChatFormatting;
import net.minecraft.core.UUIDUtil;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

import java.util.UUID;

/**
 * One player's rank, as the backend reports it.
 *
 * Keyed by uuid rather than username: usernames change, uuids do not, and
 * the backend stores minecraft_uuid on every account.
 */
public record RankData(UUID uuid, String username, String rank, String colorCode, int priority) {

    public static final String DEFAULT_RANK = "Player";
    public static final String DEFAULT_COLOR = "§7";

    public static final StreamCodec<RegistryFriendlyByteBuf, RankData> STREAM_CODEC =
            StreamCodec.composite(
                    UUIDUtil.STREAM_CODEC, RankData::uuid,
                    ByteBufCodecs.STRING_UTF8, RankData::username,
                    ByteBufCodecs.STRING_UTF8, RankData::rank,
                    ByteBufCodecs.STRING_UTF8, RankData::colorCode,
                    ByteBufCodecs.VAR_INT, RankData::priority,
                    RankData::new);

    /** What a player gets when the backend cannot be reached. */
    public static RankData fallback(UUID uuid, String username) {
        return new RankData(uuid, username, DEFAULT_RANK, DEFAULT_COLOR, 0);
    }

    /** "[VIP] " as a styled component, ready for a team prefix or a badge. */
    public Component prefix() {
        return legacy(colorCode + "[" + rank + "]§f ");
    }

    /**
     * Parse legacy section-sign codes into a component.
     *
     * The previous implementation kept a single ChatFormatting and applied it
     * with withStyle, so "§a§lVIP" lost the green and came out bold
     * only -- colours and decorations were treated as the same thing. Styles
     * accumulate here instead, and both orderings give green bold.
     */
    public static Component legacy(String text) {
        MutableComponent out = Component.empty();
        StringBuilder buffer = new StringBuilder();
        Style style = Style.EMPTY;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isCode = (c == '§' || c == '&') && i + 1 < text.length();

            if (!isCode) {
                buffer.append(c);
                continue;
            }

            if (buffer.length() > 0) {
                out.append(Component.literal(buffer.toString()).withStyle(style));
                buffer.setLength(0);
            }

            ChatFormatting format = ChatFormatting.getByCode(Character.toLowerCase(text.charAt(++i)));
            style = (format == null || format == ChatFormatting.RESET)
                    ? Style.EMPTY
                    : style.applyFormat(format);
        }

        if (buffer.length() > 0) {
            out.append(Component.literal(buffer.toString()).withStyle(style));
        }
        return out;
    }
}
