
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.greywind.railsmelting.block.RailFurnaceBlock;
import net.greywind.railsmelting.RailSmeltingMod;

public class RailSmeltingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, RailSmeltingMod.MODID);
	public static final DeferredHolder<Block, Block> RAIL_FURNACE = REGISTRY.register("rail_furnace", () -> new RailFurnaceBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
