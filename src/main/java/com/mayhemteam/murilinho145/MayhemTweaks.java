package com.mayhemteam.murilinho145;

import com.mayhemteam.murilinho145.registry.blocks.BlockEntityRegistry;
import com.mayhemteam.murilinho145.registry.blocks.BlockRegistry;
import com.mayhemteam.murilinho145.registry.blocks.properties.Woods;
import com.mayhemteam.murilinho145.registry.custom.commands.RegistryCommands;
import com.mayhemteam.murilinho145.registry.custom.features.EvaTree;
import com.mayhemteam.murilinho145.registry.items.ItemRegistry;
import com.mayhemteam.murilinho145.registry.screen.ScreensRegistries;
import com.mayhemteam.murilinho145.registry.worldgen.Trees;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MayhemTweaks implements ModInitializer {
	public static final String MODID = "mayhemtweaks";
    public static final Logger LOGGER = LoggerFactory.getLogger("mayhemtweaks");
	@Override
	public void onInitialize() {
		LOGGER.info("Item Registration List");
		ItemRegistry.registerItem();
		LOGGER.info("Block Registration List");
		BlockRegistry.registryBlock();
		Woods.registerWoods();
		Woods.registerStripped();
		EvaTree.registryFeature();
		Trees.registryWorldGen();
		BlockEntityRegistry.register();
		ScreensRegistries.register();
		RegistryCommands.CommandRegistry();
	}

}