package net.pixeldreamstudios.valorcore;

import net.fabricmc.api.ModInitializer;

import net.pixeldreamstudios.registry.ItemGroupRegistry;
import net.pixeldreamstudios.registry.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValorCore implements ModInitializer {
	public static String MOD_ID = "valorcore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("And I said hey! What's going on?");
		ItemGroupRegistry.init();
		ItemRegistry.init();
	}
}