package com.srmworks.dyeablenetherite.armour;

import com.srmworks.dyeablenetherite.materials.BrownArmourMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.ARMOUR_GROUP;
import static com.srmworks.dyeablenetherite.DyeableNetherite.id;

public class RegisterBrownArmour {

    public static final Item BROWN_NETHERITE_HELMET = new ArmorItem(BrownArmourMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item BROWN_NETHERITE_CHESTPLATE = new ArmorItem(BrownArmourMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item BROWN_NETHERITE_LEGGINGS = new ArmorItem(BrownArmourMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ARMOUR_GROUP));
    public static final Item BROWN_NETHERITE_BOOTS = new ArmorItem(BrownArmourMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, id("brown_netherite_helmet"), BROWN_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, id("brown_netherite_chestplate"), BROWN_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, id("brown_netherite_leggings"), BROWN_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, id("brown_netherite_boots"), BROWN_NETHERITE_BOOTS);
    }
}
