package com.greenstuff;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModConfiguredFeatures {

    // Deferred Register
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATUES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, GreenStuff.MODID);

    // Weed Plants Indica
    public static final RegistryObject<ConfiguredFeature<?, ?>> BLUEBERRY = CONFIGURED_FEATUES.register("blueberry_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUEBERRY.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BLUE_CHEESE = CONFIGURED_FEATUES.register("blue_cheese_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUE_CHEESE.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PURPLE_KUSH = CONFIGURED_FEATUES.register("purple_kush_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_KUSH.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NORTHERN_LIGHTS = CONFIGURED_FEATUES.register("northern_lights_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.NORTHERN_LIGHTS.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> GRAPE_APE = CONFIGURED_FEATUES.register("grape_ape_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GRAPE_APE.get()))))));

    // Weed Plants Sativa
    public static final RegistryObject<ConfiguredFeature<?, ?>> LEMON_HAZE = CONFIGURED_FEATUES.register("lemon_haze_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LEMON_HAZE.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> AMNESIA_HAZE = CONFIGURED_FEATUES.register("amnesia_haze_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.AMNESIA_HAZE.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SOUR_DIESEL = CONFIGURED_FEATUES.register("sour_diesel_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SOUR_DIESEL.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> GREEN_CRACK = CONFIGURED_FEATUES.register("green_crack_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GREEN_CRACK.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> STRAWBERRY_COUGH = CONFIGURED_FEATUES.register("strawberry_cough_configured", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(32, 5, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.STRAWBERRY_COUGH.get()))))));
}
