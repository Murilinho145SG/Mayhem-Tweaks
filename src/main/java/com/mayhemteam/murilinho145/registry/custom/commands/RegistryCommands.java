package com.mayhemteam.murilinho145.registry.custom.commands;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class RegistryCommands {
    public static void CommandRegistry() {
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> DevRule.DevModeCommand(dispatcher)));
    }
}
