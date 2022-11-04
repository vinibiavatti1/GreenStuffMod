package com.greenstuff;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

    public static final CreativeModeTab GREENSTUFF_TAB = new CreativeModeTab(GreenStuff.MODID) {

        @Override
        public ItemStack makeIcon() {
            return ModItems.AMNESIA_HAZE_BUD.get().getDefaultInstance();
        }
    };

}
