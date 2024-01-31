package com.mayhemteam.murilinho145.registry.custom.features;

import com.mayhemteam.murilinho145.registry.blocks.BlockRegistry;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class EvaTree {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig,?>> EVA_TREE =
            ConfiguredFeatures.register("eva_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BlockRegistry.EVA_LOG),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.of(BlockRegistry.EVA_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1,0,2)
            ).forceDirt().build());
}
