
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.greywind.railsmelting.world.inventory.RailFurnaceGuiMenu;
import net.greywind.railsmelting.RailSmeltingMod;

public class RailSmeltingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RailSmeltingMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<RailFurnaceGuiMenu>> RAIL_FURNACE_GUI = REGISTRY.register("rail_furnace_gui", () -> IMenuTypeExtension.create(RailFurnaceGuiMenu::new));
}
