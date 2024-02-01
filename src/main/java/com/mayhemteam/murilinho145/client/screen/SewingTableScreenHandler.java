package com.mayhemteam.murilinho145.client.screen;

import com.mayhemteam.murilinho145.registry.screen.ScreensServer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class SewingTableScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    public SewingTableScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(11));
    }
    public SewingTableScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(ScreensServer.SEWING_TABLE_SCREEN, syncId);
        checkSize(inventory, 11);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        int m;
        int l;
        this.addSlot(new Slot(inventory, 0, 18, 17));
        this.addSlot(new Slot(inventory, 1, 18, 35));
        this.addSlot(new Slot(inventory, 2, 18, 53));
        this.addSlot(new Slot(inventory, 3, 54, 17));
        this.addSlot(new Slot(inventory, 4, 54, 17));
        this.addSlot(new Slot(inventory, 5, 54, 35));
        this.addSlot(new Slot(inventory, 6, 54, 53));
        this.addSlot(new Slot(inventory, 7, 72, 17));
        this.addSlot(new Slot(inventory, 8, 72, 35));
        this.addSlot(new Slot(inventory, 9, 72, 53));
        this.addSlot(new Slot(inventory, 10, 108, 53));
        this.addSlot(new Slot(inventory, 11, 134, 23));
        for (m = 0; m < 3; ++m) {
            for (l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + m * 12 + 12, 8 + l * 18, 84 + m * 18));
            }
        }
        //The player Hotbar
        for (m = 0; m < 9; ++m) {
            this.addSlot(new Slot(playerInventory, m, 8 + m * 18, 142));
        }

    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }
}
