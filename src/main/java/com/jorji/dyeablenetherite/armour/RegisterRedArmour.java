package com.jorji.dyeablenetherite.armour;

import com.jorji.dyeablenetherite.materials.RedArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterRedArmour {
    
    public static final Item RED_NETHERITE_HELMET = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item RED_NETHERITE_CHESTPLATE = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item RED_NETHERITE_LEGGINGS = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final Item RED_NETHERITE_BOOTS = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_helmet"), RED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_chestplate"), RED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_leggings"), RED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_boots"), RED_NETHERITE_BOOTS);
    }
}
