package com.jorji.dyeablenetherite;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class UniversalToolMaterial implements ToolMaterial {

    public static final UniversalToolMaterial INSTANCE = new UniversalToolMaterial();
    public static final Item.Settings UNIVERSAL_SETTINGS = new Item.Settings().fireproof().group(ItemGroup.TOOLS);

    @Override
    public int getDurability() {
        return 2032;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
}
