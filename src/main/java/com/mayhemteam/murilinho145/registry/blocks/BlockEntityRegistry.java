package com.mayhemteam.murilinho145.registry.blocks;

import com.mayhemteam.murilinho145.registry.blocks.properties.SewingTableEntity;
import net.minecraft.block.entity.BlockEntityType;

public class BlockEntityRegistry {
    public static final BlockEntityType<SewingTableEntity> SEWING_TABLE_ENTITY =
            BlockEntityType.Builder.create(SewingTableEntity::new, BlockRegistry.SEWING_TABLE).build(null);
    public static void register() {

    }
}
