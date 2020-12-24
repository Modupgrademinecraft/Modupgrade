
package net.mcreator.modxrt.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.modxrt.ModXrtModElements;

@ModXrtModElements.ModElement.Tag
public class SunsetPainting extends ModXrtModElements.ModElement {
	public SunsetPainting(ModXrtModElements instance) {
		super(instance, 386);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 16).setRegistryName("sunset"));
	}
}
