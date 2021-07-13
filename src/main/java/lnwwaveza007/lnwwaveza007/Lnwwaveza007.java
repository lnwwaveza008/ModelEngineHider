package lnwwaveza007.lnwwaveza007;

import lnwwaveza007.lnwwaveza007.Commands.maincommands;
import lnwwaveza007.lnwwaveza007.Commands.tabcomplete;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lnwwaveza007 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "            ModelHider 1.0                 ");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "          By Lnwwaveza007               ");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "              Enabled                    ");
        getCommand("meghider").setExecutor(new maincommands());
        getCommand("meghider").setTabCompleter(new tabcomplete());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "            ModelHider 1.0                 ");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "          By Lnwwaveza007               ");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "              Disabled                    ");
    }
}
