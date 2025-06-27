package de.jonas3d.jonasEssentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class KillAllCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        for (Entity entity : Bukkit.getWorld("world").getEntities()) {
            if (entity.getType().equals(EntityType.ITEM) && args[0].equalsIgnoreCase("items")) {entity.remove();}
            else if (entity.getType().equals(EntityType.PLAYER) && args[0].equalsIgnoreCase("players")) {entity.remove();}
            else if (entity.getType().equals(EntityType.ARROW) && args[0].equalsIgnoreCase("arrows")) {entity.remove();}
            else if (entity.getType().equals(EntityType.BOAT) && args[0].equalsIgnoreCase("boats")) {entity.remove();}
            else if (entity.getType().equals(EntityType.TRIDENT) && args[0].equalsIgnoreCase("tridents")) {entity.remove();}
            else if (args[0].equalsIgnoreCase("hostile")) {
                if (entity.getType().equals(EntityType.ZOMBIE)) {entity.remove();}
                if (entity.getType().equals(EntityType.SPIDER)) {entity.remove();}
                if (entity.getType().equals(EntityType.SKELETON)) {entity.remove();}
                if (entity.getType().equals(EntityType.SLIME)) {entity.remove();}
                if (entity.getType().equals(EntityType.PHANTOM)) {entity.remove();}
                if (entity.getType().equals(EntityType.BREEZE)) {entity.remove();}
                if (entity.getType().equals(EntityType.CREEPER)) {entity.remove();}
            }
        }
        return true;
    }
}
