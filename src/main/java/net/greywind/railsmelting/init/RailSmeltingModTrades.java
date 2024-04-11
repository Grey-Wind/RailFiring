
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.greywind.railsmelting.init;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class RailSmeltingModTrades {
	public static void registerTrades() {
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
			factories.add(new BasicTrade(new ItemStack(Blocks.RAIL, 15), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
			factories.add(new BasicTrade(new ItemStack(Blocks.DETECTOR_RAIL, 10), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Blocks.ACTIVATOR_RAIL, 10), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> {
			factories.add(new BasicTrade(new ItemStack(Blocks.POWERED_RAIL, 7), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 5), ItemStack.EMPTY, new ItemStack(Blocks.RAIL), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 10), ItemStack.EMPTY, new ItemStack(Blocks.POWERED_RAIL), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 5), ItemStack.EMPTY, new ItemStack(Blocks.DETECTOR_RAIL), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 5), ItemStack.EMPTY, new ItemStack(Blocks.ACTIVATOR_RAIL), 10, 5, 0.05f));
		});
	}

	private record BasicTrade(ItemStack price, ItemStack price2, ItemStack offer, int maxTrades, int xp, float priceMult) implements VillagerTrades.ItemListing {
		@Override
		public @NotNull MerchantOffer getOffer(Entity entity, RandomSource random) {
			return new MerchantOffer(price, price2, offer, maxTrades, xp, priceMult);
		}
	}
}
