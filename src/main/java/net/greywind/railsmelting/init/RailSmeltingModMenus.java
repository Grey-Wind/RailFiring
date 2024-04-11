
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.greywind.railsmelting.world.inventory.RailFurnaceGuiMenu;
import net.greywind.railsmelting.RailSmeltingMod;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class RailSmeltingModMenus {
	public static MenuType<RailFurnaceGuiMenu> RAIL_FURNACE_GUI;

	public static void load() {
		RAIL_FURNACE_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(RailSmeltingMod.MODID, "rail_furnace_gui"), new ExtendedScreenHandlerType<>(RailFurnaceGuiMenu::new));
		RailFurnaceGuiMenu.screenInit();
	}
}
