package com.bravebomb.chilidelight;

import com.bravebomb.chilidelight.common.registry.CDBlocks;
import com.bravebomb.chilidelight.common.registry.CDItems;
import com.bravebomb.chilidelight.common.registry.ModCreativeTabs;
import com.bravebomb.chilidelight.common.utility.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChiliDelight implements ModInitializer {
	public static final String MOD_ID = "chilidelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		CDBlocks.BLOCKS.register();
		CDItems.ITEMS.register();
		ModCreativeTabs.initialize();
		ModLootTableModifiers.modifyLootTables();
		System.out.println("ChiliCraft Addon has been initialized!");
	}
}