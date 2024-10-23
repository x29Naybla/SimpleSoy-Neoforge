package com.x29naybla.simplesoy.datagen;

import com.x29naybla.simplesoy.SimpleSoy;
import com.x29naybla.simplesoy.block.ModBlocks;
import com.x29naybla.simplesoy.item.ModItems;
import com.x29naybla.simplesoy.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.nbt.Tag;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SimpleSoy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //SimpleSoy Tags
        tag(ModTags.Items.COAGULANTS)
                .add(Items.APPLE)
                .addTag(Tags.Items.EGGS)
                .add(Items.KELP)
                .add(Items.SEAGRASS);

        //Common Tags
        tag(ModTags.Items.CROPS_SOYBEAN).add(ModItems.SOYBEANS.get());

        tag(ModTags.Items.CROPS_BEAN).add(ModItems.SOYBEANS.get());

        tag(Tags.Items.CROPS).add(ModItems.SOYBEANS.get());

        tag(Tags.Items.SEEDS).add(ModItems.SOYBEANS.get());

        tag(ModTags.Items.SOY_MILK).add(ModItems.SOY_MILK.get());

        tag(ModTags.Items.TOFU).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_COOKED_BACON).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_COOKED_BEEF).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_COOKED_CHICKEN).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_COOKED_COD).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_COOKED_MUTTON).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_COOKED_SALMON).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_MILK).add(ModItems.SOY_MILK.get());

        tag(ModTags.Items.FOODS_RAW_BACON).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_RAW_BEEF).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_RAW_CHICKEN).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_RAW_COD).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_RAW_MUTTON).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_RAW_SALMON).add(ModItems.TOFU.get());

        tag(ModTags.Items.FOODS_SOUP).add(ModItems.MISO_SOUP.get());

        tag(ModTags.Items.FOODS_TOFU).add(ModItems.TOFU.get());

        tag(ModTags.Items.MILK_SOY_MILK).add(ModItems.SOY_MILK.get());

        //Create Tags
        tag(ModTags.Items.CREATE_UPRIGHT_ON_BELT).add(ModItems.SOY_MILK.get());

        //Serene Seasons Tags
        tag(ModTags.Items.SPRING_CROPS).add(ModItems.SOYBEANS.get());

        tag(ModTags.Items.SUMMER_CROPS).add(ModItems.SOYBEANS.get());

        //Vanilla Tags
        tag(ItemTags.MEAT).add(ModItems.TOFU.get());

        tag(ItemTags.FISHES).add(ModItems.TOFU.get());

        tag(ItemTags.CHICKEN_FOOD).add(ModItems.SOYBEANS.get());

        tag(ItemTags.PARROT_FOOD).add(ModItems.SOYBEANS.get());

        tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).add(ModItems.SOYBEANS.get());

    }
}
