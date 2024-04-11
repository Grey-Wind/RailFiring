
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.greywind.railsmelting.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RailSmeltingModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.RAIL, 15),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.POWERED_RAIL, 7),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.DETECTOR_RAIL, 10),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.ACTIVATOR_RAIL, 10),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(Blocks.RAIL), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(Blocks.POWERED_RAIL), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(Blocks.DETECTOR_RAIL), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(Blocks.ACTIVATOR_RAIL), 10, 5, 0.05f));
		}
	}
}
