package com.jorji.dyeablenetherite;

import com.jorji.dyeablenetherite.red.RegisterRedArmour;
import com.jorji.dyeablenetherite.red.RegisterRedTools;
import net.fabricmc.api.ModInitializer;

public class DyeableNetherite implements ModInitializer {
	@Override
	public void onInitialize() {
		RegisterRedArmour.register();
		RegisterRedTools.register();
	}
}
