package net.mcreator.modxrt.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modxrt.ModXrtModElements;

import java.util.Map;

@ModXrtModElements.ModElement.Tag
public class SoulsandslabEntityWalksOnTheBlockProcedure extends ModXrtModElements.ModElement {
	public SoulsandslabEntityWalksOnTheBlockProcedure(ModXrtModElements instance) {
		super(instance, 107);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SoulsandslabEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 5, (int) 0.5, (false), (false)));
	}
}
