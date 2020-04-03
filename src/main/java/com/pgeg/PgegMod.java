package com.pgeg;

import com.pgeg.registry.*;
import net.fabricmc.api.ModInitializer;

public class PgegMod implements ModInitializer {
	public static final String MOD_ID = "pgeg";
	public static final String MOD_NAME = "pgeg";

	@Override
	public void onInitialize() {

		Pitems.init();
		Ptools.init();
		Food.init();

	}
}
