package com.murilinho145.mayhemtweaks.features;

import com.google.gson.JsonElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Scanner extends Item {
    private Configs blockScanner;
    public Scanner(Properties prop) {
        super(prop);
        try {
            blockScanner = new Configs(new File ("mayhemtweaks"), new File(Minecraft.getInstance().gameDirectory, "mayhemtweaks/scanner.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InteractionResult useOn(UseOnContext ContextUse) {
        if(!ContextUse.getLevel().isClientSide()) {
            BlockPos block = ContextUse.getClickedPos();
            Player player = ContextUse.getPlayer();
            Boolean found = false;

            for (int i = 0; i <= block.getY(); i++) {
                BlockState state = ContextUse.getLevel().getBlockState(block.below(i));

                if(isCorrectBlock(state)) {
                    outputValuableCoordinates(block.below(i), player, state.getBlock());
                    found = true;

                    break;
                }
            }
            if(!found) {
                player.sendSystemMessage(Component.literal("No valuables found"));
            }
        }
        ContextUse.getItemInHand().hurtAndBreak(1, ContextUse.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Found " + I18n.get(block.getDescriptionId()) + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"));
    }

    public boolean isCorrectBlock(BlockState state) {
        for (JsonElement s:blockScanner.jsonObject.getAsJsonArray("scannerConfigs")) {
            String[] blockId = s.getAsString().split(":");
            if (state.is(Objects.requireNonNull(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(blockId[0], blockId[1]))))) {
                return true;
            }
        }
        return false;
    }
}
