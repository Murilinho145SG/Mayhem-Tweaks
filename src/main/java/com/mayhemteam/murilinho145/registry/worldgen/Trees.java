package com.mayhemteam.murilinho145.registry.worldgen;

import com.mayhemteam.murilinho145.MayhemTweaks;
import com.mayhemteam.murilinho145.registry.custom.features.EvaTree;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class Trees {
    public static final RegistryEntry<PlacedFeature> EVA_PLACED = PlacedFeatures.register("eva_placed",
            EvaTree.EVA_TREE_SPAWN,
            VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.01f, 1)));

    public static void registryWorldGen() {
        MayhemTweaks.LOGGER.info("Registering WorldGen");
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS), GenerationStep.Feature.VEGETAL_DECORATION, EVA_PLACED.getKey().get());
    }
}
