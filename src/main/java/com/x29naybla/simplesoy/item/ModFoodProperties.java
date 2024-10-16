package com.x29naybla.simplesoy.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties SOY_MILK = new FoodProperties.Builder().nutrition(0).saturationModifier(0F).alwaysEdible().usingConvertsTo(Items.GLASS_BOTTLE).build();
    public static final FoodProperties TOFU = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();
    public static final FoodProperties MISO_SOUP = new FoodProperties.Builder().nutrition(7).saturationModifier(0.6F).usingConvertsTo(Items.BOWL).build();
}
