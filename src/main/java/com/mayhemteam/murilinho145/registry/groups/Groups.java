package com.mayhemteam.murilinho145.registry.groups;

import com.mayhemteam.murilinho145.libs.Utils;
import com.mayhemteam.murilinho145.registry.items.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Groups {
    public static final ItemGroup MAINTAB = FabricItemGroupBuilder.create(Utils.myId("main_tab"))
            .icon(() -> new ItemStack(ItemRegistry.ZINC_HAMMER))
            .build();
    public static final ItemGroup RESISTORSTAB = FabricItemGroupBuilder.create(Utils.myId("resistors_tab"))
            .icon(() -> new ItemStack(ItemRegistry.RESISTORS))
            .build();
    public static final ItemGroup NATURETAB = FabricItemGroupBuilder.create(Utils.myId("nature_tab"))
            .icon(() -> new ItemStack(ItemRegistry.EVA_STICK))
            .build();
}
