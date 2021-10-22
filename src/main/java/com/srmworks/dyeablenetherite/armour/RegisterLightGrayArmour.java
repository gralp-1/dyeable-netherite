package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.LightGrayArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterLightGrayArmour {
    
    public static final Item LIGHTGRAY_NETHERITE_HELMET = new ArmorItem(LightGrayArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item LIGHTGRAY_NETHERITE_CHESTPLATE = new ArmorItem(LightGrayArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item LIGHTGRAY_NETHERITE_LEGGINGS = new ArmorItem(LightGrayArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item LIGHTGRAY_NETHERITE_BOOTS = new ArmorItem(LightGrayArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    
    public static void register() {
        Registry.register(Registry.ITEM, id("lightgray_netherite_helmet"), LIGHTGRAY_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("lightgray_netherite_chestplate"), LIGHTGRAY_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("lightgray_netherite_leggings"), LIGHTGRAY_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("lightgray_netherite_boots"), LIGHTGRAY_NETHERITE_BOOTS);
    }
}
