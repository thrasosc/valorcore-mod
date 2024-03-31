package net.pixeldreamstudios.valorcore;

import io.wispforest.lavender.book.BookLoader;
import io.wispforest.lavender.client.LavenderBookScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.Screens;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ValorCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (screen instanceof InventoryScreen) {
//                Screens.getButtons(screen).add(IconButtonWidget.builder(Text.empty(), new Identifier("minecraft", "item/gold_nugget"), button -> client.setScreen(new LavenderBookScreen(BookLoader.get(new Identifier(ValorCore.MOD_ID, "valor_guide"))))).iconSize(16,16).textureSize(16, 16)..build());
                Screens.getButtons(screen).add(ButtonWidget.builder(Text.literal("Guide book"), p -> client.setScreen(new LavenderBookScreen(BookLoader.get(new Identifier(ValorCore.MOD_ID, "valor_guide"))))).position(screen.width / 2 + 16, screen.height / 5 + 3).size(72, 16).build());
            }
        });
    }
}
