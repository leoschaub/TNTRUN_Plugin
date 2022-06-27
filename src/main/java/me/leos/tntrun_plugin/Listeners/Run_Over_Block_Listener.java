package me.leos.tntrun_plugin.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Run_Over_Block_Listener implements Listener {

    @EventHandler
    public void onPlayerTouchBlock(PlayerMoveEvent event){
        Player player = event.getPlayer();
        Block block = player.getLocation().getBlock().getRelative(BlockFace.DOWN);

        if( (block.getType() == Material.GRAVEL || block.getType() == Material.SAND) && (block.getLocation().subtract(0,1,0).getBlock().getType() == Material.TNT) ){
            try {
                block.setType(Material.AIR);
                block.getLocation().subtract(0,1,0).getBlock().setType(Material.AIR);
                Thread.sleep(200);
            }
            catch (Exception e) {}

        }


    }
}

