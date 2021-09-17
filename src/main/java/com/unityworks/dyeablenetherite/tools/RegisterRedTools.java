package com.unityworks.dyeablenetherite.tools;

import com.unityworks.dyeablenetherite.UniversalToolMaterial;
import com.unityworks.dyeablenetherite.DyeableNetherite;
import com.unityworks.dyeablenetherite.tooltypes.*;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterRedTools {


    public static final ToolItem RED_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem RED_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem RED_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem RED_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);
    public static final ToolItem RED_NETHERITE_HOE = new HoeType(UniversalToolMaterial.INSTANCE, 0, 0F, DyeableNetherite.UNIVERSAL_TOOL_SETTINGS);


    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_axe"), RED_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_pickaxe"), RED_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_shovel"), RED_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_sword"), RED_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_hoe"), RED_NETHERITE_HOE);
    }
}