
package net.greywind.railsmelting.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;

import net.greywind.railsmelting.ElementsRailSmeltingMod;

@ElementsRailSmeltingMod.ModElement.Tag
public class RecipePoweredRailBurn extends ElementsRailSmeltingMod.ModElement {
	public RecipePoweredRailBurn(ElementsRailSmeltingMod instance) {
		super(instance, 4);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.GOLDEN_RAIL, (int) (1)), new ItemStack(Items.GOLD_INGOT, (int) (1)), 3F);
	}
}
