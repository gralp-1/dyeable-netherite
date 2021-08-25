package com.jorji.dyeablenetherite;

import com.jorji.dyeablenetherite.armour.*;
import com.jorji.dyeablenetherite.tools.*;
import net.fabricmc.api.ModInitializer;

public class DyeableNetherite implements ModInitializer {
    @Override
    public void onInitialize() {


        // Register tools
        RegisterRedTools.register();
        RegisterBlueTools.register();
        RegisterGreenTools.register();
        RegisterWhiteTools.register();
        RegisterPurpleTools.register();


        // Register armour
        RegisterRedArmour.register();
        RegisterBlueArmour.register();
        RegisterGreenArmour.register();
        RegisterWhiteArmour.register();
        RegisterPurpleArmour.register();
    }
}
