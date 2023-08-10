package com.murilinho145.mayhemtweaks.registries;

import com.murilinho145.mayhemtweaks.features.Scanner;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.murilinho145.mayhemtweaks.MayhemTweaks;

import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class DeferredRegistries {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        MayhemTweaks.MODID);

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        MayhemTweaks.MODID);
        public static final RegistryObject<Item> CraftItem(String item, int durability) {
                return ITEMS.register(item, () -> new Item(new Item.Properties().durability(durability)));
        }

        public static final RegistryObject<Item> Register(String item) {
                return ITEMS.register(item, () -> new Item(new Item.Properties()));
        }

        public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supplier, Item.Properties prop) {
                RegistryObject<T> block = BLOCKS.register(name, supplier);
                ITEMS.register(name, () -> new BlockItem(block.get(), prop));
                return block;
        }

        // With Durability
        public static final RegistryObject<Item> ZINC_HAMMER = CraftItem("zinc_hammer", 128);

        public static final RegistryObject<Item> WOOD_HAMMER = CraftItem("wooden_hammer", 32);

        public static final RegistryObject<Item> STEEL_HAMMER = CraftItem("steel_hammer", 1024);

        public static final RegistryObject<Item> PLIERS = CraftItem("pliers", 250);

        public static final RegistryObject<Item> KNIFE = CraftItem("knife", 100);

        public static final RegistryObject<Item> SAW = CraftItem("saw", 300);

        public static final RegistryObject<Item> SCREWDRIVER = CraftItem("screwdriver", 500);

        public static final RegistryObject<Item> CUTTER = CraftItem("wire_cutter", 230);

        public static final RegistryObject<Item> WRENCH = CraftItem("wrench", 600);

        // Registries
        public static final RegistryObject<Item> TREATED_LEATHER = Register("treated_leather");

        public static final RegistryObject<Item> SEWING_NEEDLE = Register("sewing_needle");

        public static final RegistryObject<Item> SPOOL_OF_THREAD = Register("spool_of_thread");

        public static final RegistryObject<Item> ETHER_FRAGMENT = ITEMS.register("ether_fragment",
                        () -> new Item(new Item.Properties().stacksTo(16)));

        public static final RegistryObject<Item> PLASMATIC_ALLOY = Register("plasmatic_alloy");

        public static final RegistryObject<Item> INDUCTOR_CORE = Register("inductor_core");

        public static final RegistryObject<Item> INDUCTOR = Register("inductor");

        public static final RegistryObject<Item> CAPACITOR_ELECTROLYTIC = Register("capacitor_electrolytic");

        public static final RegistryObject<Item> CAPACITOR_CERAMIC = Register("capacitor_ceramic");

        public static final RegistryObject<Item> SOLDERING_IRON = ITEMS.register("soldering_iron",
                () -> new Scanner(new Item.Properties().durability(100)));
        public static final RegistryObject<Item> MAHEMIO_ALLOY = Register("mahemio_alloy");
        public static final RegistryObject<Item> MAHEMIO_CLUMP = Register("mahemio_clump");
        public static final RegistryObject<Item> MAHEMIO_CRYSTAL = Register("mahemio_crystal");
        public static final RegistryObject<Item> MAHEMIO_DIRTY_DUST = Register("mahemio_dirty_dust");
        public static final RegistryObject<Item> MAHEMIO_DUST = Register("mahemio_dust");
        public static final RegistryObject<Item> MAHEMIO_FRAGMENT = Register("mahemio_fragment");
        public static final RegistryObject<Item> MAHEMIO_GEAR = Register("mahemio_gear");
        public static final RegistryObject<Item> MAHEMIO_GRAVEL = Register("mahemio_gravel");
        public static final RegistryObject<Item> MAHEMIO_INGOT = Register("mahemio_ingot");
        public static final RegistryObject<Item> MAHEMIO_PLATE = Register("mahemio_plate");
        public static final RegistryObject<Item> MAHEMIO_RAW = Register("raw_mahemio");
        public static final RegistryObject<Item> MAHEMIO_ROD = Register("mahemio_rod");
        public static final RegistryObject<Item> MAHEMIO_SHARD = Register("mahemio_shard");
        public static final RegistryObject<Item> MAHEMIO_WIRE = Register("mahemio_wire");
        public static final RegistryObject<Block> MAHEMIO_BLOCK = BLOCKS.register("mahemio_block",
                () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(9f).sound(SoundType.METAL)));
         public static final RegistryObject<Item> MAHEMIO_BLOCKITEM = ITEMS.register("mahemio_block",
         () -> new BlockItem(MAHEMIO_BLOCK.get(), new Item.Properties()));
        public static final RegistryObject<Item> RESISTOR_ALUMINUM = Register("resistor_aluminum");
        public static final RegistryObject<Item> RESISTOR_ANTIMONY = Register("resistor_antimony");
        public static final RegistryObject<Item> RESISTOR_BISMUTH = Register("resistor_bismuth");
        public static final RegistryObject<Item> RESISTOR_CHROMIUM = Register("resistor_chromium");
        public static final RegistryObject<Item> RESISTOR_COBALT = Register("resistor_cobalt");
        public static final RegistryObject<Item> RESISTOR_COPPER = Register("resistor_copper");
        public static final RegistryObject<Item> RESISTOR_GOLD = Register("resistor_gold");
        public static final RegistryObject<Item> RESISTOR_LITHIUM = Register("resistor_lithium");
        public static final RegistryObject<Item> RESISTOR_MAHEMIO = Register("resistor_mahemio");
        public static final RegistryObject<Item> RESISTOR_MANGANESE = Register("resistor_manganese");
        public static final RegistryObject<Item> RESISTOR_MERCURY = Register("resistor_mercury");
        public static final RegistryObject<Item> RESISTOR_NICKEL = Register("resistor_nickel");
        public static final RegistryObject<Item> RESISTOR_POTASSIUM = Register("resistor_potassium");
        public static final RegistryObject<Item> RESISTOR_SILVER = Register("resistor_silver");
        public static final RegistryObject<Item> RESISTOR_SODIUM = Register("resistor_sodium");
        public static final RegistryObject<Item> RESISTOR_TIN = Register("resistor_tin");
        public static final RegistryObject<Item> RESISTOR_ZINC = Register("resistor_zinc");
        public static final RegistryObject<Item> HAMMER_HEAD = Register("hammer_head");
        public static final RegistryObject<Item> IRON_ROD = Register("iron_rod");
        public static final RegistryObject<Item> KNIFE_BLADE = Register("knife_blade");
        public static final RegistryObject<Item> PLIERS_HEAD = Register("pliers_head");
        public static final RegistryObject<Item> SAW_BLADE = Register("saw_blade");
        public static final RegistryObject<Item> STEEL_HAMMER_HEAD = Register("steel_hammer_head");
        public static final RegistryObject<Item> WIRE_CUTTER_BODY = Register("wire_cutter_body");
        public static final RegistryObject<Item> WOODEN_BAR = Register("wooden_bar");
        public static final RegistryObject<Item> WOODEN_HAMMER_HEAD = Register("wooden_hammer_head");
        public static final RegistryObject<Item> ZINC_ROD = Register("zinc_rod");
        public static final RegistryObject<Item> SANDPAPER = CraftItem("sandpaper", 5);
        public static final RegistryObject<Item> SANDPAPER_GOLD = CraftItem("sandpaper_gold", 15);
        public static final RegistryObject<Item> SANDPAPER_BRONZE = CraftItem("sandpaper_bronze", 30);
        public static final RegistryObject<Item> SANDPAPER_DIAMOND = CraftItem("sandpaper_diamond", 70);
        public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
                () -> new Scanner(new Item.Properties().durability(100)));
}