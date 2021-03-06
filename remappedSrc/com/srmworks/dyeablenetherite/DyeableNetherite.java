package com.srmworks.dyeablenetherite;

import com.srmworks.dyeablenetherite.armour.*;
import com.srmworks.dyeablenetherite.tools.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/* NOTE: The spelling of armour is mixed. It varies between armour and armor.
* I spell it armour but fabric doesn't
* This won't be refactored, british english ftw
*/

public class DyeableNetherite implements ModInitializer {
    public static final String MODID = "dyeablenetherite";


    public static final ItemGroup ARMOUR_GROUP = FabricItemGroupBuilder.create(
            new Identifier("dyeablenetherite", "netheritearmor"))
            .icon(() -> new ItemStack(RegisterBlueArmour.BLUE_NETHERITE_CHESTPLATE))
            .build();
    public static final ItemGroup TOOL_GROUP = FabricItemGroupBuilder.create(
            new Identifier("dyeablenetherite", "netheritetools"))
            .icon(() -> new ItemStack(RegisterBlueTools.BLUE_NETHERITE_SWORD))
            .build();
    
    // This doesn't work with armour
    public static final Settings UNIVERSAL_TOOL_SETTINGS = new Settings().fireproof().group(DyeableNetherite.TOOL_GROUP);


    @Override
    public void onInitialize() {


        // Register tools
        RegisterRedTools.register();
        RegisterPinkTools.register();
        RegisterBlueTools.register();
        RegisterGrayTools.register();
        RegisterGreenTools.register();
        RegisterWhiteTools.register();
        RegisterBrownTools.register();
        RegisterBlackTools.register();
        RegisterPurpleTools.register();
        RegisterYellowTools.register();
        RegisterOrangeTools.register();
        RegisterLightGrayTools.register();


        // Register armour
        RegisterRedArmour.register();
        RegisterPinkArmour.register();
        RegisterBlueArmour.register();
        RegisterGrayArmour.register();
        RegisterGreenArmour.register();
        RegisterWhiteArmour.register();
        RegisterBrownArmour.register();
        RegisterBlackArmour.register();
        RegisterPurpleArmour.register();
        RegisterYellowArmour.register();
        RegisterOrangeArmour.register();
        RegisterLightGrayArmour.register();
    }
    
    public static Identifier id(String name){
        return new Identifier(MODID, name);
    }
}
