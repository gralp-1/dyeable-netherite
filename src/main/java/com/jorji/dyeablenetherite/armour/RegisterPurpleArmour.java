package com.jorji.dyeablenetherite.armour;

import com.jorji.dyeablenetherite.materials.PurpleArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterPurpleArmour {

    public static final Item PURPLE_NETHERITE_HELMET = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item PURPLE_NETHERITE_CHESTPLATE = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item PURPLE_NETHERITE_LEGGINGS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item PURPLE_NETHERITE_BOOTS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_helmet"), PURPLE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_chestplate"), PURPLE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_leggings"), PURPLE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_boots"), PURPLE_NETHERITE_BOOTS);
    }
}
