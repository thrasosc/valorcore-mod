package net.pixeldreamstudios.valorcore.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pixeldreamstudios.valorcore.ValorCore;

public class ItemGroupRegistry {
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ValorCore.MOD_ID, ValorCore.MOD_ID), FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + ValorCore.MOD_ID)).icon(() -> new ItemStack(ItemRegistry.VALORCORE_ALMANAC)).entries((displayContext, entries) -> {
        entries.add(ItemRegistry.VALORCORE_ALMANAC);
    }).build());

    public static void init() {
        ValorCore.LOGGER.info("Registering item groups");
    }
}