package com.mayhemteam.murilinho145.registry.blocks.properties;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SewingTableBlock extends BlockWithEntity {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    protected static final VoxelShape SEWING_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D,16.0D,16.0D);
    public static EnumProperty<SewingTableType> SIDE = EnumProperty.of("model", SewingTableType.class);

    public SewingTableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        if (!world.isClient) {
            SewingTableType SewingTableModel = state.get(SIDE);
            if (SewingTableModel == SewingTableType.CENTER) {
                BlockPos blockPos = pos.offset(state.get(FACING).getOpposite().rotateYClockwise());
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.getBlock() == this) {
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                    world.addBlockBreakParticles(blockPos, blockState);
                }
            }
            if (SewingTableModel == SewingTableType.SIDE) {
                BlockPos blockPos = pos.offset(state.get(FACING).getOpposite().rotateYCounterclockwise());
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.getBlock() == this) {
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                    world.addBlockBreakParticles(blockPos, blockState);
                }
            }
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (!world.isClient) {
            BlockPos blockPos = pos.offset(state.get(FACING).getOpposite().rotateYCounterclockwise());
            if (world.getBlockState(blockPos).getBlock() == Blocks.AIR) {
                world.setBlockState(blockPos, state.with(SIDE, SewingTableType.CENTER));
                world.updateNeighbors(pos, Blocks.AIR);
                world.updateNeighbors(blockPos, Blocks.AIR);
            }
        }
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, SIDE);
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite()).with(SIDE, SewingTableType.SIDE);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SEWING_SHAPE;
            case SOUTH:
                return SEWING_SHAPE;
            case WEST:
                return SEWING_SHAPE;
            case EAST:
                return SEWING_SHAPE;
            default:
                return SEWING_SHAPE;
        }
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }

        return ActionResult.SUCCESS;
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new SewingTableEntity(blockPos, blockState);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity be = world.getBlockEntity(pos);

            if (be instanceof Inventory) {
                ItemScatterer.spawn(world, pos, (Inventory) be);
                world.updateComparators(pos, this);
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }


    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
    }

    public enum SewingTableType implements StringIdentifiable {
        CENTER, SIDE;

        @Override
        public String toString() {
            return this.asString();
        }

        @Override
        public String asString() {
            return this == SIDE ? "center" : "side";
        }
    }
}

