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

    // Hybrids Crops
    public static final RegistryObject<Block> PINEAPPLE_EXPRESS_CROP = BLOCKS.register("pineapple_express_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.PINEAPPLE_EXPRESS_SEEDS));
    public static final RegistryObject<Block> GELATO_CROP = BLOCKS.register("gelato_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.GELATO_SEEDS));
    public static final RegistryObject<Block> STRAWBERRY_BANANA_CROP = BLOCKS.register("strawberry_banana_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.STRAWBERRY_BANANA_SEEDS));
    public static final RegistryObject<Block> WHITE_WIDOW_CROP = BLOCKS.register("white_widow_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.WHITE_WIDOW_SEEDS));
    public static final RegistryObject<Block> WEDDING_CAKE_CROP = BLOCKS.register("wedding_cake_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.WEDDING_CAKE_SEEDS));
    public static final RegistryObject<Block> HEADBAND_CROP = BLOCKS.register("headband_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.HEADBAND_SEEDS));
    public static final RegistryObject<Block> CHERNOBYL_CROP = BLOCKS.register("chernobyl_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.CHERNOBYL_SEEDS));
    public static final RegistryObject<Block> GORILLA_GLUE_CROP = BLOCKS.register("gorilla_glue_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.GORILLA_GLUE_SEEDS));
    public static final RegistryObject<Block> BLUE_DREAM_CROP = BLOCKS.register("blue_dream_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.BLUE_DREAM_SEEDS));
    public static final RegistryObject<Block> BLUE_COOKIES_CROP = BLOCKS.register("blue_cookies_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.BLUE_COOKIES_SEEDS));
    public static final RegistryObject<Block> OG_KUSH_CROP = BLOCKS.register("og_kush_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.OG_KUSH_SEEDS));
    public static final RegistryObject<Block> PINK_KUSH_CROP = BLOCKS.register("pink_kush_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.PINK_KUSH_SEEDS));
    public static final RegistryObject<Block> MANGO_KUSH_CROP = BLOCKS.register("mango_kush_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.MANGO_KUSH_SEEDS));
    public static final RegistryObject<Block> KANDY_KUSH_CROP = BLOCKS.register("kandy_kush_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.KANDY_KUSH_SEEDS));
    public static final RegistryObject<Block> ORANGE_KUSH_CROP = BLOCKS.register("orange_kush_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.ORANGE_KUSH_SEEDS));
    public static final RegistryObject<Block> AK_47_CROP = BLOCKS.register("ak_47_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.AK_47_SEEDS));
    public static final RegistryObject<Block> GOLDEN_GOAT_CROP = BLOCKS.register("golden_goat_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.GOLDEN_GOAT_SEEDS));
    public static final RegistryObject<Block> JACK_FROST_CROP = BLOCKS.register("jack_frost_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.JACK_FROST_SEEDS));
    public static final RegistryObject<Block> BLACK_JACK_CROP = BLOCKS.register("black_jack_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.BLACK_JACK_SEEDS));
    public static final RegistryObject<Block> TRAINWRECK_CROP = BLOCKS.register("trainwreck_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.TRAINWRECK_SEEDS));
    public static final RegistryObject<Block> LEMON_DIESEL_CROP = BLOCKS.register("lemon_diesel_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.LEMON_DIESEL_SEEDS));
    public static final RegistryObject<Block> CHENDAWG_CROP = BLOCKS.register("chendawg_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.CHENDAWG_SEEDS));
    public static final RegistryObject<Block> CHERRY_PIE_CROP = BLOCKS.register("cherry_pie_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.CHERRY_PIE_SEEDS));
    public static final RegistryObject<Block> GIRL_SCOUT_COOKIES_CROP = BLOCKS.register("girl_scout_cookies_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.GIRL_SCOUT_COOKIES_SEEDS));
    public static final RegistryObject<Block> SHERBERT_CROP = BLOCKS.register("sherbert_crop", () -> new TallCropBlock(Block.Properties.copy(Blocks.WHEAT), ModItems.SHERBERT_SEEDS));
}
