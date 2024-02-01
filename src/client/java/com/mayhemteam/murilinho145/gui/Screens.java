package com.mayhemteam.murilinho145.gui;

import com.mayhemteam.murilinho145.client.screen.SewingTableScreenHandler;
import com.mayhemteam.murilinho145.registry.screen.ScreensServer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.GameRenderer;

public class Screens {
    public static void registryScreens() {
        HandledScreens.register(ScreensServer.SEWING_TABLE_SCREEN, SewingTableScreen::new);
    }
}
