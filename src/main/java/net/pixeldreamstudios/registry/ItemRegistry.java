package net.pixeldreamstudios.registry;

import io.wispforest.lavender.book.LavenderBookItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.pixeldreamstudios.valorcore.ValorCore;

public class ItemRegistry {
    public static final Item VALORCORE_ALMANAC = LavenderBookItem.registerForBook(new Identifier(ValorCore.MOD_ID, "valor_guide"), new Identifier(ValorCore.MOD_ID, "valorcore_valor_guide"), new FabricItemSettings().maxCount(1));

    public static void init() {
        ValorCore.LOGGER.info("Registering items");
    }
}
