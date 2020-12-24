
package net.mcreator.modxrt.block;

import net.minecraft.block.material.Material;

@ModXrtModElements.ModElement.Tag
public class SnowygrassstairsBlock extends ModXrtModElements.ModElement {

	@ObjectHolder("mod_xrt:snowygrassstairs")
	public static final Block block = null;

	public SnowygrassstairsBlock(ModXrtModElements instance) {
		super(instance, 512);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1f, 10f)).getDefaultState(),

					Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0).harvestLevel(0)
							.harvestTool(ToolType.SHOVEL));

			setRegistryName("snowygrassstairs");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DirtstairsBlock.block, (int) (1)));
		}

	}

}
