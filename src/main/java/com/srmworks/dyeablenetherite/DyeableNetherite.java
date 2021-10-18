package com.srmworks.dyeablenetherite;

import com.srmworks.dyeablenetherite.armour.*;
import com.srmworks.dyeablenetherite.tools.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class DyeableNetherite implements ModInitializer {


    public static final ItemGroup ARMOUR_GROUP = FabricItemGroupBuilder.create(
            new Identifier("dyeablenetherite", "netheritearmor"))
            .icon(() -> new ItemStack(RegisterBlueArmour.BLUE_NETHERITE_CHESTPLATE))
            .build();
    public static final ItemGroup TOOL_GROUP = FabricItemGroupBuilder.create(
            new Identifier("dyeablenetherite", "netheritetools"))
            .icon(() -> new ItemStack(RegisterBlueTools.BLUE_NETHERITE_SWORD))
            .build();

    public static final Settings UNIVERSAL_TOOL_SETTINGS = new Settings().fireproof().group(DyeableNetherite.TOOL_GROUP);
    // not working
    //public static final Settings UNIVERSAL_ARMOUR_SETTINGS = new Settings().fireproof().group(ARMOUR_GROUP);


    @Override
    public void onInitialize() {
        // This whole mod really needs more greg
        // TODO: Add more greg

        // Register tools
//        RegisterRedTools.register();
//        RegisterBlueTools.register();
//        RegisterGreenTools.register();
//        RegisterWhiteTools.register();
//        RegisterPurpleTools.register();


        // Register armour
        RegisterRedArmour.register();
//        RegisterBlueArmour.register();
//        RegisterGreenArmour.register();
//        RegisterWhiteArmour.register();
//        RegisterPurpleArmour.register();
    }
}
