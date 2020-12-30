package net.mcreator.modxrt.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.modxrt.enchantment.FullprotectionEnchantment;
import net.mcreator.modxrt.ModXrtModElements;

import java.util.function.Supplier;
import java.util.Map;

@ModXrtModElements.ModElement.Tag
public class ProtectionProcedure extends ModXrtModElements.ModElement {
	public ProtectionProcedure(ModXrtModElements instance) {
		super(instance, 536);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Protection!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure Protection!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0)))).isEnchanted())) {
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))))) == 1)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 1);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))))) == 2)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 2);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))))) == 3)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 3);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))))) == 4)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 4);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1)))).isEnchanted())) {
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))))) == 1)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 1);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))))) == 2)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 2);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))))) == 3)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 3);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))))) == 4)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 4);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (2)))).isEnchanted())) {
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (2))))) == 1)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 1);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (2))))) == 2)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 2);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (2))))) == 3)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 3);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (2))))) == 4)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 4);
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (3)))).isEnchanted())) {
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (3))))) == 1)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 1);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 1);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (3))))) == 2)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 2);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 2);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (3))))) == 3)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 3);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 3);
			}
			if (((EnchantmentHelper.getEnchantmentLevel(FullprotectionEnchantment.enchantment, (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (3))))) == 4)) {
				((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.FIRE_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.BLAST_PROTECTION, (int) 4);
				((itemstack)).addEnchantment(Enchantments.PROJECTILE_PROTECTION, (int) 4);
			}
		}
	}

	@SubscribeEvent
	public void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			int i = (int) entity.getPosX();
			int j = (int) entity.getPosY();
			int k = (int) entity.getPosZ();
			double duration = event.getDuration();
			ItemStack itemstack = event.getItem();
			World world = entity.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("itemstack", itemstack);
			dependencies.put("duration", duration);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
