package com.jorji.dyeablenetherite.tools;

import com.jorji.dyeablenetherite.ToolTypes.AxeType;
import com.jorji.dyeablenetherite.ToolTypes.PickaxeType;
import com.jorji.dyeablenetherite.ToolTypes.ShovelType;
import com.jorji.dyeablenetherite.ToolTypes.SwordType;
import com.jorji.dyeablenetherite.UniversalToolMaterial;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterPurpleTools {


    public static final ToolItem PURPLE_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_HOE = new SwordType(UniversalToolMaterial.INSTANCE, 0, 0F, UniversalToolMaterial.UNIVERSAL_SETTINGS);


    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_axe"), PURPLE_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_pickaxe"), PURPLE_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_shovel"), PURPLE_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_sword"), PURPLE_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_hoe"), PURPLE_NETHERITE_HOE);
    }
}