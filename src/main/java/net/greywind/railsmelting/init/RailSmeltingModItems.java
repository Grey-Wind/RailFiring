/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.greywind.railsmelting.RailSmeltingMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class RailSmeltingModItems {
	public static Item RAIL_FURNACE;

	public static void load() {
		RAIL_FURNACE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(RailSmeltingMod.MODID, "rail_furnace"), new BlockItem(RailSmeltingModBlocks.RAIL_FURNACE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(RailSmeltingModTabs.TAB_RAIL_SMELTING_CREATIVE_TAB).register(content -> content.accept(RAIL_FURNACE));
	}

	public static void clientLoad() {
	}
}
