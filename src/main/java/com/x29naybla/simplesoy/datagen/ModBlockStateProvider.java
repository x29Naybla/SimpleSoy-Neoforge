package com.x29naybla.simplesoy.datagen;

import com.x29naybla.simplesoy.SimpleSoy;
import com.x29naybla.simplesoy.block.ModBlocks;
import com.x29naybla.simplesoy.block.custom.SoyBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SimpleSoy.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        customStageBlock(ModBlocks.SOY.get(), resourceBlock("crop_cross"), "cross", SoyBlock.AGE, new ArrayList<>());
    }

    private String blockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return ResourceLocation.fromNamespaceAndPath(SimpleSoy.MOD_ID, "block/" + path);
    }

    public void customStageBlock(Block block, @Nullable ResourceLocation parent, String textureKey, IntegerProperty ageProperty, List<Integer> suffixes, Property<?>... ignored) {
        getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    int ageSuffix = state.getValue(ageProperty);
                    String stageName = blockName(block) + "_stage";
                    stageName += suffixes.isEmpty() ? ageSuffix : suffixes.get(Math.min(suffixes.size(), ageSuffix));
                    if (parent == null) {
                        return ConfiguredModel.builder()
                                .modelFile(models().cross(stageName, resourceBlock(stageName)).renderType("cutout")).build();
                    }
                    return ConfiguredModel.builder()
                            .modelFile(models().singleTexture(stageName, parent, textureKey, resourceBlock(stageName)).renderType("cutout")).build();
                }, ignored);
    }
}
