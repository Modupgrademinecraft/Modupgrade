
package net.mcreator.modxrt.block;

import net.minecraft.block.material.Material;

@ModXrtModElements.ModElement.Tag
public class PodzolslabBlock extends ModXrtModElements.ModElement {

	@ObjectHolder("mod_xrt:podzolslab")
	public static final Block block = null;

	public PodzolslabBlock(ModXrtModElements instance) {
		super(instance, 507);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0).harvestLevel(0)
							.harvestTool(ToolType.SHOVEL));

			setRegistryName("podzolslab");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DirtslabBlock.block, (int) (1)));
		}

	}

}
