package de.jonas3d.jonasEssentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Level;


public class FlyCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0) {
            if (sender.hasPermission("jonasessentials.fly")) {
                Player p = (Player) sender;
                p.setAllowFlight(!p.getAllowFlight());
                sender.sendMessage((p.getAllowFlight() ? "§a" : "§c") + "You have " + (p.getAllowFlight() ? "enabled" : "disabled") + " fly for Yourself");
            }
        }
        if (args.length == 1) {
            if (sender.hasPermission("jonasessentials.fly.others")) {
                Player p;
                try {
                    p = Bukkit.getPlayer(args[0]);
                    p.setAllowFlight(!p.getAllowFlight());
                    sender.sendMessage((p.getAllowFlight() ? "§a" : "§c") + "You have " + (p.getAllowFlight() ? "enabled" : "disabled") + "fly for " + p.getDisplayName());
                } catch (IllegalArgumentException e) {
                    Bukkit.getLogger().log(Level.WARNING, e.getMessage());
                }


            }
        }


        return false;
    }
}
