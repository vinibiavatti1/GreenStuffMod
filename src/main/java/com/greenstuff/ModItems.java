package com.greenstuff;

import com.greenstuff.item.SmokableItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Deferred Register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreenStuff.MODID);

    // Plants Indica
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new BlockItem(ModBlocks.BLUEBERRY.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_CHEESE = ITEMS.register("blue_cheese", () -> new BlockItem(ModBlocks.BLUE_CHEESE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PURPLE_KUSH = ITEMS.register("purple_kush", () -> new BlockItem(ModBlocks.PURPLE_KUSH.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> NORTHERN_LIGHTS = ITEMS.register("northern_lights", () -> new BlockItem(ModBlocks.NORTHERN_LIGHTS.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GRAPE_APE = ITEMS.register("grape_ape", () -> new BlockItem(ModBlocks.GRAPE_APE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Plants Sativa
    public static final RegistryObject<Item> LEMON_HAZE = ITEMS.register("lemon_haze", () -> new BlockItem(ModBlocks.LEMON_HAZE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> AMNESIA_HAZE = ITEMS.register("amnesia_haze", () -> new BlockItem(ModBlocks.AMNESIA_HAZE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SOUR_DIESEL = ITEMS.register("sour_diesel", () -> new BlockItem(ModBlocks.SOUR_DIESEL.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GREEN_CRACK = ITEMS.register("green_crack", () -> new BlockItem(ModBlocks.GREEN_CRACK.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_COUGH = ITEMS.register("strawberry_cough", () -> new BlockItem(ModBlocks.STRAWBERRY_COUGH.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Seeds Indica
    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds", () -> new BlockItem(ModBlocks.BLUEBERRY_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_CHEESE_SEEDS = ITEMS.register("blue_cheese_seeds", () -> new BlockItem(ModBlocks.BLUE_CHEESE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PURPLE_KUSH_SEEDS = ITEMS.register("purple_kush_seeds", () -> new BlockItem(ModBlocks.PURPLE_KUSH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> NORTHERN_LIGHTS_SEEDS = ITEMS.register("northern_lights_seeds", () -> new BlockItem(ModBlocks.NORTHERN_LIGHTS_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GRAPE_APE_SEEDS = ITEMS.register("grape_ape_seeds", () -> new BlockItem(ModBlocks.GRAPE_APE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Seeds Sativa
    public static final RegistryObject<Item> LEMON_HAZE_SEEDS = ITEMS.register("lemon_haze_seeds", () -> new BlockItem(ModBlocks.LEMON_HAZE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> AMNESIA_HAZE_SEEDS = ITEMS.register("amnesia_haze_seeds", () -> new BlockItem(ModBlocks.AMNESIA_HAZE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SOUR_DIESEL_SEEDS = ITEMS.register("sour_diesel_seeds", () -> new BlockItem(ModBlocks.SOUR_DIESEL_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GREEN_CRACK_SEEDS = ITEMS.register("green_crack_seeds", () -> new BlockItem(ModBlocks.GREEN_CRACK_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_COUGH_SEEDS = ITEMS.register("strawberry_cough_seeds", () -> new BlockItem(ModBlocks.STRAWBERRY_COUGH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Seeds Hybrid
    public static final RegistryObject<Item> PINEAPPLE_EXPRESS_SEEDS = ITEMS.register("pineapple_express_seeds", () -> new BlockItem(ModBlocks.PINEAPPLE_EXPRESS_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GELATO_SEEDS = ITEMS.register("gelato_seeds", () -> new BlockItem(ModBlocks.GELATO_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_BANANA_SEEDS = ITEMS.register("strawberry_banana_seeds", () -> new BlockItem(ModBlocks.STRAWBERRY_BANANA_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> WHITE_WIDOW_SEEDS = ITEMS.register("white_widow_seeds", () -> new BlockItem(ModBlocks.WHITE_WIDOW_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> WEDDING_CAKE_SEEDS = ITEMS.register("wedding_cake_seeds", () -> new BlockItem(ModBlocks.WEDDING_CAKE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> HEADBAND_SEEDS = ITEMS.register("headband_seeds", () -> new BlockItem(ModBlocks.HEADBAND_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> CHERNOBYL_SEEDS = ITEMS.register("chernobyl_seeds", () -> new BlockItem(ModBlocks.CHERNOBYL_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GORILLA_GLUE_SEEDS = ITEMS.register("gorilla_glue_seeds", () -> new BlockItem(ModBlocks.GORILLA_GLUE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_DREAM_SEEDS = ITEMS.register("blue_dream_seeds", () -> new BlockItem(ModBlocks.BLUE_DREAM_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_COOKIES_SEEDS = ITEMS.register("blue_cookies_seeds", () -> new BlockItem(ModBlocks.BLUE_COOKIES_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> OG_KUSH_SEEDS = ITEMS.register("og_kush_seeds", () -> new BlockItem(ModBlocks.OG_KUSH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PINK_KUSH_SEEDS = ITEMS.register("pink_kush_seeds", () -> new BlockItem(ModBlocks.PINK_KUSH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> MANGO_KUSH_SEEDS = ITEMS.register("mango_kush_seeds", () -> new BlockItem(ModBlocks.MANGO_KUSH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> KANDY_KUSH_SEEDS = ITEMS.register("kandy_kush_seeds", () -> new BlockItem(ModBlocks.KANDY_KUSH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> ORANGE_KUSH_SEEDS = ITEMS.register("orange_kush_seeds", () -> new BlockItem(ModBlocks.ORANGE_KUSH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> AK_47_SEEDS = ITEMS.register("ak_47_seeds", () -> new BlockItem(ModBlocks.AK_47_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GOLDEN_GOAT_SEEDS = ITEMS.register("golden_goat_seeds", () -> new BlockItem(ModBlocks.GOLDEN_GOAT_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> JACK_FROST_SEEDS = ITEMS.register("jack_frost_seeds", () -> new BlockItem(ModBlocks.JACK_FROST_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLACK_JACK_SEEDS = ITEMS.register("black_jack_seeds", () -> new BlockItem(ModBlocks.BLACK_JACK_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> TRAINWRECK_SEEDS = ITEMS.register("trainwreck_seeds", () -> new BlockItem(ModBlocks.TRAINWRECK_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> LEMON_DIESEL_SEEDS = ITEMS.register("lemon_diesel_seeds", () -> new BlockItem(ModBlocks.LEMON_DIESEL_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> CHENDAWG_SEEDS = ITEMS.register("chendawg_seeds", () -> new BlockItem(ModBlocks.CHENDAWG_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> CHERRY_PIE_SEEDS = ITEMS.register("cherry_pie_seeds", () -> new BlockItem(ModBlocks.CHERRY_PIE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GIRL_SCOUT_COOKIES_SEEDS = ITEMS.register("girl_scout_cookies_seeds", () -> new BlockItem(ModBlocks.GIRL_SCOUT_COOKIES_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SHERBERT_SEEDS = ITEMS.register("sherbert_seeds", () -> new BlockItem(ModBlocks.SHERBERT_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Buds Indica
    public static final RegistryObject<Item> BLUEBERRY_BUD = ITEMS.register("blueberry_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_CHEESE_BUD = ITEMS.register("blue_cheese_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PURPLE_KUSH_BUD = ITEMS.register("purple_kush_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> NORTHERN_LIGHTS_BUD = ITEMS.register("northern_lights_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GRAPE_APE_BUD = ITEMS.register("grape_ape_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Buds Sativa
    public static final RegistryObject<Item> LEMON_HAZE_BUD = ITEMS.register("lemon_haze_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> AMNESIA_HAZE_BUD = ITEMS.register("amnesia_haze_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SOUR_DIESEL_BUD = ITEMS.register("sour_diesel_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GREEN_CRACK_BUD = ITEMS.register("green_crack_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_COUGH_BUD = ITEMS.register("strawberry_cough_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Buds Hybrid
    public static final RegistryObject<Item> PINEAPPLE_EXPRESS_BUD = ITEMS.register("pineapple_express_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GELATO_BUD = ITEMS.register("gelato_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_BANANA_BUD = ITEMS.register("strawberry_banana_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> WHITE_WIDOW_BUD = ITEMS.register("white_widow_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> WEDDING_CAKE_BUD = ITEMS.register("wedding_cake_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> HEADBAND_BUD = ITEMS.register("headband_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> CHERNOBYL_BUD = ITEMS.register("chernobyl_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GORILLA_GLUE_BUD = ITEMS.register("gorilla_glue_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_DREAM_BUD = ITEMS.register("blue_dream_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_COOKIES_BUD = ITEMS.register("blue_cookies_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> OG_KUSH_BUD = ITEMS.register("og_kush_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PINK_KUSH_BUD = ITEMS.register("pink_kush_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> MANGO_KUSH_BUD = ITEMS.register("mango_kush_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> KANDY_KUSH_BUD = ITEMS.register("kandy_kush_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> ORANGE_KUSH_BUD = ITEMS.register("orange_kush_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> AK_47_BUD = ITEMS.register("ak_47_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GOLDEN_GOAT_BUD = ITEMS.register("golden_goat_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> JACK_FROST_BUD = ITEMS.register("jack_frost_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLACK_JACK_BUD = ITEMS.register("black_jack_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> TRAINWRECK_BUD = ITEMS.register("trainwreck_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> LEMON_DIESEL_BUD = ITEMS.register("lemon_diesel_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> CHENDAWG_BUD = ITEMS.register("chendawg_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> CHERRY_PIE_BUD = ITEMS.register("cherry_pie_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GIRL_SCOUT_COOKIES_BUD = ITEMS.register("girl_scout_cookies_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SHERBERT_BUD = ITEMS.register("sherbert_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Food
    public static final RegistryObject<Item> SPACE_COOKIE = ITEMS.register("space_cookie", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 6400, 1), 1).effect(new MobEffectInstance(MobEffects.HUNGER, 6400, 1), 1).build()).tab(ModTabs.GREENSTUFF_TAB)));

    // Misc
    public static final RegistryObject<Item> HASH = ITEMS.register("hash", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> JOINT = ITEMS.register("joint", () -> new SmokableItem(new Item.Properties().food(new FoodProperties.Builder().effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3200, 1), 1).effect(new MobEffectInstance(MobEffects.HUNGER, 3200, 1), 1).alwaysEat().build()).tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> HASH_JOINT = ITEMS.register("hash_joint", () -> new SmokableItem(new Item.Properties().food(new FoodProperties.Builder().effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 6400, 1), 1).effect(new MobEffectInstance(MobEffects.HUNGER, 6400, 1), 1).effect(new MobEffectInstance(MobEffects.CONFUSION, 1600, 1), 1).alwaysEat().build()).tab(ModTabs.GREENSTUFF_TAB)));
}
