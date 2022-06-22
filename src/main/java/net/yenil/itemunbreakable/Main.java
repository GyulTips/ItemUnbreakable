package net.yenil.itemunbreakable;

import me.mattstudios.mf.base.CommandManager;
import net.yenil.itemunbreakable.command.ItemUnbreakableCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    protected CommandManager commandManager;

    public void onEnable() {
        commandManager = new CommandManager(this);
        commandManager.register(new ItemUnbreakableCommand());
    }
}
