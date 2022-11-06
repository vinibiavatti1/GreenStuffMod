package com.greenstuff;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.Comparator;

public class ModTabs {

    public static final CreativeModeTab GREENSTUFF_TAB = new CreativeModeTab(GreenStuff.MODID) {

        @Override
        public ItemStack makeIcon() {
            return ModItems.AMNESIA_HAZE_BUD.get().getDefaultInstance();
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> p_40778_) {

            // Plants
            p_40778_.add(new ItemStack(ModItems.BLUEBERRY.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_CHEESE.get()));
            p_40778_.add(new ItemStack(ModItems.PURPLE_KUSH.get()));
            p_40778_.add(new ItemStack(ModItems.NORTHERN_LIGHTS.get()));
            p_40778_.add(new ItemStack(ModItems.GRAPE_APE.get()));
            p_40778_.add(new ItemStack(ModItems.LEMON_HAZE.get()));
            p_40778_.add(new ItemStack(ModItems.AMNESIA_HAZE.get()));
            p_40778_.add(new ItemStack(ModItems.SOUR_DIESEL.get()));
            p_40778_.add(new ItemStack(ModItems.GREEN_CRACK.get()));
            p_40778_.add(new ItemStack(ModItems.STRAWBERRY_COUGH.get()));

            // Seeds Indica
            p_40778_.add(new ItemStack(ModItems.BLUEBERRY_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_CHEESE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.PURPLE_KUSH_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.NORTHERN_LIGHTS_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GRAPE_APE_SEEDS.get()));

            // Seeds Sativa
            p_40778_.add(new ItemStack(ModItems.LEMON_HAZE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.AMNESIA_HAZE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.SOUR_DIESEL_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GREEN_CRACK_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.STRAWBERRY_COUGH_SEEDS.get()));

            // Seeds Hybrid
            p_40778_.add(new ItemStack(ModItems.PINEAPPLE_EXPRESS_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GELATO_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.STRAWBERRY_BANANA_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.WHITE_WIDOW_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.WEDDING_CAKE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.HEADBAND_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.CHERNOBYL_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GORILLA_GLUE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_DREAM_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_COOKIES_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.OG_KUSH_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.PINK_KUSH_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.MANGO_KUSH_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.KANDY_KUSH_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.ORANGE_KUSH_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.AK_47_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GOLDEN_GOAT_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.JACK_FROST_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.BLACK_JACK_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.TRAINWRECK_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.LEMON_DIESEL_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.CHENDAWG_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.CHERRY_PIE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GIRL_SCOUT_COOKIES_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.SHERBERT_SEEDS.get()));

            // Buds Indica
            p_40778_.add(new ItemStack(ModItems.BLUEBERRY_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_CHEESE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.PURPLE_KUSH_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.NORTHERN_LIGHTS_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GRAPE_APE_BUD.get()));

            // Buds Sativa
            p_40778_.add(new ItemStack(ModItems.LEMON_HAZE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.AMNESIA_HAZE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.SOUR_DIESEL_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GREEN_CRACK_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.STRAWBERRY_COUGH_BUD.get()));

            // Buds Hybrid
            p_40778_.add(new ItemStack(ModItems.PINEAPPLE_EXPRESS_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GELATO_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.STRAWBERRY_BANANA_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.WHITE_WIDOW_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.WEDDING_CAKE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.HEADBAND_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.CHERNOBYL_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GORILLA_GLUE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_DREAM_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_COOKIES_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.OG_KUSH_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.PINK_KUSH_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.MANGO_KUSH_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.KANDY_KUSH_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.ORANGE_KUSH_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.AK_47_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GOLDEN_GOAT_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.JACK_FROST_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.BLACK_JACK_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.TRAINWRECK_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.LEMON_DIESEL_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.CHENDAWG_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.CHERRY_PIE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GIRL_SCOUT_COOKIES_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.SHERBERT_BUD.get()));

            // Misc
            p_40778_.add(new ItemStack(ModItems.HASH.get()));
            p_40778_.add(new ItemStack(ModItems.JOINT.get()));
            p_40778_.add(new ItemStack(ModItems.HASH_JOINT.get()));
            p_40778_.add(new ItemStack(ModItems.SPACE_COOKIE.get()));
        }
    };

}
