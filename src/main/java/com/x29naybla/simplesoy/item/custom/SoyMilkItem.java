package com.x29naybla.simplesoy.item.custom;

import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;

public class SoyMilkItem extends Item {
    public SoyMilkItem(Properties properties) {
        super(properties);
        getCraftingRemainingItem(Items.GLASS_BOTTLE.getDefaultInstance());
    }

    public UseAnim getUseAnimation(ItemStack stack) {
        return stack.has(DataComponents.FOOD) ? UseAnim.DRINK : UseAnim.NONE;
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    public SoundEvent getEatingSound(){
        return SoundEvents.GENERIC_DRINK;
    }
}
