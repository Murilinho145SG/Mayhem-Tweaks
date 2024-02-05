package com.mayhemteam.murilinho145.registry.items;

import com.mayhemteam.murilinho145.libs.Utils;
import com.mayhemteam.murilinho145.registry.groups.Groups;
import com.mayhemteam.murilinho145.registry.items.properties.HammerProperties;
import com.mayhemteam.murilinho145.registry.items.properties.HammerTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class ItemRegistry {
    public static ToolItem WOODEN_HAMMER = new HammerProperties(new HammerTier(50, Items.OAK_WOOD), 4, 2.0f, new Item.Settings().group(Groups.MAINTAB));
    public static ToolItem STEEL_HAMMER = new HammerProperties(new HammerTier(500, Items.IRON_INGOT), 6, -1.5f, new Item.Settings().group(Groups.MAINTAB));
    public static ToolItem ZINC_HAMMER = new HammerProperties(new HammerTier(250, Items.IRON_INGOT), 5,-2.0f, new Item.Settings().group(Groups.MAINTAB));
    public static ToolItem KNIFE = new SwordItem(new HammerTier(250, Items.IRON_INGOT), 5, 3.0f, new Item.Settings().group(Groups.MAINTAB));
    public static final Item RESISTORS = new Item(new Item.Settings().group(Groups.RESISTORSTAB));
    public static final Item EVA_STICK = new Item(new Item.Settings().group(Groups.NATURETAB));
    private static final String[] resistors = {
            "aluminum",
            "antimony",
            "bismuth",
            "chromium",
            "cobalt",
            "copper",
            "gold",
            "lithium",
            "manganese",
            "mercury",
            "nickel",
            "potassium",
            "silver",
            "sodium",
            "tin",
            "zinc"
    };
    public static void registerItem() {
        Utils.registry("item", Utils.myId("wooden_hammer"), WOODEN_HAMMER);
        Utils.registry("item", Utils.myId("zinc_hammer"), ZINC_HAMMER);
        Utils.registry("item", Utils.myId("steel_hammer"), STEEL_HAMMER);
        Utils.registry("item", Utils.myId("resistor_mahemio"), RESISTORS);
        Utils.registry("item", Utils.myId("eva_stick"), EVA_STICK);
        Utils.registry("item", Utils.myId("knife"), KNIFE);

        for (String ids : resistors) {
            Utils.registry("item", Utils.myId("resistor_" + ids), new Item(new Item.Settings().group(Groups.RESISTORSTAB)));
        }

        normalItem("inductor");
        normalItem("inductor_core");
        normalItem("capacitor_ceramic");
        normalItem("capacitor_electrolytic");
        normalItem("spool_of_thread");
        normalItem("sewing_needle");
        normalItem("wrench");

        tools("pliers", 250);
        tools("saw", 100);
        tools("wire_cutter", 250);
        tools("screwdriver", 250);
    }
    private static void normalItem(String id) {
        Utils.registry("item", Utils.myId(id), new Item(new Item.Settings().group(Groups.MAINTAB)));
    }
    private static void tools(String id, int damage) {
        Utils.registry("item", Utils.myId(id), new Item(new Item.Settings().group(Groups.MAINTAB).maxDamage(damage)));
    }
}