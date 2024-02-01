package com.mayhemteam.murilinho145.registry.blocks.properties;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;

import java.util.logging.Level;

public class SewingTableBlock extends Block {
    protected static final VoxelShape SEWINGTABLE_NORTH = Block.createCuboidShape(0, 0, 0,16,16,16);
    protected static final VoxelShape SEWINGTABLE_EAST = Block.createCuboidShape(0, 0, 0,16,16,16);
    protected static final VoxelShape SEWINGTABLE_WEST = Block.createCuboidShape(0, 0, 0,16,16,16);
    protected static final VoxelShape SEWINGTABLE_SOUTH = Block.createCuboidShape(0, 0, 0,16,16,16);

    public SewingTableBlock(Settings settings) {
        super(settings);
    }

    
}
