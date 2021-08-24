package com.jorji.dyeablenetherite.red;

import com.jorji.dyeablenetherite.*;
import com.jorji.dyeablenetherite.ToolTypes.AxeType;
import com.jorji.dyeablenetherite.ToolTypes.PickaxeType;
import com.jorji.dyeablenetherite.ToolTypes.ShovelType;
import com.jorji.dyeablenetherite.ToolTypes.SwordType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterRedTools {

    public static final Item.Settings settings = new Item.Settings().fireproof().group(ItemGroup.TOOLS);


    public static final ToolItem RED_NETHERITE_PICKAXE = new PickaxeType(UniversalToolMaterial.INSTANCE, 5, -2.8F, settings);
    public static final ToolItem RED_NETHERITE_AXE = new AxeType(UniversalToolMaterial.INSTANCE, 9, -3F, settings);
    public static final ToolItem RED_NETHERITE_SHOVEL = new ShovelType(UniversalToolMaterial.INSTANCE, 5.5F, -3F, settings);
    public static final ToolItem RED_NETHERITE_SWORD = new SwordType(UniversalToolMaterial.INSTANCE, 7, -2.4F, settings);
    public static final ToolItem RED_NETHERITE_HOE = new SwordType(UniversalToolMaterial.INSTANCE, 0, 0F, settings);


    public static void register(){
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_axe"), RED_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_pickaxe"), RED_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_shovel"), RED_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_sword"), RED_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("dyeablenetherite", "netherite_hoe"), RED_NETHERITE_HOE);
    }
}