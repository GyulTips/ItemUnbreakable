package net.choco.itemunbreakable;

import me.mattstudios.mf.base.CommandManager;
import net.choco.itemunbreakable.command.ItemUnbreakableCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private CommandManager commandManager;

    public void onEnable() {
        commandManager = new CommandManager(this);
        commandManager.register(new ItemUnbreakableCommand());
    }
}
