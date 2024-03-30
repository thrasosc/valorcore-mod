package net.pixeldreamstudios.valorcore;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValorCore implements ModInitializer {
	public static String MOD_ID = "valorcore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello from " + MOD_ID + "!");
	}
}