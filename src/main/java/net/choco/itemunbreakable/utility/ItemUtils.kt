package net.choco.itemunbreakable.utility

import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

object ItemUtils {
    fun setUnbreakable(itemstack: ItemStack, unbreakable: Boolean): ItemStack {
        val meta = itemstack.itemMeta
        try {
            val metaSpigot = ItemMeta::class.java.getDeclaredMethod("spigot")
            val setUnbreakable =
                metaSpigot.returnType.getDeclaredMethod("setUnbreakable", Boolean::class.javaPrimitiveType)
            val spigot = metaSpigot.invoke(meta)
            setUnbreakable.invoke(spigot, unbreakable)
        } catch (ex: Exception) {
            meta!!.isUnbreakable = unbreakable
        }
        itemstack.itemMeta = meta
        return itemstack
    }
}