package com.mayhemteam.murilinho145.registry.screen;

import com.mayhemteam.murilinho145.Utils;
import com.mayhemteam.murilinho145.client.screen.SewingTableScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

public class ScreensServer {
    //public static final ScreenHandlerType<SewingTableScreenHandler> SEWING_TABLE_SCREEN = new ExtendedScreenHandlerType<>(SewingTableScreenHandler::new);

    public static ScreenHandlerType<SewingTableScreenHandler> SEWING_TABLE_SCREEN;
    public static void registryScreens() {
        Registry.register(Registry.SCREEN_HANDLER, Utils.myId("sewing_table"), SEWING_TABLE_SCREEN);
        //ScreenHandlerRegistry.registerSimple(Utils.myId("sewing_table"), SewingTableScreenHandler::new);
    }
}
