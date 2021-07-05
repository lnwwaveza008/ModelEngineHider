package lnwwaveza007.lnwwaveza007.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.List;

public class tabcomplete implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        Player player = (Player) sender;
        if (player.isOp()) {
            if (command.getName().equalsIgnoreCase("meghider")) {
                if (args.length == 1 && args[0].isEmpty()) {
                    List<String> arguments = new ArrayList<>();
                    arguments.add("Spawn");
                    arguments.add("Remove");
                    arguments.add("State");
                    return arguments;
                } else if (args.length == 2 && args[1].isEmpty()) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("ModelName");
                        return arguments;
                    } else if (args[0].equalsIgnoreCase("Remove")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("SaveName");
                        return arguments;
                    } else if (args[0].equalsIgnoreCase("State")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("SaveName");
                        return arguments;
                    }

                } else if (args.length == 3 && args[2].isEmpty()) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(Math.round(player.getLocation().getX())));
                        return arguments;
                    } else if (args[0].equalsIgnoreCase("State")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("ModelName");
                        return arguments;
                    }
                } else if (args.length == 4 && args[3].isEmpty()) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(Math.round(player.getLocation().getY())));
                        return arguments;
                    } else if (args[0].equalsIgnoreCase("State")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("State");
                        return arguments;
                    }
                } else if (args.length == 5 && args[4].isEmpty()) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(Math.round(player.getLocation().getZ())));
                        return arguments;
                    }
                } else if (args.length == 6 && args[5].isEmpty()) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(Math.round(player.getLocation().getYaw())));
                        return arguments;
                    }
                } else if (args.length == 7 && args[6].isEmpty()) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add(String.valueOf(Math.round(player.getLocation().getPitch())));
                        return arguments;
                    }
                } else if (args.length == 8 && args[7].isEmpty()) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        List<String> arguments = new ArrayList<>();
                        arguments.add("SaveName");
                        return arguments;
                    }
                }

            }
        }
        return null;
    }
}
