package com.murilinho145.mayhemtweaks;

import com.mojang.logging.LogUtils;
import com.murilinho145.mayhemtweaks.registries.DeferredRegistries;
import com.murilinho145.mayhemtweaks.registries.TabPut;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MayhemTweaks.MODID)
public class MayhemTweaks {
        // Define mod id in a common place for everything to reference
        public static final String MODID = "mayhemtweaks";
        // Directly reference a slf4j logger
        private static final Logger LOGGER = LogUtils.getLogger();

        public MayhemTweaks() {
                IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
                modEventBus.addListener(this::commonSetup);
                DeferredRegistries.BLOCKS.register(modEventBus);
                DeferredRegistries.ITEMS.register(modEventBus);
                TabPut.CREATIVE_MODE_TABS.register(modEventBus);
                MinecraftForge.EVENT_BUS.register(this);
                // modEventBus.addListener(this::addCreative);
        }

        private void commonSetup(final FMLCommonSetupEvent event) {
                // Some common setup code
                LOGGER.info("HELLO FROM COMMON SETUP");
        }

        // Add the example block item to the building blocks tab
        // private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        // event.accept(EXAMPLE_BLOCK_ITEM);
        // }

        // You can use SubscribeEvent and let the Event Bus discover methods to call
        @SubscribeEvent
        public void onServerStarting(ServerStartingEvent event) {
                // Do something when the server starts
                LOGGER.info("HELLO from server starting");
        }

        // You can use EventBusSubscriber to automatically register all static methods
        // in the class annotated with @SubscribeEvent
        @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
        public static class ClientModEvents {
                @SubscribeEvent
                public static void onClientSetup(FMLClientSetupEvent event) {
                        // Some client setup code
                        LOGGER.info("HELLO FROM CLIENT SETUP");
                        LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
                }
        }
}
