
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.greywind.railsmelting.RailSmeltingMod;

public class RailSmeltingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RailSmeltingMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RAIL_SMELTING_CREATIVE_TAB = REGISTRY.register("rail_smelting_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rail_smelting.rail_smelting_creative_tab")).icon(() -> new ItemStack(Blocks.RAIL)).displayItems((parameters, tabData) -> {
				tabData.accept(RailSmeltingModBlocks.RAIL_FURNACE.get().asItem());
			})

					.build());
}
