package com.mayhemteam.murilinho145.registry.custom.features;

import com.mayhemteam.murilinho145.MayhemTweaks;
import com.mayhemteam.murilinho145.registry.blocks.BlockRegistry;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class EvaTree {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> EVA_TREE = ConfiguredFeatures.register("eva_tree", Feature.TREE,
            // Configure the feature using the builder
            new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BlockRegistry.EVA_LOG), // Trunk block provider
                    new StraightTrunkPlacer(8, 3, 0), // places a straight trunk
                    BlockStateProvider.of(BlockRegistry.EVA_LEAVES), // Foliage block provider
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3), // places leaves as a blob (radius, offset from trunk, height)
                    new TwoLayersFeatureSize(1, 0, 1) // The width of the tree at different layers; used to see how tall the tree can be without clipping into blocks
            ).build());

    public static final RegistryEntry<PlacedFeature> EVA_CHECK = PlacedFeatures.register("eva_tree_check",
        EVA_TREE, List.of(PlacedFeatures.wouldSurvive(BlockRegistry.EVA_SAPLING)));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> EVA_TREE_SPAWN =
            ConfiguredFeatures.register("eva_tree_spawn",
                    Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(
                            List.of(new RandomFeatureEntry(EVA_CHECK, 0.5f)
                            ),
            EVA_CHECK));



    public static void registryFeature() {
        MayhemTweaks.LOGGER.info("Registering Features");
    }
}
