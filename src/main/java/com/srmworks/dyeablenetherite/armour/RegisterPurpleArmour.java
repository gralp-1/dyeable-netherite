package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.PurpleArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterPurpleArmour {

    public static final Item PURPLE_NETHERITE_HELMET = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item PURPLE_NETHERITE_CHESTPLATE = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item PURPLE_NETHERITE_LEGGINGS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item PURPLE_NETHERITE_BOOTS = new ArmorItem(PurpleArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, id("purple_netherite_helmet"), PURPLE_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("purple_netherite_chestplate"), PURPLE_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("purple_netherite_leggings"), PURPLE_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("purple_netherite_boots"), PURPLE_NETHERITE_BOOTS);
    }
}
