package com.mayhemteam.murilinho145.screens;

import com.mayhemteam.murilinho145.registry.screen.ScreensRegistries;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class ScreensRegistry {
    public static void register() {
        HandledScreens.register(ScreensRegistries.SEWING_SCREEN_HANDLER, SewingScreen::new);
    }
}
