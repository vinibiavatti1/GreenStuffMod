package com.greenstuff;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;

public class ModPlacedFeatures {

    // Deferred Register
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, GreenStuff.MODID);

    // Weed Plant Indica
    public static final RegistryObject<PlacedFeature> BLUEBERRY = PLACED_FEATURES.register("blueberry_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.BLUEBERRY.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> BLUE_CHEESE = PLACED_FEATURES.register("blue_cheese_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.BLUE_CHEESE.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> PURPLE_KUSH = PLACED_FEATURES.register("purple_kush_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.PURPLE_KUSH.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> NORTHERN_LIGHTS = PLACED_FEATURES.register("northern_lights_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.NORTHERN_LIGHTS.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> GRAPE_APE = PLACED_FEATURES.register("grape_ape_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.GRAPE_APE.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    // Weed Plant Sativa
    public static final RegistryObject<PlacedFeature> LEMON_HAZE = PLACED_FEATURES.register("lemon_haze_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.LEMON_HAZE.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> AMNESIA_HAZE = PLACED_FEATURES.register("amnesia_haze_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.AMNESIA_HAZE.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> SOUR_DIESEL = PLACED_FEATURES.register("sour_diesel_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.SOUR_DIESEL.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> GREEN_CRACK = PLACED_FEATURES.register("green_crack_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.GREEN_CRACK.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> STRAWBERRY_COUGH = PLACED_FEATURES.register("strawberry_cough_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.STRAWBERRY_COUGH.getHolder().get(), Arrays.asList(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

}
