package com.jorji.dyeablenetherite.armour;

import com.jorji.dyeablenetherite.materials.GreenArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterGreenArmour {
    
    public static final Item GREEN_NETHERITE_HELMET = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item GREEN_NETHERITE_CHESTPLATE = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item GREEN_NETHERITE_LEGGINGS = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item GREEN_NETHERITE_BOOTS = new ArmorItem(GreenArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_helmet"), GREEN_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_chestplate"), GREEN_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_leggings"), GREEN_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_boots"), GREEN_NETHERITE_BOOTS);
    }
}
