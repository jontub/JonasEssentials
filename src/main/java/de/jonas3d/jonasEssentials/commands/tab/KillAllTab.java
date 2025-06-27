package de.jonas3d.jonasEssentials.commands.tab;

import org.bukkit.command.*;

import java.util.ArrayList;
import java.util.List;

public class KillAllTab implements TabCompleter {
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hostile");
        list.add("players");
        list.add("items");
        list.add("arrows");
        list.add("boats");
        list.add("tridents");
        return list;


    }
}
