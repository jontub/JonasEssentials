/*

    JonasEssentials, adds basic commands that can be usefull
    Copyright (C) <year>  <name of author>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

*/
package de.jonas3d.jonasEssentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHealthCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (p.isHealthScaled()) {p.setHealthScaled(false);}
                p.setHealth(1);
                p.setMaxHealth(20);
            }
            sender.sendMessage(ChatColor.GREEN + "You have changed the Health of All Players to default");
        } else if (args.length == 1) {
            Integer i = Integer.parseInt(args[0]);
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (p.isHealthScaled()) {p.setHealthScaled(false);}
                p.setHealth(1);
                p.setMaxHealth(i);
            }
            sender.sendMessage(ChatColor.GREEN + "You have changed the Health of All Players to " + i);
        }
        return false;
    }
}
