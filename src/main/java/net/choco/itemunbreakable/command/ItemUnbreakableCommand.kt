package net.choco.itemunbreakable.command

import me.mattstudios.mf.annotations.Command
import me.mattstudios.mf.annotations.Default
import me.mattstudios.mf.annotations.Permission
import me.mattstudios.mf.annotations.SubCommand
import me.mattstudios.mf.base.CommandBase
import net.choco.itemunbreakable.utility.ChatUtils
import net.choco.itemunbreakable.utility.ItemUtils
import org.bukkit.Material
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Command("iu")
class ItemUnbreakableCommand : CommandBase() {
    @Default
    fun defaultCommand(sender: CommandSender) {
        sender.sendMessage(ChatUtils.color("&a/iu addunbreakable"))
    }

    @SubCommand("addunbreakable")
    @Permission("itemunbreakable.addunbreakable")
    fun addUnbreakableCommand(sender: CommandSender) {
        if (sender is Player) {
            val player = sender
            var itemStack = player.inventory.getItem(player.inventory.heldItemSlot)
            if (itemStack == null || itemStack.type == Material.AIR) {
                sender.sendMessage(ChatUtils.color("&cInvalid Item!"))
                return
            }
            itemStack = ItemUtils.setUnbreakable(itemStack, true)
            player.inventory.setItem(player.inventory.heldItemSlot, itemStack)
        }
    }
}