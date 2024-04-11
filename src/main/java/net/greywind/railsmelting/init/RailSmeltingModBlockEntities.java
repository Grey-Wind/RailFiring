
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.greywind.railsmelting.block.entity.RailFurnaceBlockEntity;
import net.greywind.railsmelting.RailSmeltingMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class RailSmeltingModBlockEntities {
	public static BlockEntityType<?> RAIL_FURNACE;

	public static void load() {
		RAIL_FURNACE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(RailSmeltingMod.MODID, "rail_furnace"),
				FabricBlockEntityTypeBuilder.create(RailFurnaceBlockEntity::new, RailSmeltingModBlocks.RAIL_FURNACE).build(null));
	}
}
