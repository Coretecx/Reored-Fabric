
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reoredfabric.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.grawmpy.reoredfabric.item.OakArmorItem;
import net.grawmpy.reoredfabric.item.CopperSwordItem;
import net.grawmpy.reoredfabric.item.CopperShovelItem;
import net.grawmpy.reoredfabric.item.CopperPickaxeItem;
import net.grawmpy.reoredfabric.item.CopperHoeItem;
import net.grawmpy.reoredfabric.item.CopperAxeItem;
import net.grawmpy.reoredfabric.item.CopperArmorItem;
import net.grawmpy.reoredfabric.ReoredfabricMod;

public class ReoredfabricModItems {
	public static Item OAK_ARMOR_HELMET;
	public static Item OAK_ARMOR_CHESTPLATE;
	public static Item OAK_ARMOR_LEGGINGS;
	public static Item OAK_ARMOR_BOOTS;
	public static Item COPPER_PICKAXE;
	public static Item COPPER_SWORD;
	public static Item COPPER_AXE;
	public static Item COPPER_SHOVEL;
	public static Item COPPER_HOE;
	public static Item COPPER_ARMOR_HELMET;
	public static Item COPPER_ARMOR_CHESTPLATE;
	public static Item COPPER_ARMOR_LEGGINGS;
	public static Item COPPER_ARMOR_BOOTS;

	public static void load() {
		OAK_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_helmet"), new OakArmorItem.Helmet());
		OAK_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_chestplate"), new OakArmorItem.Chestplate());
		OAK_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_leggings"), new OakArmorItem.Leggings());
		OAK_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_boots"), new OakArmorItem.Boots());
		COPPER_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_pickaxe"), new CopperPickaxeItem());
		COPPER_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_sword"), new CopperSwordItem());
		COPPER_AXE = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_axe"), new CopperAxeItem());
		COPPER_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_shovel"), new CopperShovelItem());
		COPPER_HOE = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_hoe"), new CopperHoeItem());
		COPPER_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_armor_helmet"), new CopperArmorItem.Helmet());
		COPPER_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_armor_chestplate"), new CopperArmorItem.Chestplate());
		COPPER_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_armor_leggings"), new CopperArmorItem.Leggings());
		COPPER_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "copper_armor_boots"), new CopperArmorItem.Boots());
	}
}
