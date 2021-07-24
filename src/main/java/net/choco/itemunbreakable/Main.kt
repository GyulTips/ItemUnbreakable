package net.choco.itemunbreakable

import me.mattstudios.mf.base.CommandManager
import net.choco.itemunbreakable.command.ItemUnbreakableCommand
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    private var commandManager: CommandManager? = null
    override fun onEnable() {
        commandManager = CommandManager(this)
        commandManager!!.register(ItemUnbreakableCommand())
    }
}