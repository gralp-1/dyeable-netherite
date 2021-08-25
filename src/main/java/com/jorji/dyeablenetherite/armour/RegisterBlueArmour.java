package com.jorji.dyeablenetherite.armour;

import com.jorji.dyeablenetherite.materials.BlueArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.jorji.dyeablenetherite.DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS;

public class RegisterBlueArmour {

    public static final Item BLUE_NETHERITE_HELMET = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.HEAD, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item BLUE_NETHERITE_CHESTPLATE = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.CHEST, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item BLUE_NETHERITE_LEGGINGS = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.LEGS, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item BLUE_NETHERITE_BOOTS = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.FEET, UNIVERSAL_ARMOUR_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_helmet"), BLUE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_chestplate"), BLUE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_leggings"), BLUE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_boots"), BLUE_NETHERITE_BOOTS);
    }
}
