package com.greenstuff;

import com.greenstuff.item.SmokableItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Deferred Register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreenStuff.MODID);

    // Plants
    public static final RegistryObject<Item> AMNESIA_HAZE = ITEMS.register("amnesia_haze", () -> new BlockItem(ModBlocks.AMNESIA_HAZE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_CHEESE = ITEMS.register("blue_cheese", () -> new BlockItem(ModBlocks.BLUE_CHEESE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new BlockItem(ModBlocks.BLUEBERRY.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GRAPE_APE = ITEMS.register("grape_ape", () -> new BlockItem(ModBlocks.GRAPE_APE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GREEN_CRACK = ITEMS.register("green_crack", () -> new BlockItem(ModBlocks.GREEN_CRACK.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> LEMON_HAZE = ITEMS.register("lemon_haze", () -> new BlockItem(ModBlocks.LEMON_HAZE.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> NORTHERN_LIGHTS = ITEMS.register("northern_lights", () -> new BlockItem(ModBlocks.NORTHERN_LIGHTS.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PURPLE_KUSH = ITEMS.register("purple_kush", () -> new BlockItem(ModBlocks.PURPLE_KUSH.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SOUR_DIESEL = ITEMS.register("sour_diesel", () -> new BlockItem(ModBlocks.SOUR_DIESEL.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_COUGH = ITEMS.register("strawberry_cough", () -> new BlockItem(ModBlocks.STRAWBERRY_COUGH.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Seeds
    public static final RegistryObject<Item> AMNESIA_HAZE_SEEDS = ITEMS.register("amnesia_haze_seeds", () -> new BlockItem(ModBlocks.AMNESIA_HAZE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_CHEESE_SEEDS = ITEMS.register("blue_cheese_seeds", () -> new BlockItem(ModBlocks.BLUE_CHEESE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds", () -> new BlockItem(ModBlocks.BLUEBERRY_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GRAPE_APE_SEEDS = ITEMS.register("grape_ape_seeds", () -> new BlockItem(ModBlocks.GRAPE_APE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GREEN_CRACK_SEEDS = ITEMS.register("green_crack_seeds", () -> new BlockItem(ModBlocks.GREEN_CRACK_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> LEMON_HAZE_SEEDS = ITEMS.register("lemon_haze_seeds", () -> new BlockItem(ModBlocks.LEMON_HAZE_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> NORTHERN_LIGHTS_SEEDS = ITEMS.register("northern_lights_seeds", () -> new BlockItem(ModBlocks.NORTHERN_LIGHTS_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PURPLE_KUSH_SEEDS = ITEMS.register("purple_kush_seeds", () -> new BlockItem(ModBlocks.PURPLE_KUSH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SOUR_DIESEL_SEEDS = ITEMS.register("sour_diesel_seeds", () -> new BlockItem(ModBlocks.SOUR_DIESEL_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_COUGH_SEEDS = ITEMS.register("strawberry_cough_seeds", () -> new BlockItem(ModBlocks.STRAWBERRY_COUGH_CROP.get(), new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Buds
    public static final RegistryObject<Item> AMNESIA_HAZE_BUD = ITEMS.register("amnesia_haze_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUE_CHEESE_BUD = ITEMS.register("blue_cheese_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> BLUEBERRY_BUD = ITEMS.register("blueberry_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GRAPE_APE_BUD = ITEMS.register("grape_ape_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> GREEN_CRACK_BUD = ITEMS.register("green_crack_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> LEMON_HAZE_BUD = ITEMS.register("lemon_haze_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> NORTHERN_LIGHTS_BUD = ITEMS.register("northern_lights_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> PURPLE_KUSH_BUD = ITEMS.register("purple_kush_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> SOUR_DIESEL_BUD = ITEMS.register("sour_diesel_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_COUGH_BUD = ITEMS.register("strawberry_cough_bud", () -> new Item(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));

    // Joint
    public static final RegistryObject<Item> JOINT = ITEMS.register("joint", () -> new SmokableItem(new Item.Properties().tab(ModTabs.GREENSTUFF_TAB)));
}
