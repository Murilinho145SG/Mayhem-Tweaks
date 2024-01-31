package com.mayhemteam.murilinho145.registry.blocks;

import com.mayhemteam.murilinho145.Utils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class BlockUtils {
    public static Block otherRegistryBlock(FabricBlockSettings settings) {
        Block block;
        block = new Block(settings);
        return block;
    }
    public static BlockItem registryBlockItem(Block block, Item.Settings settings) {
        BlockItem item;
        item = new BlockItem(block, settings);
        return item;
    }
    public static void registryBlock(String id, Block block, Item.Settings settings) {
        Utils.registry("block", Utils.myId(id), block);
        Registry.register(Registry.ITEM, Utils.myId(id), registryBlockItem(block, settings));
    }
}
