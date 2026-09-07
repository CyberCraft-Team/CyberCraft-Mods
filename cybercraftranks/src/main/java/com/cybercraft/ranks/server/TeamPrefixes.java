package com.cybercraft.ranks.server;

import com.cybercraft.ranks.common.RankData;
import com.mojang.logging.LogUtils;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Team;
import org.slf4j.Logger;

import java.util.Locale;

/**
 * Rank prefixes in the vanilla TAB list, via scoreboard teams.
 *
 * Teams are the standard mechanism for this -- the server sends the prefix
 * with vanilla packets and every client, modded or not, renders it. No client
 * mod is involved.
 */
public final class TeamPrefixes {

    private static final Logger LOGGER = LogUtils.getLogger();
    private static final String PREFIX = "ccr_";

    private TeamPrefixes() {
    }

    public static void apply(ServerPlayer player, RankData rank) {
        if (player == null || rank == null || player.getServer() == null) {
            return;
        }

        try {
            Scoreboard scoreboard = player.getServer().getScoreboard();
            String teamName = teamNameFor(rank);

            PlayerTeam team = scoreboard.getPlayerTeam(teamName);
            if (team == null) {
                team = scoreboard.addPlayerTeam(teamName);
                // Same-rank players end up on the same team, which makes them
                // team mates as far as the game is concerned. Left at the
                // vanilla default every VIP could see every other VIP through
                // invisibility.
                team.setSeeFriendlyInvisibles(false);
                team.setAllowFriendlyFire(true);
                team.setNameTagVisibility(Team.Visibility.ALWAYS);
            }

            // Re-applied every time, not only when the team is created: teams
            // are saved in scoreboard.dat, so a prefix set once survived
            // restarts and a colour changed in the backend never took effect.
            team.setPlayerPrefix(rank.prefix());

            PlayerTeam current = scoreboard.getPlayersTeam(player.getScoreboardName());
            if (current != null && !current.getName().equals(teamName)) {
                scoreboard.removePlayerFromTeam(player.getScoreboardName(), current);
            }
            if (!team.getPlayers().contains(player.getScoreboardName())) {
                scoreboard.addPlayerToTeam(player.getScoreboardName(), team);
            }
        } catch (Exception e) {
            LOGGER.error("Could not apply the rank prefix for {}: {}",
                    player.getName().getString(), e.getMessage());
        }
    }

    public static void remove(ServerPlayer player) {
        if (player == null || player.getServer() == null) {
            return;
        }
        Scoreboard scoreboard = player.getServer().getScoreboard();
        PlayerTeam team = scoreboard.getPlayersTeam(player.getScoreboardName());
        if (team != null && team.getName().startsWith(PREFIX)) {
            scoreboard.removePlayerFromTeam(player.getScoreboardName(), team);
        }
    }

    /**
     * The TAB list is ordered by team name, so the name carries the rank
     * priority: higher ranks sort first instead of alphabetically.
     */
    private static String teamNameFor(RankData rank) {
        int sortKey = Math.max(0, Math.min(999, 999 - rank.priority()));
        String slug = rank.rank().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_]", "");
        if (slug.length() > 8) {
            slug = slug.substring(0, 8);
        }
        return PREFIX + String.format(Locale.ROOT, "%03d", sortKey) + "_" + slug;
    }
}
