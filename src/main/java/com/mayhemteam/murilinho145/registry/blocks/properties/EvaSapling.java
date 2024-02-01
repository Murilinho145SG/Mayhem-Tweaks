package com.mayhemteam.murilinho145.registry.blocks.properties;

import com.mayhemteam.murilinho145.MayhemTweaks;
import com.mayhemteam.murilinho145.registry.custom.features.EvaTree;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class EvaSapling extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return EvaTree.EVA_TREE;
    }
}
