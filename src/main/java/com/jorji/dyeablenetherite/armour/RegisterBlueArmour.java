package com.jorji.dyeablenetherite.armour;

import com.jorji.dyeablenetherite.materials.BlueArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlueArmour {
    
    public static final Item BLUE_NETHERITE_HELMET = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item BLUE_NETHERITE_CHESTPLATE = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item BLUE_NETHERITE_LEGGINGS = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item BLUE_NETHERITE_BOOTS = new ArmorItem(BlueArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_helmet"), BLUE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_chestplate"), BLUE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_leggings"), BLUE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "blue_netherite_boots"), BLUE_NETHERITE_BOOTS);
    }
}
