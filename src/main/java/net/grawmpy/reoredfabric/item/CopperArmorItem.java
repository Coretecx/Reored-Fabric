
package net.grawmpy.reoredfabric.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import net.grawmpy.reoredfabric.init.ReoredfabricModTabs;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public abstract class CopperArmorItem extends ArmorItem {
	public CopperArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 14;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.ARMOR_EQUIP_IRON;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "copper_";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CopperArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ReoredfabricModTabs.TAB_REORED_ARMORY));
		}

	}

	public static class Chestplate extends CopperArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ReoredfabricModTabs.TAB_REORED_ARMORY));
		}

	}

	public static class Leggings extends CopperArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ReoredfabricModTabs.TAB_REORED_ARMORY));
		}

	}

	public static class Boots extends CopperArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ReoredfabricModTabs.TAB_REORED_ARMORY));
		}

	}
}
