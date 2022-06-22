package net.yenil.itemunbreakable.utility;

import org.bukkit.ChatColor;

public class ChatUtils {

    public static String color(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }
}
