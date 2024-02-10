package com.mayhemteam.murilinho145.registry.custom.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.world.GameRules;


public class DevRule {
    public static void DevModeCommand(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(LiteralArgumentBuilder.literal("devmode"))
                .createBuilder()
                .requires((source) -> {
                    return source.hasPermissionLevel(2);
                })
                .then(CommandManager.argument("boolean", BoolArgumentType.bool()).executes((ctx) -> {
                    return DevMode(ctx, BoolArgumentType.getBool(ctx, "boolean"));
                }))
                .build();
    }
    public static int DevMode(CommandContext<ServerCommandSource> ctx, boolean arg) {
        ServerCommandSource source = ctx.getSource();
        boolean doDay = source.getWorld().getGameRules().getBoolean(GameRules.DO_DAYLIGHT_CYCLE);
        boolean doWeather = source.getWorld().getGameRules().getBoolean(GameRules.DO_WEATHER_CYCLE);
        if (arg && (doWeather || doDay)) {
            source.getWorld().getGameRules().get(GameRules.DO_DAYLIGHT_CYCLE).set(false, source.getServer());
            source.getWorld().getGameRules().get(GameRules.DO_WEATHER_CYCLE).set(false, source.getServer());
            source.getPlayer().sendMessage(Text.translatable("devmode.mayhem.active"));
        }  else if (!doDay && !doWeather) {
            source.getPlayer().sendMessage(Text.translatable("devmode.mayhem.already"));
        } else {
            source.getWorld().getGameRules().get(GameRules.DO_DAYLIGHT_CYCLE).set(true, source.getServer());
            source.getWorld().getGameRules().get(GameRules.DO_WEATHER_CYCLE).set(true, source.getServer());
            source.getPlayer().sendMessage(Text.translatable("devmode.mayhem.disabled"));
        }

        return Command.SINGLE_SUCCESS;
    }

}
