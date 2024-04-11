
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.greywind.railsmelting.block.RailFurnaceBlock;
import net.greywind.railsmelting.RailSmeltingMod;

public class RailSmeltingModBlocks {
	public static Block RAIL_FURNACE;

	public static void load() {
		RAIL_FURNACE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(RailSmeltingMod.MODID, "rail_furnace"), new RailFurnaceBlock());
	}

	public static void clientLoad() {
		RailFurnaceBlock.clientInit();
	}
}
