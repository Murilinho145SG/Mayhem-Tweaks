package com.mayhemteam.murilinho145.registry.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class SewingTables extends ScreenHandler {
    private final Inventory inventory;
    public SewingTables(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(12));
    }

    public SewingTables(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(ScreensRegistries.SEWING_SCREEN_HANDLER, syncId);
        checkSize(inventory, 12);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);

        int i;
        int j;

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
        this.addSlot(new Slot(inventory, 11, 138, 27));



        for(i = 0; i < 3; ++i) {
            for(j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }

    }

    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    public ItemStack transferSlot(PlayerEntity player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = (Slot)this.slots.get(index);
        if (slot != null && slot.hasStack()) {
            ItemStack itemStack2 = slot.getStack();
            itemStack = itemStack2.copy();
            if (index < 12) {
                if (!this.insertItem(itemStack2, 12,48, true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(itemStack2, 0, 12, false)) {
                return ItemStack.EMPTY;
            }

            if (itemStack2.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }

            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTakeItem(player, itemStack2);
        }

        return itemStack;
    }

    public void close(PlayerEntity player) {
        super.close(player);
        this.inventory.onClose(player);
    }
}
