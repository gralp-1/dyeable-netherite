package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.RedArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterRedArmour {

    public static final Item RED_NETHERITE_HELMET = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item RED_NETHERITE_CHESTPLATE = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item RED_NETHERITE_LEGGINGS = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item RED_NETHERITE_BOOTS = new ArmorItem(RedArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, id("red_netherite_helmet"), RED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("red_netherite_chestplate"), RED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("red_netherite_leggings"), RED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("red_netherite_boots"), RED_NETHERITE_BOOTS);
    }
}
