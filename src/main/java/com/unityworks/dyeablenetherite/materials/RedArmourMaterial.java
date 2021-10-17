package com.unityworks.dyeablenetherite.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RedArmourMaterial implements ArmorMaterial {
    // In order Feet, Leggings, Chestplate, Helmet
    private static final int[] durabilities = {481, 555, 592, 407};
    private static final int[] prots = {3, 6, 8, 3};
    
    @Override
    public int getDurability(EquipmentSlot slot) {
        return durabilities[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return prots[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }

    @Override
    public String getName() {
        return "red_netherite_material";
    }

    @Override
    public float getToughness() {
        return 3;
    }

    @Override
    public float getKnockbackResistance() {
        return 1;
    }
    
    public static RedArmourMaterial INSTANCE = new RedArmourMaterial();}
}
