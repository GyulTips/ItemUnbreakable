package net.yenil.itemunbreakable.command;

import me.mattstudios.mf.annotations.Command;
import me.mattstudios.mf.annotations.Default;
import me.mattstudios.mf.annotations.Permission;
import me.mattstudios.mf.annotations.SubCommand;
import me.mattstudios.mf.base.CommandBase;
import net.yenil.itemunbreakable.utility.ChatUtils;
import net.yenil.itemunbreakable.utility.ItemUtils;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@Command("iu")
public class ItemUnbreakableCommand extends CommandBase {

    @Default
    public void defaultCommand(CommandSender sender) {
        sender.sendMessage(ChatUtils.color("&a/iu addunbreakable"));
    }

    @SubCommand("addunbreakable")
    @Permission("itemunbreakable.addunbreakable")
    public void addUnbreakableCommand(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack itemStack = player.getInventory().getItem(player.getInventory().getHeldItemSlot());
            if (itemStack == null || itemStack.getType() == Material.AIR) {
                sender.sendMessage(ChatUtils.color("&cInvalid Item!"));
                return;
            }
            itemStack = ItemUtils.setUnbreakable(itemStack, true);
            player.getInventory().setItem(player.getInventory().getHeldItemSlot(), itemStack);
        }
    }
}
