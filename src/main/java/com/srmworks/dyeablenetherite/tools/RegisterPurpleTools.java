package com.srmworks.dyeablenetherite.tools;

import com.srmworks.dyeablenetherite.tooltypes.*;
import com.srmworks.dyeablenetherite.UniversalToolMaterial;
import com.srmworks.dyeablenetherite.DyeableNetherite;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterPurpleTools {


    public static final ToolItem PURPLE_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem PURPLE_NETHERITE_HOE = new HoeType(UniversalToolMaterial.INSTANCE, 0, 0F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);


    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_axe"), PURPLE_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_pickaxe"), PURPLE_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_shovel"), PURPLE_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_sword"), PURPLE_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "purple_netherite_hoe"), PURPLE_NETHERITE_HOE);
    }
}