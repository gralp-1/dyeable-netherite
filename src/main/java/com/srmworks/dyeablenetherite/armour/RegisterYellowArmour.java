package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.YellowArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterYellowArmour {
    
    public static final Item YELLOW_NETHERITE_HELMET = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item YELLOW_NETHERITE_CHESTPLATE = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item YELLOW_NETHERITE_LEGGINGS = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item YELLOW_NETHERITE_BOOTS = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, id("yellow_netherite_helmet"), YELLOW_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("yellow_netherite_chestplate"), YELLOW_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("yellow_netherite_leggings"), YELLOW_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("yellow_netherite_boots"), YELLOW_NETHERITE_BOOTS);
    }
}
