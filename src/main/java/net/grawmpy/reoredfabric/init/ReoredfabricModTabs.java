
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reoredfabric.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class ReoredfabricModTabs {
	public static CreativeModeTab TAB_REORED_TOOLS;
	public static CreativeModeTab TAB_REORED_ARMORY;

	public static void load() {
		TAB_REORED_TOOLS = FabricItemGroupBuilder.create(new ResourceLocation("reoredfabric", "reored_tools")).icon(() -> new ItemStack(ReoredfabricModItems.COPPER_PICKAXE)).build();
		TAB_REORED_ARMORY = FabricItemGroupBuilder.create(new ResourceLocation("reoredfabric", "reored_armory")).icon(() -> new ItemStack(ReoredfabricModItems.COPPER_SWORD)).build();
	}
}
