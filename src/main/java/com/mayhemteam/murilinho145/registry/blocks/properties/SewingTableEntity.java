package com.mayhemteam.murilinho145.registry.blocks.properties;

import com.mayhemteam.murilinho145.registry.blocks.BlockEntityRegistry;
import com.mayhemteam.murilinho145.registry.screen.SewingTableScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;

public class SewingTableEntity extends LootableContainerBlockEntity implements ExtendedScreenHandlerFactory {
    private DefaultedList<ItemStack> items = DefaultedList.ofSize(size(), ItemStack.EMPTY);

    public SewingTableEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntityRegistry.SEWING_TABLE_ENTITY, blockPos, blockState);
    }

    @Override
    protected DefaultedList<ItemStack> getInvStackList() {
        return items;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {
        this.items = list;
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SewingTableScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public int size() {
        return 12;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(pos);
    }
}
