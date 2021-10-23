package com.srmworks.dyeablenetherite.tools;

import com.srmworks.dyeablenetherite.UniversalToolMaterial;
import com.srmworks.dyeablenetherite.tooltypes.*;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.srmworks.dyeablenetherite.DyeableNetherite.UNIVERSAL_TOOL_SETTINGS;

public class RegisterGrayTools {
    
    
    public static final ToolItem GRAY_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GRAY_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GRAY_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GRAY_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GRAY_NETHERITE_HOE = new HoeType(UniversalToolMaterial.INSTANCE, 0, 0F, UNIVERSAL_TOOL_SETTINGS);

    
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "gray_netherite_pickaxe"), GRAY_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "gray_netherite_shovel"), GRAY_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "gray_netherite_sword"), GRAY_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "gray_netherite_axe"), GRAY_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "gray_netherite_hoe"), GRAY_NETHERITE_HOE);

    }
}
