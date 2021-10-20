package com.srmworks.dyeablenetherite;

import com.srmworks.dyeablenetherite.armour.*;
import com.srmworks.dyeablenetherite.tools.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/* NOTE: The spelling of armour is mixed. It varies between armour and armor.
* I spell it armour but fabric doesn't
* This will be refactored
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
        RegisterBlueTools.register();
        RegisterGreenTools.register();
        RegisterWhiteTools.register();
        RegisterPurpleTools.register();
        RegisterYellowTools.register();


        // Register armour
        RegisterRedArmour.register();
        RegisterBlueArmour.register();
        RegisterGreenArmour.register();
        RegisterWhiteArmour.register();
        RegisterPurpleArmour.register();
        RegisterYellowArmour.register();
    }
    
    public static void RegisterItem(String name, Item item){
        Registry.register(Registry.ITEM, id(name), item);
    }
    
    public static Identifier id(String name){
        return new Identifier(MODID, name);
    }
}
