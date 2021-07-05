package lnwwaveza007.lnwwaveza007.Commands;

import com.ticxo.modelengine.api.ModelEngineAPI;
import com.ticxo.modelengine.api.model.ActiveModel;
import com.ticxo.modelengine.api.model.ModeledEntity;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.UUID;

public class maincommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("meghider.*")) {
                if (args.length > 0) {
                    if (args[0].equalsIgnoreCase("Spawn")) {
                        World w = player.getWorld();
                        Float x = Float.parseFloat(args[2]);
                        Float y = Float.parseFloat(args[3]);
                        Float z = Float.parseFloat(args[4]);
                        Float yaw = Float.parseFloat(args[5]);
                        Float pitch = Float.parseFloat(args[6]);
                        Entity entity = player.getLocation().getWorld().spawnEntity(new Location(w, x, y, z, yaw, pitch), EntityType.VILLAGER);
                        LivingEntity lEntity = (LivingEntity) entity;
                        lEntity.setAI(false);
                        lEntity.setSilent(true);
                        lEntity.addScoreboardTag(player.getName() + args[7]);

                        ActiveModel activeModel = ModelEngineAPI.api.getModelManager().createActiveModel(args[1]);
                        ModeledEntity modeledEntity = ModelEngineAPI.api.getModelManager().createModeledEntity(entity);
                        modeledEntity.addActiveModel(activeModel);

                        modeledEntity.detectPlayers();
                        modeledEntity.setInvisible(true);

                        activeModel.addState("idle", 2, 2, 1);
                        for (Player plr : Bukkit.getOnlinePlayers()) {
                            modeledEntity.removePlayer(plr);
                        }
                        modeledEntity.addPlayer(player);
                    } else if (args[0].equalsIgnoreCase("State")) {
                        for (Entity entity : player.getWorld().getEntities()) {
                            if (entity.getScoreboardTags().contains(player.getName() + args[1])) {
                                if (args[3].equalsIgnoreCase("Idle")) {
                                    ActiveModel activeModel = ModelEngineAPI.api.getModelManager().getModeledEntity(entity.getUniqueId()).getActiveModel(args[2]);
                                    activeModel.removeState("walk", true);
                                    activeModel.addState(args[3], 2, 2, 1);
                                    activeModel.getState(args[3]);
                                } else {
                                    ActiveModel activeModel = ModelEngineAPI.api.getModelManager().getModeledEntity(entity.getUniqueId()).getActiveModel(args[2]);
                                    activeModel.addState(args[3], 2, 2, 1);
                                    activeModel.getState(args[3]);
                                }

                            }
                        }
                    } else if (args[0].equalsIgnoreCase("Remove")) {
                        for (Entity entity : player.getWorld().getEntities()) {
                            if (entity.getScoreboardTags().contains(player.getName() + args[1])) {
                                entity.teleport(new Location(player.getWorld(), 1, 1, 1));
                                entity.remove();
                            }
                        }
                    } else {
                        player.sendMessage(ChatColor.AQUA + "Commands Info : ");
                        player.sendMessage(ChatColor.RED + "/meghider Spawn [<MOB>] [<X>] [<Y>] [<Z>] [<YA>] [<PI>] [<SAVENAME>]");
                        player.sendMessage(ChatColor.RED + "/meghider Remove [<SAVENAME>]");
                        player.sendMessage(ChatColor.RED + "/meghider State [<SAVENAME>] [<MOB>] [<STATE>]");
                    }
                }
            } else {
                player.sendMessage(ChatColor.RED + "Nah Don't use this");
            }
        }
        else{
            System.out.println(ChatColor.RED + "MegHider > Can't Use For now");
        }
        return false;
    }
}
