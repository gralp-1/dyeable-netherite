package com.jorji.dyeablenetherite.armour;

import com.jorji.dyeablenetherite.materials.WhiteArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterWhiteArmour {

    public static final Item WHITE_NETHERITE_HELMET = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item WHITE_NETHERITE_CHESTPLATE = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item WHITE_NETHERITE_LEGGINGS = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item WHITE_NETHERITE_BOOTS = new ArmorItem(WhiteArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_helmet"), WHITE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_chestplate"), WHITE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_leggings"), WHITE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_boots"), WHITE_NETHERITE_BOOTS);
    }
}
