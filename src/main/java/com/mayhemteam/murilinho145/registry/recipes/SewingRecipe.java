package com.mayhemteam.murilinho145.registry.recipes;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class SewingRecipe implements Recipe<CraftingInventory> {
    private final Ingredient input1;
    private final Ingredient input2;
    private final Ingredient input3;
    private final Ingredient input4;
    private final Ingredient input5;
    private final Ingredient input6;
    private final ItemStack output;
    private final Identifier id;

    public SewingRecipe(Ingredient input1, Ingredient input2, Ingredient input3, Ingredient input4, Ingredient input5, Ingredient input6, ItemStack output, Identifier id) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.input5 = input5;
        this.input6 = input6;
        this.output = output;
        this.id = id;
    }

    public Ingredient getInput1() {
        return input1;
    }

    public Ingredient getInput2() {
        return input2;
    }

    public Ingredient getInput3() {
        return input3;
    }

    public Ingredient getInput4() {
        return input4;
    }

    public Ingredient getInput5() {
        return input5;
    }

    public Ingredient getInput6() {
        return input6;
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world) {
        if (inventory.size() < 2) return false;
        return input1.test(inventory.getStack(3))
                && input2.test(inventory.getStack(4))
                && input3.test(inventory.getStack(5))
                && input4.test(inventory.getStack(6))
                && input5.test(inventory.getStack(7))
                && input6.test(inventory.getStack(8));
    }

    @Override
    public ItemStack craft(CraftingInventory inventory) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput() {
        return null;
    }

    @Override
    public Identifier getId() {
        return null;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }
}
