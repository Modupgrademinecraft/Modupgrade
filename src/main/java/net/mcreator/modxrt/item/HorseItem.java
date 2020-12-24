
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
public class HorseItem extends ModXrtModElements.ModElement {
	@ObjectHolder("mod_xrt:horse")
	public static final Item block = null;
	public HorseItem(ModXrtModElements instance) {
		super(instance, 501);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.3f).meat().build()));
			setRegistryName("horse");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
