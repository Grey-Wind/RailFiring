
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.greywind.railsmelting.client.gui.RailFurnaceGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RailSmeltingModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RailSmeltingModMenus.RAIL_FURNACE_GUI.get(), RailFurnaceGuiScreen::new);
	}
}
