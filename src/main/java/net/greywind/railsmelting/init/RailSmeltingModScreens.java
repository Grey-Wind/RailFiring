
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.greywind.railsmelting.client.gui.RailFurnaceGuiScreen;

public class RailSmeltingModScreens {
	public static void load() {
		MenuScreens.register(RailSmeltingModMenus.RAIL_FURNACE_GUI, RailFurnaceGuiScreen::new);
	}
}
