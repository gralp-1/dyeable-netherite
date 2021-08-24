package com.jorji.dyeablenetherite.red;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RedArmourMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{407, 592, 555, 481};
    private static final int[] PROTECTION_VALUES = new int[]{3, 6, 8, 3};
    // In which A is helmet, B chestplate, C leggings and D boots.

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
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
        return "name";
    }

    @Override
    public float getToughness() {
        return 12.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 15.0F;
    }
}