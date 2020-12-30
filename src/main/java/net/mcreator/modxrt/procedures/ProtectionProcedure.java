package net.mcreator.modxrt.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.modxrt.enchantment.FullprotectionEnchantment;
import net.mcreator.modxrt.ModXrtModElements;

import java.util.Map;

@ModXrtModElements.ModElement.Tag
public class ProtectionProcedure extends ModXrtModElements.ModElement {
	public ProtectionProcedure(ModXrtModElements instance) {
		super(instance, 536);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure Protection!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((itemstack)).isEnchanted())) {
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (itemstack))) == 1)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 1);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (itemstack))) == 2)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 2);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (itemstack))) == 3)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 3);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (itemstack))) == 4)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 4);
			}
		}
	}
}
