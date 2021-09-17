package com.unityworks.dyeablenetherite.armour;

import com.unityworks.dyeablenetherite.materials.RedArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.unityworks.dyeablenetherite.DyeableNetherite.UNIVERSAL_ARMOUR_SETTINGS;

public class RegisterRedArmour {

    public static final Item RED_NETHERITE_HELMET = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.HEAD, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item RED_NETHERITE_CHESTPLATE = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.CHEST, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item RED_NETHERITE_LEGGINGS = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.LEGS, UNIVERSAL_ARMOUR_SETTINGS);
    public static final Item RED_NETHERITE_BOOTS = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.FEET, UNIVERSAL_ARMOUR_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_helmet"), RED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_chestplate"), RED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_leggings"), RED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_boots"), RED_NETHERITE_BOOTS);
    }
}
