package net.mason.farm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mason.farm.Farm;
import net.mason.farm.block.custom.TomatoCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));




    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Farm.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Farm.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Farm.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        Farm.LOGGER.debug("Registering ModBlocks for " + Farm.MOD_ID);
    }
}
