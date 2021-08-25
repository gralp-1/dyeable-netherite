package com.jorji.dyeablenetherite.tools;

import com.jorji.dyeablenetherite.ToolTypes.AxeType;
import com.jorji.dyeablenetherite.ToolTypes.PickaxeType;
import com.jorji.dyeablenetherite.ToolTypes.ShovelType;
import com.jorji.dyeablenetherite.ToolTypes.SwordType;
import com.jorji.dyeablenetherite.UniversalToolMaterial;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterWhiteTools {


    public static final ToolItem WHITE_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem WHITE_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem WHITE_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem WHITE_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, UniversalToolMaterial.UNIVERSAL_SETTINGS);
    public static final ToolItem WHITE_NETHERITE_HOE = new SwordType(UniversalToolMaterial.INSTANCE, 0, 0F, UniversalToolMaterial.UNIVERSAL_SETTINGS);


    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_axe"), WHITE_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_pickaxe"), WHITE_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_shovel"), WHITE_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_sword"), WHITE_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "white_netherite_hoe"), WHITE_NETHERITE_HOE);
    }
}