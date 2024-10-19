package com.x29naybla.simplesoy.item;

import com.x29naybla.simplesoy.SimpleSoy;
import com.x29naybla.simplesoy.block.ModBlocks;
import com.x29naybla.simplesoy.item.custom.SoyMilkItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimpleSoy.MOD_ID);

    public static final DeferredItem<Item> SOYBEANS = ITEMS.register("soybeans",
            () -> new ItemNameBlockItem(ModBlocks.SOY.get(), new Item.Properties()));

    public static final DeferredItem<Item> SOY_MILK = ITEMS.register("soy_milk",
            () -> new SoyMilkItem(new Item.Properties().food(ModFoodProperties.SOY_MILK).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));

    public static final DeferredItem<Item> TOFU = ITEMS.register("tofu",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOFU)));

    public static final DeferredItem<Item> MISO_SOUP = ITEMS.register("miso_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MISO_SOUP).stacksTo(1).craftRemainder(Items.BOWL)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
