package com.greenstuff.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

/**
 * Smokable Item Base Class
 * @author ViniB
 */
public class SmokableItem extends Item {

    /**
     * Creates a new smokable item
     * @param p_41383_
     */
    public SmokableItem(Item.Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.BOW;
    }

    @Override
    public SoundEvent getEatingSound() {
        return null;
    }

}
