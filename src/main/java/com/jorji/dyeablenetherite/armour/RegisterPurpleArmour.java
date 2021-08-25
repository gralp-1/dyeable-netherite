package com.jorji.dyeablenetherite.armour;

import com.jorji.dyeablenetherite.materials.PurpleArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.jorji.dyeablenetherite.DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS;

public class RegisterPurpleArmour {

    public static final Item PURPLE_NETHERITE_HELMET = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.HEAD, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item PURPLE_NETHERITE_CHESTPLATE = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.CHEST, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item PURPLE_NETHERITE_LEGGINGS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.LEGS, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item PURPLE_NETHERITE_BOOTS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.FEET, UNIVERSAL_ARMOUR_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_helmet"), PURPLE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_chestplate"), PURPLE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_leggings"), PURPLE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_boots"), PURPLE_NETHERITE_BOOTS);
    }
}
