package p.zsanchez;

import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

public class PluginCommands {

    public static LiteralCommandNode<CommandSourceStack> createCommand() {

        // Comando principal
        return Commands.literal("plugin1")
                .then(Commands.literal("help"))
                .then(Commands.literal("reload"))
                .build();

    }
}
