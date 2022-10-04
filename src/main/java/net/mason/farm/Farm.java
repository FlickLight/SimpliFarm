package net.mason.farm;

import net.fabricmc.api.ModInitializer;
import net.mason.farm.block.ModBlocks;
import net.mason.farm.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Farm implements ModInitializer {
	public static final String MOD_ID = "farm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
