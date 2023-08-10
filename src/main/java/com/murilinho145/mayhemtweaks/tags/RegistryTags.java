package com.murilinho145.mayhemtweaks.tags;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class RegistryTags {
    public static final TagKey<Item> Atlas(String name) {
        return ItemTags.create(new ResourceLocation("mayhemtweaks", name));
    }
    public static final TagKey<Item> Forge(String name) {
        return ItemTags.create(new ResourceLocation("forge", name));
    }
    public static final TagKey<Item> Mek(String name) {
        return ItemTags.create(new ResourceLocation("mekanism", name));
    }
    public static final TagKey<Item> Bmg(String name) {
        return ItemTags.create(new ResourceLocation("bloodmagic", name));
    }
    public static final TagKey<Item> Create(String name) {
        return ItemTags.create(new ResourceLocation("create", name));
    }

    public static final TagKey<Item> CAPACITORS = Atlas("capacitors");
    public static final TagKey<Item> HAMMERS = Atlas("hammers");
    public static final TagKey<Item> INDUCTORS = Atlas("inductors");
    public static final TagKey<Item> TOOLS = Atlas("tools");
    public static final TagKey<Item> WRENCHS = Atlas("wrenchs");
    public static final TagKey<Item> INGOTS = Forge("ingots");
    public static final TagKey<Item> DUSTS = Forge("dusts");
    public static final TagKey<Item> RODS = Forge("rods");
    public static final TagKey<Item> RAWS = Forge("raw_materials");
    public static final TagKey<Item> WIRES = Forge("wires");
    public static final TagKey<Item> FRAGMENT = Bmg("fragments");
    public static final TagKey<Item> GRAVELS = Bmg("gravels");
    public static final TagKey<Item> GEARS = Forge("gears");
    public static final TagKey<Item> PLATES = Forge("plates");
    public static final TagKey<Item> CLUMPS = Mek("clumps");
    public static final TagKey<Item> CRYSTALS = Mek("crystals");
    public static final TagKey<Item> DIRTY_DUSTS = Mek("dirty_dusts");
    public static final TagKey<Item> SHARDS = Mek("shards");
    public static final TagKey<Item> MAHEMIO_INGOTS = Forge("ingots/mahemio");
    public static final TagKey<Item> MAHEMIO_DUSTS = Forge("dusts/mahemio");
    public static final TagKey<Item> MAHEMIO_RODS = Forge("rods/mahemio");
    public static final TagKey<Item> MAHEMIO_RAWS = Forge("raw_materials/mahemio");
    public static final TagKey<Item> MAHEMIO_WIRES = Forge("wires/mahemio");
    public static final TagKey<Item> MAHEMIO_FRAGMENT = Bmg("fragments/mahemio");
    public static final TagKey<Item> MAHEMIO_GRAVEL = Bmg("gravels/mahemio");
    public static final TagKey<Item> MAHEMIO_GEARS = Forge("gears/mahemio");
    public static final TagKey<Item> MAHEMIO_PLATES = Forge("plates/mahemio");
    public static final TagKey<Item> MAHEMIO_CLUMPS = Mek("clumps/mahemio");
    public static final TagKey<Item> MAHEMIO_CRYSTALS = Mek("crystals/mahemio");
    public static final TagKey<Item> MAHEMIO_DIRTY_DUSTS = Mek("dirty_dusts/mahemio");
    public static final TagKey<Item> MAHEMIO_SHARDS = Mek("shards/mahemio");
    public static final TagKey<Item> MAHEMIO_BLOCK_ITEM = Forge("storage_blocks/mahemio");
    public static final TagKey<Item> BLOCK = Forge("storage_blocks");
    public static final TagKey<Item> SANDPAPER = Create("sandpaper");

}
