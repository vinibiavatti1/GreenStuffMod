package com.greenstuff.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class SmokableItem extends Item {
    public SmokableItem(Item.Properties p_41383_) {
        super(p_41383_.food(
                new FoodProperties.Builder()
                        .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3200, 1), 1)
                        .effect(new MobEffectInstance(MobEffects.HUNGER, 3200, 1), 1)
                        .alwaysEat()
                        .build()
        ));
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
