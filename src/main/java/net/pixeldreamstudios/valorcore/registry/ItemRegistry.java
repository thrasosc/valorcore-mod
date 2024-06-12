package net.pixeldreamstudios.valorcore.registry;

import io.wispforest.lavender.book.LavenderBookItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pixeldreamstudios.valorcore.ValorCore;

public class ItemRegistry {
    public static final Item VALORCORE_ALMANAC = LavenderBookItem.registerForBook(new Identifier(ValorCore.MOD_ID, "valor_guide"), new Identifier(ValorCore.MOD_ID, "valorcore_valor_guide"), new FabricItemSettings().maxCount(1));
    public static final Item SEASONS_ICON = registerItem("seasons_icon", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item SKILLS_ICON = registerItem("skills_icon", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item PROFESSIONS_ICON = registerItem("professions_icon", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item PARTIES_ICON = registerItem("parties_icon", new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ValorCore.MOD_ID, name), item);
    }

    public static void init() {
        ValorCore.LOGGER.info("Registering items");
    }
}
