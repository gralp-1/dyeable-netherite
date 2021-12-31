package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.OrangeArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterOrangeArmour {
    
    public static final Item ORANGE_NETHERITE_HELMET = new ArmorItem(OrangeArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item ORANGE_NETHERITE_CHESTPLATE = new ArmorItem(OrangeArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item ORANGE_NETHERITE_LEGGINGS = new ArmorItem(OrangeArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item ORANGE_NETHERITE_BOOTS = new ArmorItem(OrangeArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    
    public static void register() {
        Registry.register(Registry.ITEM, id("orange_netherite_helmet"), ORANGE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("orange_netherite_chestplate"), ORANGE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("orange_netherite_leggings"), ORANGE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("orange_netherite_boots"), ORANGE_NETHERITE_BOOTS);
    }
}
