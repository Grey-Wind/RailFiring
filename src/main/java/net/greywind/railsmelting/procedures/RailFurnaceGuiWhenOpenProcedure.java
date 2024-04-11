package net.greywind.railsmelting.procedures;

import javax.annotation.Nullable;

public class RailFurnaceGuiWhenOpenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Blocks.RAIL.asItem() && (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.IRON_INGOT || new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) <= 0)) {
			BlockEntity _ent6 = world.getBlockEntity(BlockPos.containing(x, y, z));
			if (_ent6 != null) {
				((RandomizableContainerBlockEntity) _ent6).removeItem(0, 1);
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (BlockPos.containing(x, y, z)), 1) + 1));
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Blocks.DETECTOR_RAIL.asItem() && (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.IRON_INGOT || new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) <= 0)) {
			BlockEntity _ent15 = world.getBlockEntity(BlockPos.containing(x, y, z));
			if (_ent15 != null) {
				((RandomizableContainerBlockEntity) _ent15).removeItem(0, 1);
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (BlockPos.containing(x, y, z)), 1) + 1));
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Blocks.ACTIVATOR_RAIL.asItem() && (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.IRON_INGOT || new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) <= 0)) {
			BlockEntity _ent24 = world.getBlockEntity(BlockPos.containing(x, y, z));
			if (_ent24 != null) {
				((RandomizableContainerBlockEntity) _ent24).removeItem(0, 1);
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (BlockPos.containing(x, y, z)), 1) + 1));
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Blocks.POWERED_RAIL.asItem() && (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.GOLD_INGOT || new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger count = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
				if (_ent != null)
					count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
				return count.get();
			}
		}.getAmount(world, (BlockPos.containing(x, y, z)), 1) <= 0)) {
			BlockEntity _ent33 = world.getBlockEntity(BlockPos.containing(x, y, z));
			if (_ent33 != null) {
				((RandomizableContainerBlockEntity) _ent33).removeItem(0, 1);
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (BlockPos.containing(x, y, z)), 1) + 1));
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
