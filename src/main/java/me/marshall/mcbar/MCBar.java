package me.marshall.mcbar;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCBar extends JavaPlugin {

    private static MCBar plugin;

    public static MCBar getInstance() {
        return plugin;
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PotionListener(), this);
        this.getCommand("corona").setExecutor(new Commands());
        plugin = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
