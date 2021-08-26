package com.srworks.dyeablenetherite.armour;

import com.srworks.dyeablenetherite.materials.BlueArmourMaterial;
import com.srworks.dyeablenetherite.DyeableNetherite;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlueArmour {

    public static final Item BLUE_NETHERITE_HELMET = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.HEAD, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item BLUE_NETHERITE_CHESTPLATE = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.CHEST, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item BLUE_NETHERITE_LEGGINGS = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.LEGS, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item BLUE_NETHERITE_BOOTS = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.FEET, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_helmet"), BLUE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_chestplate"), BLUE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_leggings"), BLUE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_boots"), BLUE_NETHERITE_BOOTS);
    }
}
