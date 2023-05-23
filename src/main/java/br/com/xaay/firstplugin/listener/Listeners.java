package br.com.xaay.firstplugin.listener;

import io.papermc.paper.event.block.BlockBreakBlockEvent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listeners implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playerName = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.GREEN + "Player: " + playerName + " Entrou no servidor");
    }

    @EventHandler
    public void leftPlayer(PlayerQuitEvent event) {
        String playerName = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.RED + "Player: " + playerName + " Saiu do servidor");
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();

        Player player = event.getPlayer();

        World world = player.getWorld();


        if (block.getType() == Material.GRASS_BLOCK) {
            String playerName = event.getPlayer().getName();
            world.strikeLightningEffect(block.getLocation());
            player.sendMessage(ChatColor.AQUA +  playerName + "Achou um diamante");
        }
    }
}
