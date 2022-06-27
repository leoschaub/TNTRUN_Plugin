package me.leos.tntrun_plugin;

import me.leos.tntrun_plugin.Listeners.Run_Over_Block_Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TNTRUN_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new Run_Over_Block_Listener(), this);
    }

}
