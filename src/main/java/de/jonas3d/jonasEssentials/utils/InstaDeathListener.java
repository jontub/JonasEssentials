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

package de.jonas3d.jonasEssentials.utils;

import de.jonas3d.jonasEssentials.JonasEssentials;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class InstaDeathListener implements Listener {
    private final JonasEssentials plugin;

    public InstaDeathListener(JonasEssentials plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event) {
        if (!plugin.isInstaDeathEnabled()) return;
        if (event.getEntity() instanceof Player) {
            Player p = (Player) event.getEntity();
            p.setHealth(0);

        }
    }
}



