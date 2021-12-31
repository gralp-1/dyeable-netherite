package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.PinkArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterPinkArmour {
    
    public static final Item PINK_NETHERITE_HELMET = new ArmorItem(PinkArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item PINK_NETHERITE_CHESTPLATE = new ArmorItem(PinkArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item PINK_NETHERITE_LEGGINGS = new ArmorItem(PinkArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item PINK_NETHERITE_BOOTS = new ArmorItem(PinkArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    
    public static void register() {
        Registry.register(Registry.ITEM, id("pink_netherite_helmet"), PINK_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("pink_netherite_chestplate"), PINK_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("pink_netherite_leggings"), PINK_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("pink_netherite_boots"), PINK_NETHERITE_BOOTS);
    }
}
