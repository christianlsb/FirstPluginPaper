package br.com.xaay.firstplugin;

import br.com.xaay.firstplugin.listener.Listeners;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin    {

    @Override
    public void onEnable() {
        System.out.println("Start Plugin");

       this.getServer().getPluginManager().registerEvents(new Listeners(),this);
    }

    @Override
    public void onDisable() {
    }
}
