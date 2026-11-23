
package p.zsanchez;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

public class PluginCommands {

    public static LiteralArgumentBuilder<CommandSourceStack> create() {

        LiteralArgumentBuilder<CommandSourceStack> root =
                Commands.literal("plugin1");

        return root;
    }
}
