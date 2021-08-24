package com.jorji.dyeablenetherite;

import com.jorji.dyeablenetherite.red.RegisterRedArmour;
import net.fabricmc.api.ModInitializer;

public class main implements ModInitializer {
	@Override
	public void onInitialize() {
		RegisterRedArmour.register();
	}
}
