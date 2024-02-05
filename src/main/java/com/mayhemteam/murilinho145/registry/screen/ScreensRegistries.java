package com.mayhemteam.murilinho145.registry.screen;

import com.mayhemteam.murilinho145.libs.Utils;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.ScreenHandlerType;


public class ScreensRegistries {
    public static final ScreenHandlerType<SewingTableScreenHandler> SEWING_SCREEN_HANDLER = ScreenHandlerRegistry.registerExtended(Utils.myId("sewing_table"), SewingTableScreenHandler::new);
    public static void register() {

    }

}
