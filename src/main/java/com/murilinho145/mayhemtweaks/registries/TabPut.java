package com.murilinho145.mayhemtweaks.registries;

import com.murilinho145.mayhemtweaks.MayhemTweaks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabPut {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
                        .create(Registries.CREATIVE_MODE_TAB, MayhemTweaks.MODID);

        public static final RegistryObject<CreativeModeTab> MAYHEMTAB = CREATIVE_MODE_TABS.register("atlastweakstab",
                () -> CreativeModeTab.builder()
                        .withTabsBefore(CreativeModeTabs.COMBAT)
                        .icon(() -> DeferredRegistries.ZINC_HAMMER.get().getDefaultInstance())
                        .title(Component.translatable("creativetab.mayhemtab"))
                        .displayItems((parameters, output) -> {
                            output.accept(DeferredRegistries.ZINC_HAMMER.get());
                            output.accept(DeferredRegistries.WOOD_HAMMER.get());
                            output.accept(DeferredRegistries.STEEL_HAMMER.get());
                            output.accept(DeferredRegistries.PLIERS.get());
                            output.accept(DeferredRegistries.KNIFE.get());
                            output.accept(DeferredRegistries.SAW.get());
                            output.accept(DeferredRegistries.SCREWDRIVER.get());
                            output.accept(DeferredRegistries.CUTTER.get());
                            output.accept(DeferredRegistries.WRENCH.get());
                            output.accept(DeferredRegistries.TREATED_LEATHER.get());
                            output.accept(DeferredRegistries.SEWING_NEEDLE.get());
                            output.accept(DeferredRegistries.SPOOL_OF_THREAD.get());
                            output.accept(DeferredRegistries.ETHER_FRAGMENT.get());
                            output.accept(DeferredRegistries.PLASMATIC_ALLOY.get());
                            output.accept(DeferredRegistries.INDUCTOR_CORE.get());
                            output.accept(DeferredRegistries.INDUCTOR.get());
                            output.accept(DeferredRegistries.CAPACITOR_ELECTROLYTIC.get());
                            output.accept(DeferredRegistries.CAPACITOR_CERAMIC.get());
                            output.accept(DeferredRegistries.SOLDERING_IRON.get());
                            output.accept(DeferredRegistries.MAHEMIO_ALLOY.get());
                            output.accept(DeferredRegistries.MAHEMIO_CLUMP.get());
                            output.accept(DeferredRegistries.MAHEMIO_CRYSTAL.get());
                            output.accept(DeferredRegistries.MAHEMIO_DIRTY_DUST.get());
                            output.accept(DeferredRegistries.MAHEMIO_DUST.get());
                            output.accept(DeferredRegistries.MAHEMIO_FRAGMENT.get());
                            output.accept(DeferredRegistries.MAHEMIO_GEAR.get());
                            output.accept(DeferredRegistries.MAHEMIO_GRAVEL.get());
                            output.accept(DeferredRegistries.MAHEMIO_INGOT.get());
                            output.accept(DeferredRegistries.MAHEMIO_PLATE.get());
                            output.accept(DeferredRegistries.MAHEMIO_RAW.get());
                            output.accept(DeferredRegistries.MAHEMIO_ROD.get());
                            output.accept(DeferredRegistries.MAHEMIO_SHARD.get());
                            output.accept(DeferredRegistries.MAHEMIO_WIRE.get());
                            output.accept(DeferredRegistries.MAHEMIO_BLOCKITEM.get());
                            output.accept(DeferredRegistries.RESISTOR_ALUMINUM.get());
                            output.accept(DeferredRegistries.RESISTOR_ANTIMONY.get());
                            output.accept(DeferredRegistries.RESISTOR_BISMUTH.get());
                            output.accept(DeferredRegistries.RESISTOR_COBALT.get());
                            output.accept(DeferredRegistries.RESISTOR_CHROMIUM.get());
                            output.accept(DeferredRegistries.RESISTOR_COPPER.get());
                            output.accept(DeferredRegistries.RESISTOR_GOLD.get());
                            output.accept(DeferredRegistries.RESISTOR_LITHIUM.get());
                            output.accept(DeferredRegistries.RESISTOR_MAHEMIO.get());
                            output.accept(DeferredRegistries.RESISTOR_MANGANESE.get());
                            output.accept(DeferredRegistries.RESISTOR_MERCURY.get());
                            output.accept(DeferredRegistries.RESISTOR_NICKEL.get());
                            output.accept(DeferredRegistries.RESISTOR_POTASSIUM.get());
                            output.accept(DeferredRegistries.RESISTOR_SILVER.get());
                            output.accept(DeferredRegistries.RESISTOR_SODIUM.get());
                            output.accept(DeferredRegistries.RESISTOR_TIN.get());
                            output.accept(DeferredRegistries.RESISTOR_ZINC.get());
                            output.accept(DeferredRegistries.HAMMER_HEAD.get());
                            output.accept(DeferredRegistries.IRON_ROD.get());
                            output.accept(DeferredRegistries.KNIFE_BLADE.get());
                            output.accept(DeferredRegistries.PLIERS_HEAD.get());
                            output.accept(DeferredRegistries.SAW_BLADE.get());
                            output.accept(DeferredRegistries.STEEL_HAMMER_HEAD.get());
                            output.accept(DeferredRegistries.WIRE_CUTTER_BODY.get());
                            output.accept(DeferredRegistries.WOODEN_BAR.get());
                            output.accept(DeferredRegistries.WOODEN_HAMMER_HEAD.get());
                            output.accept(DeferredRegistries.ZINC_ROD.get());
                            output.accept(DeferredRegistries.SANDPAPER.get());
                            output.accept(DeferredRegistries.SANDPAPER_GOLD.get());
                            output.accept(DeferredRegistries.SANDPAPER_BRONZE.get());
                            output.accept(DeferredRegistries.SANDPAPER_DIAMOND.get());
                            output.accept(DeferredRegistries.METAL_DETECTOR.get());
                        }).build());
}
