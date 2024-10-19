package com.x29naybla.simplesoy.datagen;

import com.x29naybla.simplesoy.SimpleSoy;
import com.x29naybla.simplesoy.block.ModBlocks;
import com.x29naybla.simplesoy.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SimpleSoy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        //Serene Seasons Tags
        tag(ModTags.Blocks.SPRING_CROPS).add(ModBlocks.SOY.get());

        tag(ModTags.Blocks.SUMMER_CROPS).add(ModBlocks.SOY.get());

        //Vanilla Tags
        tag(BlockTags.MINEABLE_WITH_AXE).add(ModBlocks.SOY.get());

        tag(BlockTags.BEE_GROWABLES).add(ModBlocks.SOY.get());

        tag(BlockTags.CROPS).add(ModBlocks.SOY.get());

        tag(BlockTags.MAINTAINS_FARMLAND).add(ModBlocks.SOY.get());

        tag(BlockTags.SWORD_EFFICIENT).add(ModBlocks.SOY.get());
    }
}
