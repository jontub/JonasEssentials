package de.jonas3d.jonasEssentials.commands;

import de.jonas3d.jonasEssentials.JonasEssentials;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class InstaKillDamageCommand implements CommandExecutor {
    private final JonasEssentials plugin;

    public InstaKillDamageCommand(JonasEssentials plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        plugin.toggleInstaDeath();
        sender.sendMessage( "§a§lInsta Death Has been " + (plugin.isInstaDeathEnabled() ? "enabled" : "disabled"));
        return true;
    }
}
