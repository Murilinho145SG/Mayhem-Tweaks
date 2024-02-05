package com.mayhemteam.murilinho145.libs;

import com.mayhemteam.murilinho145.MayhemTweaks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

public class Utils {
    public static Identifier myId(String id) {
        return new Identifier(MayhemTweaks.MODID, id);
    }
    public static void registry(@NotNull String type, Identifier identifier, Object registryObject) {
        if (type.equals("item")) {
            if (registryObject instanceof Item) {
                Registry.register(Registry.ITEM, identifier, (Item) registryObject);
                MayhemTweaks.LOGGER.info("Registering Item " + identifier.getPath());
            }
        } else if (type.equals("block")) {
            if (registryObject instanceof Block) {
                Registry.register(Registry.BLOCK, identifier, (Block) registryObject);
                MayhemTweaks.LOGGER.info("Registering Block " + identifier.getPath());
            }
        }
    }

}
