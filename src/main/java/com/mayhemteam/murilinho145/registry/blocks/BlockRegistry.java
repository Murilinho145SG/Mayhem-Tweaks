package com.mayhemteam.murilinho145.registry.blocks;

import com.mayhemteam.murilinho145.registry.blocks.properties.EvaSaplin;
import com.mayhemteam.murilinho145.registry.blocks.properties.EvaSapling;
import com.mayhemteam.murilinho145.registry.blocks.properties.EvaStairsBlock;
import com.mayhemteam.murilinho145.registry.blocks.properties.EvaTrapdoorBlock;
import com.mayhemteam.murilinho145.registry.groups.Groups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class BlockRegistry {
    private static final FabricBlockSettings EVA_SETTINGS = FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool();
    private static final Item.Settings EVA_PROPERTIES = new Item.Settings().group(Groups.NATURETAB);
    public static final BarrelBlock EVA_BARREL = new BarrelBlock(EVA_SETTINGS);
    public static final Block EVA_BOOKSHELF = new Block(EVA_SETTINGS);
    public static final Block EVA_FENCE = new FenceBlock(EVA_SETTINGS);
    public static final Block EVA_FENCE_GATE = new FenceGateBlock(EVA_SETTINGS);
    public static final LeavesBlock EVA_LEAVES = new LeavesBlock(FabricBlockSettings.of(Material.LEAVES).sounds(BlockSoundGroup.GRASS).strength(1.5f));
    public static final Block EVA_LOG = new PillarBlock(EVA_SETTINGS);
    public static final Block EVA_WOOD = new PillarBlock(EVA_SETTINGS);
    public static final Block STRIPPED_EVA_LOG = new PillarBlock(EVA_SETTINGS);
    public static final Block STRIPPED_EVA_WOOD = new PillarBlock(EVA_SETTINGS);
    public static final Block EVA_PLANKS = new Block(EVA_SETTINGS);
    public static final SaplingBlock EVA_SAPLING = new EvaSaplin(new EvaSapling(), FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.GRASS).strength(1.5f).nonOpaque());
    public static final SlabBlock EVA_SLAB = new SlabBlock(EVA_SETTINGS);
    public static final StairsBlock EVA_STAIRS = new EvaStairsBlock(EVA_PLANKS.getDefaultState(), EVA_SETTINGS);
    public static final TrapdoorBlock EVA_TRAPDOOR = new EvaTrapdoorBlock(EVA_SETTINGS);



    public static void registryBlock() {
        BlockUtils.registryBlock("eva_barrel", EVA_BARREL, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_bookshelf", EVA_BOOKSHELF, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_fence", EVA_FENCE, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_fence_gate", EVA_FENCE_GATE, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_leaves", EVA_LEAVES, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_log", EVA_LOG, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_wood", EVA_WOOD, EVA_PROPERTIES);
        BlockUtils.registryBlock("stripped_eva_log", STRIPPED_EVA_LOG, EVA_PROPERTIES);
        BlockUtils.registryBlock("stripped_eva_wood", STRIPPED_EVA_WOOD, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_planks", EVA_PLANKS, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_sapling", EVA_SAPLING, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_slab", EVA_SLAB, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_stairs", EVA_STAIRS, EVA_PROPERTIES);
        BlockUtils.registryBlock("eva_trapdoor", EVA_TRAPDOOR, EVA_PROPERTIES);
    }
}
