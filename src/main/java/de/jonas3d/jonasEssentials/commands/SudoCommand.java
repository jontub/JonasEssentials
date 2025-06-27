package de.jonas3d.jonasEssentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class SudoCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cPlease specify a Player to sudo");
            return false;
        } else if (args.length == 1) {
            sender.sendMessage("§cPlease specify a Message or Command to sudo");
            return false;
        } else if (args.length >= 2) {
            Player player = Bukkit.getPlayer(args[0]);
            if (player == null) {
                sender.sendMessage("Thats not a Player");
                return false;
            }
            String command = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
            if (command.startsWith("/")) {
                player.performCommand(command);
                sender.sendMessage("§cYou have sudoed§b " + player.getName()  + "§c to run:§b " + command);
            } else {
                player.chat(command);
                sender.sendMessage("§cYou have sudoed§b " + player.getName() + "§c to say:§b " + command);
            }

            return true;
        }

        return true;
    }
}
