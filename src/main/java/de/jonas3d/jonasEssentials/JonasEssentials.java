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

package de.jonas3d.jonasEssentials;

import de.jonas3d.jonasEssentials.commands.*;
import de.jonas3d.jonasEssentials.commands.tab.*;
import de.jonas3d.jonasEssentials.utils.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class JonasEssentials extends JavaPlugin {

    private boolean instaDeathEnabled = false;

    public boolean isInstaDeathEnabled() {
        return instaDeathEnabled;
    }

    public void toggleInstaDeath() {
        instaDeathEnabled = !instaDeathEnabled;
    }

    @Override
    public void onEnable() {
        getCommand("instadeath").setExecutor(new InstaKillDamageCommand(this));
        getServer().getPluginManager().registerEvents(new InstaDeathListener(this), this);
        getCommand("sethealth").setExecutor(new SetHealthCommand());
        getCommand("jonasessentials").setExecutor(new InfoCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("sudo").setExecutor(new SudoCommand());
        getCommand("smite").setExecutor(new SmiteCommand());
        getCommand("killall").setExecutor(new KillAllCommand());
        getCommand("killall").setTabCompleter(new KillAllTab());
    }
    @Override
    public void onDisable() {

    }


}
