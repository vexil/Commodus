/*
 * This file is part of Commodus.
 *
 * SimpleUtils is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SimpleUtils is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Commodus.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.dsh105.commodus.logging;

import org.bukkit.ChatColor;

public enum Level {

    INFO(" [INFO] "),
    NORMAL(ChatColor.GREEN + " [INFO] "),
    SEVERE(ChatColor.RED + " [SEVERE] "),
    WARNING(ChatColor.RED + " [WARNING] ");

    private String prefix;

    Level(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}