package com.jorji.dyeablenetherite.tools;

import com.jorji.dyeablenetherite.tooltypes.AxeType;
import com.jorji.dyeablenetherite.tooltypes.PickaxeType;
import com.jorji.dyeablenetherite.tooltypes.ShovelType;
import com.jorji.dyeablenetherite.tooltypes.SwordType;
import com.jorji.dyeablenetherite.UniversalToolMaterial;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterGreenTools {


    public static final ToolItem GREEN_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, UniversalToolMaterial.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, UniversalToolMaterial.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, UniversalToolMaterial.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, UniversalToolMaterial.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem GREEN_NETHERITE_HOE = new SwordType(UniversalToolMaterial.INSTANCE, 0, 0F, UniversalToolMaterial.UNIVERSAL_TOOL_SETTINGS);


    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_axe"), GREEN_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_pickaxe"), GREEN_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_shovel"), GREEN_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_sword"), GREEN_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "green_netherite_hoe"), GREEN_NETHERITE_HOE);
    }
}