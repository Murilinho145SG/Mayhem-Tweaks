package com.mayhemteam.murilinho145.registry.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandlerType;

public class SewingTableScreenHandler extends SewingTables {

    public SewingTableScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(syncId, playerInventory);
    }

    public SewingTableScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(syncId, playerInventory, inventory);
    }

    @Override
    public ScreenHandlerType<?> getType() {
        return ScreensRegistries.SEWING_SCREEN_HANDLER;
    }
}