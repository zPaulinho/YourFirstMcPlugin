package p.zsanchez;

import org.bukkit.plugin.java.JavaPlugin;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;

public class Plugin1 extends JavaPlugin {

    @Override
    public void onEnable(){
        // Código al íniciar el plugin

        // Registrador de comandos
        this.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, event -> {
            event.registrar().register(PluginCommands.createCommand());
        });
    }

    @Override
    public void onDisable(){
        // Código al desactivar el plugin

    }
}
