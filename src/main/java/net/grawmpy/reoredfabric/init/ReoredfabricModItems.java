
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reoredfabric.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.grawmpy.reoredfabric.item.OakArmorItem;
import net.grawmpy.reoredfabric.ReoredfabricMod;

public class ReoredfabricModItems {
	public static Item OAK_ARMOR_HELMET;
	public static Item OAK_ARMOR_CHESTPLATE;
	public static Item OAK_ARMOR_LEGGINGS;
	public static Item OAK_ARMOR_BOOTS;

	public static void load() {
		OAK_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_helmet"), new OakArmorItem.Helmet());
		OAK_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_chestplate"), new OakArmorItem.Chestplate());
		OAK_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_leggings"), new OakArmorItem.Leggings());
		OAK_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(ReoredfabricMod.MODID, "oak_armor_boots"), new OakArmorItem.Boots());
	}
}
