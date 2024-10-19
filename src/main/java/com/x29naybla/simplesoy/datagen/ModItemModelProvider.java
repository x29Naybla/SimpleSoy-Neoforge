package com.x29naybla.simplesoy.datagen;

import com.x29naybla.simplesoy.SimpleSoy;
import com.x29naybla.simplesoy.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SimpleSoy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SOYBEANS.get());
        basicItem(ModItems.SOY_MILK.get());
        basicItem(ModItems.TOFU.get());
        basicItem(ModItems.MISO_SOUP.get());
    }
}
