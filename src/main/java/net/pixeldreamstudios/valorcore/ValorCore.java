package net.pixeldreamstudios.valorcore;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.pixeldreamstudios.valorcore.registry.ItemGroupRegistry;
import net.pixeldreamstudios.valorcore.registry.ItemRegistry;
import net.pixeldreamstudios.valorcore.screen.TutorialScreen;
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