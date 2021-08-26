package com.srworks.dyeablenetherite.armour;

import com.srworks.dyeablenetherite.materials.WhiteArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.srworks.dyeablenetherite.DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS;

public class RegisterWhiteArmour {

    public static final Item WHITE_NETHERITE_HELMET = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.HEAD, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item WHITE_NETHERITE_CHESTPLATE = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.CHEST, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item WHITE_NETHERITE_LEGGINGS = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.LEGS, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item WHITE_NETHERITE_BOOTS = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.FEET, UNIVERSAL_ARMOUR_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_helmet"), WHITE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_chestplate"), WHITE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_leggings"), WHITE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_boots"), WHITE_NETHERITE_BOOTS);
    }
}
