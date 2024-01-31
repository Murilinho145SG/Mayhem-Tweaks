package com.mayhemteam.murilinho145.registry.blocks.properties;

import com.mayhemteam.murilinho145.registry.blocks.BlockRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;

public class Woods {
    public static void registerStripped() {
        StrippableBlockRegistry.register(BlockRegistry.EVA_LOG, BlockRegistry.STRIPPED_EVA_LOG);
        StrippableBlockRegistry.register(BlockRegistry.EVA_WOOD, BlockRegistry.STRIPPED_EVA_WOOD);
    }
    public static void registerWoods() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(BlockRegistry.EVA_LEAVES, 5,5);
        registry.add(BlockRegistry.EVA_PLANKS,5,5);
        registry.add(BlockRegistry.EVA_WOOD,5,5);
        registry.add(BlockRegistry.STRIPPED_EVA_WOOD,5,5);
        registry.add(BlockRegistry.STRIPPED_EVA_LOG,5,5);
        registry.add(BlockRegistry.EVA_LOG,5,5);
    }
}
