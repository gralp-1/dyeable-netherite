package com.jorji.dyeablenetherite;

import com.jorji.dyeablenetherite.tools.RegisterBlueTools;
import com.jorji.dyeablenetherite.tools.RegisterGreenTools;
import com.jorji.dyeablenetherite.tools.RegisterRedTools;

import com.jorji.dyeablenetherite.armour.RegisterGreenArmour;
import com.jorji.dyeablenetherite.armour.RegisterRedArmour;
import com.jorji.dyeablenetherite.armour.RegisterBlueArmour;
import net.fabricmc.api.ModInitializer;

public class DyeableNetherite implements ModInitializer {
	@Override
	public void onInitialize() {

		// Register tools
		RegisterRedTools.register();
		RegisterBlueTools.register();
		RegisterGreenTools.register();

		// Register armour
		RegisterRedArmour.register();
		RegisterBlueArmour.register();
		RegisterGreenArmour.register();
	}
}
