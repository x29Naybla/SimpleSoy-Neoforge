package com.x29naybla.simplesoy.block.custom;

import com.x29naybla.simplesoy.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class SoyCropsBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age",0,5);

    public SoyCropsBlock(Properties properties) {
        super(properties);
    }

    protected ItemLike getBaseSeedId(){
        return ModItems.SOYBEANS.get();
    }

    public IntegerProperty getAgeProperty(){
        return AGE;
    }

    public int getMaxAge(){
        return 5;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, net.minecraft.world.level.block.state.BlockState> builder){
        builder.add(AGE);
    }
}
