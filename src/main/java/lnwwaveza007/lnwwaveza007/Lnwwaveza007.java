package lnwwaveza007.lnwwaveza007;

import lnwwaveza007.lnwwaveza007.Commands.maincommands;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lnwwaveza007 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.LIGHT_PURPLE + "            ModelHider 0.8                 ");
        System.out.println(ChatColor.LIGHT_PURPLE + "          By Lnwwaveza007               ");
        System.out.println(ChatColor.GREEN + "              Enable                    ");
        getCommand("meghider").setExecutor(new maincommands());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.LIGHT_PURPLE + "            ModelHider 0.8                 ");
        System.out.println(ChatColor.LIGHT_PURPLE + "          By Lnwwaveza007               ");
        System.out.println(ChatColor.RED + "              Disable                   ");
    }
}
