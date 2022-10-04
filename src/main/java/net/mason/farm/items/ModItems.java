package net.mason.farm.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mason.farm.Farm;
import net.mason.farm.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings().group(ModItemGroup.TOMATO)));
    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().group(ModItemGroup.TOMATO)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Farm.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Farm.LOGGER.debug("Registering Mod Items for" + Farm.MOD_ID);
    }
}
