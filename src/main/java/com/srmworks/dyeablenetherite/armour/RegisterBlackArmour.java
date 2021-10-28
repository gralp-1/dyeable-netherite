package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.BlackArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterBlackArmour {

    public static final Item BLACK_NETHERITE_HELMET = new ArmorItem(BlackArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item BLACK_NETHERITE_CHESTPLATE = new ArmorItem(BlackArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item BLACK_NETHERITE_LEGGINGS = new ArmorItem(BlackArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item BLACK_NETHERITE_BOOTS = new ArmorItem(BlackArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, id("black_netherite_helmet"), BLACK_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("black_netherite_chestplate"), BLACK_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("black_netherite_leggings"), BLACK_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("black_netherite_boots"), BLACK_NETHERITE_BOOTS);
    }
}

