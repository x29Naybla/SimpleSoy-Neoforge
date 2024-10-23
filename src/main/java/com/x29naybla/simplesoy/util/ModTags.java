package com.x29naybla.simplesoy.util;

import com.x29naybla.simplesoy.SimpleSoy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static final String CREATE = "create";
    public static final String SS = "sereneseasons";

    public static class Blocks {
        public static final TagKey<Block> SPRING_CROPS = externalBlockTag(SS,"spring_crops");
        public static final TagKey<Block> SUMMER_CROPS = externalBlockTag(SS,"summer_crops");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SimpleSoy.MOD_ID, name));
        }

        private static TagKey<Block> commonBlockTag(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Block> externalBlockTag(String modId, String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(modId, path));
        }
    }

    public static class Items {
        //SimpleSoy Tags
        public static final TagKey<Item> COAGULANTS = createTag("coagulants");

        //Common Tags
        public static final TagKey<Item> CROPS_SOYBEAN = commonItemTag("crops/soybean");
        public static final TagKey<Item> CROPS_BEAN = commonItemTag("crops/bean");
        public static final TagKey<Item> SOY_MILK = commonItemTag("soy_milk");
        public static final TagKey<Item> TOFU = commonItemTag("tofu");
        public static final TagKey<Item> FOODS_COOKED_BACON = commonItemTag("foods/cooked_bacon");
        public static final TagKey<Item> FOODS_COOKED_BEEF = commonItemTag("foods/cooked_beef");
        public static final TagKey<Item> FOODS_COOKED_CHICKEN = commonItemTag("foods/cooked_chicken");
        public static final TagKey<Item> FOODS_COOKED_COD = commonItemTag("foods/cooked_cod");
        public static final TagKey<Item> FOODS_COOKED_MUTTON = commonItemTag("foods/cooked_mutton");
        public static final TagKey<Item> FOODS_COOKED_SALMON = commonItemTag("foods/cooked_salmon");
        public static final TagKey<Item> FOODS_MILK = commonItemTag("foods/milk");
        public static final TagKey<Item> FOODS_RAW_BACON = commonItemTag("foods/raw_bacon");
        public static final TagKey<Item> FOODS_RAW_BEEF = commonItemTag("foods/raw_beef");
        public static final TagKey<Item> FOODS_RAW_CHICKEN = commonItemTag("foods/raw_chicken");
        public static final TagKey<Item> FOODS_RAW_COD = commonItemTag("foods/raw_cod");
        public static final TagKey<Item> FOODS_RAW_MUTTON = commonItemTag("foods/raw_mutton");
        public static final TagKey<Item> FOODS_RAW_SALMON = commonItemTag("foods/raw_salmon");
        public static final TagKey<Item> FOODS_SOUP = commonItemTag("foods/soup");
        public static final TagKey<Item> FOODS_TOFU = commonItemTag("foods/tofu");
        public static final TagKey<Item> MILK_SOY_MILK = commonItemTag("milk/soy_milk");

        //Create Tags
        public static final TagKey<Item> CREATE_UPRIGHT_ON_BELT = externalItemTag(CREATE,"upright_on_belt");

        //Serene Seasons Tags
        public static final TagKey<Item> SPRING_CROPS = externalItemTag(SS,"spring_crops");
        public static final TagKey<Item> SUMMER_CROPS = externalItemTag(SS,"summer_crops");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SimpleSoy.MOD_ID, name));
        }

        private static TagKey<Item> commonItemTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Item> externalItemTag(String modId, String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(modId, path));
        }
    }

}
