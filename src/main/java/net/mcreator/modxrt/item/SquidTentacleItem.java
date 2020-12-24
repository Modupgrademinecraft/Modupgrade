
package net.mcreator.modxrt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.modxrt.ModXrtModElements;

@ModXrtModElements.ModElement.Tag
public class SquidTentacleItem extends ModXrtModElements.ModElement {
	@ObjectHolder("mod_xrt:squid_tentacle")
	public static final Item block = null;
	public SquidTentacleItem(ModXrtModElements instance) {
		super(instance, 497);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).meat().build()));
			setRegistryName("squid_tentacle");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
