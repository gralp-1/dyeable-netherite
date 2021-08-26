package com.srworks.dyeablenetherite.armour;

import com.srworks.dyeablenetherite.materials.GreenArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.srworks.dyeablenetherite.DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS;

public class RegisterGreenArmour {

    public static final Item GREEN_NETHERITE_HELMET = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.HEAD, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item GREEN_NETHERITE_CHESTPLATE = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.CHEST, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item GREEN_NETHERITE_LEGGINGS = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.LEGS, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item GREEN_NETHERITE_BOOTS = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.FEET, UNIVERSAL_ARMOUR_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_helmet"), GREEN_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_chestplate"), GREEN_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_leggings"), GREEN_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_boots"), GREEN_NETHERITE_BOOTS);
    }
}
