package com.unityworks.dyeablenetherite.armour;

import com.unityworks.dyeablenetherite.materials.PurpleArmourMaterial;
import com.unityworks.dyeablenetherite.DyeableNetherite;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterPurpleArmour {

    public static final Item PURPLE_NETHERITE_HELMET = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.HEAD, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item PURPLE_NETHERITE_CHESTPLATE = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.CHEST, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item PURPLE_NETHERITE_LEGGINGS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.LEGS, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item PURPLE_NETHERITE_BOOTS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.FEET, DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_helmet"), PURPLE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_chestplate"), PURPLE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_leggings"), PURPLE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_boots"), PURPLE_NETHERITE_BOOTS);
    }
}
