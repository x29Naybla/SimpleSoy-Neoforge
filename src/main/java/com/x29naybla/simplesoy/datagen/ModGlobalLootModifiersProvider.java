package com.x29naybla.simplesoy.datagen;

import com.x29naybla.simplesoy.SimpleSoy;
import com.x29naybla.simplesoy.item.ModItems;
import com.x29naybla.simplesoy.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, SimpleSoy.MOD_ID);
    }

    @Override
    protected void start() {
        add("soybeans_from_short_grass", new AddItemModifier(new LootItemCondition[]{
                LootTableIdCondition.builder(ResourceLocation.parse("blocks/short_grass")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()},
                ModItems.SOYBEANS.get()));

    }
}
