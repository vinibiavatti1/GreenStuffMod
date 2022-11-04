package com.greenstuff;

import com.greenstuff.block.TallCropBlock;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    // Deferred Register
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GreenStuff.MODID);

    // Root Strains Plants
    public static final RegistryObject<Block> AMNESIA_HAZE = BLOCKS.register("amnesia_haze_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> BLUE_CHEESE = BLOCKS.register("blue_cheese_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> BLUEBERRY = BLOCKS.register("blueberry_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> GRAPE_APE = BLOCKS.register("grape_ape_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> GREEN_CRACK = BLOCKS.register("green_crack_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> LEMON_HAZE = BLOCKS.register("lemon_haze_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> NORTHERN_LIGHTS = BLOCKS.register("northern_lights_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> PURPLE_KUSH = BLOCKS.register("purple_kush_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> SOUR_DIESEL = BLOCKS.register("sour_diesel_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));
    public static final RegistryObject<Block> STRAWBERRY_COUGH = BLOCKS.register("strawberry_cough_plant", () -> new TallFlowerBlock(Block.Properties.copy(Blocks.TALL_GRASS)));

    // Root Strains Crops
    public static final RegistryObject<Block> AMNESIA_HAZE_CROP = BLOCKS.register("amnesia_haze_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.AMNESIA_HAZE_SEEDS));
    public static final RegistryObject<Block> BLUE_CHEESE_CROP = BLOCKS.register("blue_cheese_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.BLUE_CHEESE_SEEDS));
    public static final RegistryObject<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.BLUEBERRY_SEEDS));
    public static final RegistryObject<Block> GRAPE_APE_CROP = BLOCKS.register("grape_ape_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.GRAPE_APE_SEEDS));
    public static final RegistryObject<Block> GREEN_CRACK_CROP = BLOCKS.register("green_crack_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.GREEN_CRACK_SEEDS));
    public static final RegistryObject<Block> LEMON_HAZE_CROP = BLOCKS.register("lemon_haze_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.LEMON_HAZE_SEEDS));
    public static final RegistryObject<Block> NORTHERN_LIGHTS_CROP = BLOCKS.register("northern_lights_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.NORTHERN_LIGHTS_SEEDS));
    public static final RegistryObject<Block> PURPLE_KUSH_CROP = BLOCKS.register("purple_kush_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.PURPLE_KUSH_SEEDS));
    public static final RegistryObject<Block> SOUR_DIESEL_CROP = BLOCKS.register("sour_diesel_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.SOUR_DIESEL_SEEDS));
    public static final RegistryObject<Block> STRAWBERRY_COUGH_CROP = BLOCKS.register("strawberry_cough_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.STRAWBERRY_COUGH_SEEDS));

    // Hybrids
}
