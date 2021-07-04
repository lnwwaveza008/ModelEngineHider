package lnwwaveza007.lnwwaveza007.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class tabcomplete implements TabCompleter{

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.isOp()) {
            if (command.getName().equalsIgnoreCase("meghider")) {
                if (args.length == 1) {
                    List<String> arguments = new ArrayList<>();
                    arguments.add("Spawn");
                    arguments.add("Remove");
                    arguments.add("State");
                } else if (args.length == 2) {
                    if (args[1].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("ModelName");
                    } else if (args[1].equalsIgnoreCase("Remove")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("SaveName");
                    } else if (args[1].equalsIgnoreCase("State")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("SaveName");
                    }
                } else if (args.length == 3) {
                    if (args[1].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(player.getLocation().getX()));
                    } else if (args[1].equalsIgnoreCase("State")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("ModelName");
                    }
                }
                } else if (args.length == 4) {
                    if (args[1].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(player.getLocation().getY()));
                    } else if (args[1].equalsIgnoreCase("State")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("State");
                    }
                }
                } else if (args.length == 5) {
                    if (args[1].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(player.getLocation().getZ()));
                }
                } else if (args.length == 6) {
                    if (args[1].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(player.getLocation().getYaw()));
                    }
                }
                else if (args.length == 7) {
                    if (args[1].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(player.getLocation().getPitch()));
                    }
                }
                else if (args.length == 8) {
                    if (args[1].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("SaveName");
                    }
                }
        return null;
    }
}
