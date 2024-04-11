
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.greywind.railsmelting.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.greywind.railsmelting.RailSmeltingMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class RailSmeltingModTabs {
	public static ResourceKey<CreativeModeTab> TAB_RAIL_SMELTING_CREATIVE_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(RailSmeltingMod.MODID, "rail_smelting_creative_tab"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_RAIL_SMELTING_CREATIVE_TAB,
				FabricItemGroup.builder().title(Component.translatable("item_group." + RailSmeltingMod.MODID + ".rail_smelting_creative_tab")).icon(() -> new ItemStack(Blocks.RAIL)).build());
	}
}
