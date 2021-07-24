package net.choco.itemunbreakable.utility

import org.bukkit.ChatColor

object ChatUtils {
    fun color(input: String?): String {
        return ChatColor.translateAlternateColorCodes('&', input!!)
    }
}