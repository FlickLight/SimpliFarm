package net.mason.farm.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mason.farm.Farm;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TOMATO = FabricItemGroupBuilder.build(
            new Identifier(Farm.MOD_ID, "tomato"), () -> new ItemStack(ModItems.TOMATO));
}
