/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.greywind.railsmelting;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.greywind.railsmelting.init.RailSmeltingModTrades;
import net.greywind.railsmelting.init.RailSmeltingModTabs;
import net.greywind.railsmelting.init.RailSmeltingModProcedures;
import net.greywind.railsmelting.init.RailSmeltingModMenus;
import net.greywind.railsmelting.init.RailSmeltingModItems;
import net.greywind.railsmelting.init.RailSmeltingModBlocks;
import net.greywind.railsmelting.init.RailSmeltingModBlockEntities;

import net.fabricmc.api.ModInitializer;

public class RailSmeltingMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "rail_smelting";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing RailSmeltingMod");

		RailSmeltingModTabs.load();

		RailSmeltingModBlocks.load();
		RailSmeltingModItems.load();
		RailSmeltingModBlockEntities.load();

		RailSmeltingModProcedures.load();

		RailSmeltingModMenus.load();

		RailSmeltingModTrades.registerTrades();

	}
}
