package com.mayhemteam.murilinho145.registry.items.properties;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class HammerTier implements ToolMaterial {
    private final int durability;
    private final Item repairItem;

    public HammerTier(int durability, Item repairItem) {
        this.durability = durability;
        this.repairItem = repairItem;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(repairItem);
    }
}
