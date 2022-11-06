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

            // Seeds
            p_40778_.add(new ItemStack(ModItems.BLUEBERRY_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_CHEESE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.PURPLE_KUSH_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.NORTHERN_LIGHTS_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GRAPE_APE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.LEMON_HAZE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.AMNESIA_HAZE_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.SOUR_DIESEL_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.GREEN_CRACK_SEEDS.get()));
            p_40778_.add(new ItemStack(ModItems.STRAWBERRY_COUGH_SEEDS.get()));

            // Buds
            p_40778_.add(new ItemStack(ModItems.BLUEBERRY_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.BLUE_CHEESE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.PURPLE_KUSH_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.NORTHERN_LIGHTS_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GRAPE_APE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.LEMON_HAZE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.AMNESIA_HAZE_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.SOUR_DIESEL_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.GREEN_CRACK_BUD.get()));
            p_40778_.add(new ItemStack(ModItems.STRAWBERRY_COUGH_BUD.get()));

            // Misc
            p_40778_.add(new ItemStack(ModItems.HASH.get()));
            p_40778_.add(new ItemStack(ModItems.JOINT.get()));
            p_40778_.add(new ItemStack(ModItems.HASH_JOINT.get()));
            p_40778_.add(new ItemStack(ModItems.SPACE_COOKIE.get()));
        }
    };

}
