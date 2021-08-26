package com.srworks.dyeablenetherite.tools;

import com.srworks.dyeablenetherite.UniversalToolMaterial;
import com.srworks.dyeablenetherite.tooltypes.*;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.srworks.dyeablenetherite.DyeableNetherite.UNIVERSAL_TOOL_SETTINGS;

public class RegisterGreenTools {


    public static final ToolItem GREEN_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_HOE = new HoeType(UniversalToolMaterial.INSTANCE, 0, 0F, UNIVERSAL_TOOL_SETTINGS);


    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_axe"), GREEN_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_pickaxe"), GREEN_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_shovel"), GREEN_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_sword"), GREEN_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_hoe"), GREEN_NETHERITE_HOE);
    }
}