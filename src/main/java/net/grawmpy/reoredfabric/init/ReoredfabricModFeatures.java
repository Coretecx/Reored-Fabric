
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reoredfabric.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.grawmpy.reoredfabric.world.features.ores.SilverOreFeature;
import net.grawmpy.reoredfabric.world.features.ores.DeepslateSilverOreFeature;
import net.grawmpy.reoredfabric.ReoredfabricMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class ReoredfabricModFeatures {
	public static void load() {
		register("silver_ore", SilverOreFeature.feature(), SilverOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("deepslate_silver_ore", DeepslateSilverOreFeature.feature(), DeepslateSilverOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(ReoredfabricMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(ReoredfabricMod.MODID, registryName)));
	}
}
