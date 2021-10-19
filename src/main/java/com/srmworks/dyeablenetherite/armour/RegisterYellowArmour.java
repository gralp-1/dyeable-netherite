package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.YellowArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;

public class RegisterYellowArmour {
    
    public static final ArmorMaterial YELLOW_ARMOUR_MATERIAL = new YellowArmourMaterial();
    public static final Item YELLOW_NETHERITE_HELMET = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item YELLOW_NETHERITE_CHESTPLATE = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item YELLOW_NETHERITE_LEGGINGS = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item YELLOW_NETHERITE_BOOTS = new ArmorItem(YellowArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));

    public static void register() {
        // I swear RegisterYellowArmour.ITEM is gonna kill me 
        // WHAT DO YOU MEAN CANNOT RESOLVE SYMBOL 'ITEM'????
        Registry.register(RegisterYellowArmour.ITEM, new Identifier("dyeablenetherite", "yellow_netherite"), YELLOW_ARMOUR_MATERIAL);
        Registry.register(RegisterYellowArmour.ITEM, new Identifier("dyeablenetherite", "yellow_netherite_helmet"), YELLOW_NETHERITE_HELMET);
        Registry.register(RegisterYellowArmour.ITEM, new Identifier("dyeablenetherite", "yellow_netherite_chestplate"), YELLOW_NETHERITE_CHESTPLATE);
        Registry.register(RegisterYellowArmour.ITEM, new Identifier("dyeablenetherite", "yellow_netherite_leggings"), YELLOW_NETHERITE_LEGGINGS);
        Registry.register(RegisterYellowArmour.ITEM, new Identifier("dyeablenetherite", "yellow_netherite_boots"), YELLOW_NETHERITE_BOOTS);
    }
}