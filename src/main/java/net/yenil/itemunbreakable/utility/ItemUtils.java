package net.yenil.itemunbreakable.utility;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Method;

public class ItemUtils {

    public static ItemStack setUnbreakable(ItemStack itemstack, boolean unbreakable) {
        ItemMeta meta = itemstack.getItemMeta();
        try {
            Method metaSpigot = ItemMeta.class.getDeclaredMethod("spigot");
            Method setUnbreakable = metaSpigot.getReturnType().getDeclaredMethod("setUnbreakable", boolean.class);
            Object spigot = metaSpigot.invoke(meta);
            setUnbreakable.invoke(spigot, unbreakable);
        } catch (Exception ex) {
            meta.setUnbreakable(unbreakable);
        }
        itemstack.setItemMeta(meta);
        return itemstack;
    }
}
