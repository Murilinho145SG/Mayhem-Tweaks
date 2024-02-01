package com.mayhemteam.murilinho145;

import com.mayhemteam.murilinho145.blocks.render.registry.Render;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class MayhemTweaksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Render.registryRender();
    }
}
