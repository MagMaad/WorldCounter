package me.magmad.worldcounter;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class WorldCounter extends PlaceholderExpansion {

    @Override
    public @NotNull String getIdentifier() {
        return "worldcounter";
    }

    @Override
    public @NotNull String getAuthor() {
        return "MagMad";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0";
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String params) {
        World world = Bukkit.getWorld(params);

        if (world != null)
            return String.valueOf(world.getPlayerCount());

        return "Invalid world";
    }
}
