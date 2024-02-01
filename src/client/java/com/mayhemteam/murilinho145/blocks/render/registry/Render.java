package com.mayhemteam.murilinho145.blocks.render.registry;

import com.mayhemteam.murilinho145.registry.blocks.BlockRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class Render {
    private static void renderBlock(Block block, RenderLayer render) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, render);
    }

    public static void registryRender() {
        renderBlock(BlockRegistry.EVA_LEAVES, RenderLayer.getCutout());
        renderBlock(BlockRegistry.EVA_TRAPDOOR, RenderLayer.getCutout());
        renderBlock(BlockRegistry.EVA_SAPLING, RenderLayer.getCutout());
    }
}
