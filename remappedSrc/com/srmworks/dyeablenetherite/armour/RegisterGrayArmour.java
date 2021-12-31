package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.GrayArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterGrayArmour {

    public static final Item GRAY_NETHERITE_HELMET = new ArmorItem(GrayArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item GRAY_NETHERITE_CHESTPLATE = new ArmorItem(GrayArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item GRAY_NETHERITE_LEGGINGS = new ArmorItem(GrayArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item GRAY_NETHERITE_BOOTS = new ArmorItem(GrayArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, id("gray_netherite_helmet"), GRAY_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("gray_netherite_chestplate"), GRAY_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("gray_netherite_leggings"), GRAY_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("gray_netherite_boots"), GRAY_NETHERITE_BOOTS);
    }
}
