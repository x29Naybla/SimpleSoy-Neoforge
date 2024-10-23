package com.x29naybla.simplesoy.datagen;

import com.x29naybla.simplesoy.item.ModItems;
import com.x29naybla.simplesoy.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.crafting.DataComponentIngredient;

import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ItemStack waterBottle = Items.POTION.getDefaultInstance();
        waterBottle.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SOY_MILK.get(),1)
                .requires(ModItems.SOYBEANS,4)
                .requires(DataComponentIngredient.of(true, waterBottle))
                .unlockedBy("has_soybeans", has(ModItems.SOYBEANS)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.TOFU.get(),1)
                .requires(ModItems.SOY_MILK)
                .requires(ModTags.Items.COAGULANTS)
                .unlockedBy("has_soybeans", has(ModItems.SOYBEANS)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.MISO_SOUP.get(),1)
                .requires(ModItems.SOYBEANS)
                .requires(ModItems.TOFU)
                .requires(Items.KELP)
                .requires(Items.BROWN_MUSHROOM)
                .requires(Items.BOWL)
                .unlockedBy("has_soybeans", has(ModItems.SOYBEANS)).save(recipeOutput);
    }
}
