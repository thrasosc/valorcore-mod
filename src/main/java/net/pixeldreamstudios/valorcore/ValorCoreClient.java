package net.pixeldreamstudios.valorcore;

import io.wispforest.lavender.book.BookLoader;
import io.wispforest.lavender.client.LavenderBookScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.Screens;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ValorCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (screen instanceof InventoryScreen) {
                List<? extends Element> widgets = screen.children();
                for (Element widget : widgets) {
                    if (widget instanceof TexturedButtonWidget) {
                        try {
                            TexturedButtonWidget texturedButtonWidget = (TexturedButtonWidget) widget;
                            if (texturedButtonWidget.getWidth() == 20 && texturedButtonWidget.getHeight() == 18) {
                                texturedButtonWidget.active = false;
                                texturedButtonWidget.visible = false;
                            }
                        } catch (Exception exception) {
                            exception.printStackTrace();
                        }
                    }
                }
                Screens.getButtons(screen).add(ButtonWidget.builder(Text.literal("Guide Book"), p -> client.setScreen(new LavenderBookScreen(BookLoader.get(new Identifier(ValorCore.MOD_ID, "valor_guide"))))).position(scaledWidth / 2 + 8, scaledHeight / 2 - 98).size(80, 16).build());
            }
        });
    }
}
