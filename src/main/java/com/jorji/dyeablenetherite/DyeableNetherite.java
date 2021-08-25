package com.jorji.dyeablenetherite;

import com.jorji.dyeablenetherite.blue.RegisterBlueTools;
import com.jorji.dyeablenetherite.green.RegisterGreenArmour;
import com.jorji.dyeablenetherite.green.RegisterGreenTools;
import com.jorji.dyeablenetherite.red.RegisterRedArmour;
import com.jorji.dyeablenetherite.blue.RegisterBlueArmour;
import com.jorji.dyeablenetherite.red.RegisterRedTools;
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
