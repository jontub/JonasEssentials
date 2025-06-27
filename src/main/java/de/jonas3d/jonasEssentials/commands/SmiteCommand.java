package de.jonas3d.jonasEssentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class SmiteCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "I need a player!!!!");
            return true;
        }
        Player smiting = Bukkit.getPlayer(args[0]);
        if (smiting == null) {
            sender.sendMessage(ChatColor.RED + "That player is not online!");
            return true;
        }
        World w = smiting.getWorld();
        Location loc = smiting.getLocation();
        loc.setY(loc.getY() + 1);
        w.strikeLightning(loc);
        return true;
    }
}
