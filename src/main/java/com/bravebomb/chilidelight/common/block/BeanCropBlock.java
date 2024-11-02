package com.bravebomb.chilidelight.common.block;

import com.bravebomb.chilidelight.common.registry.CDBlocks;
import com.bravebomb.chilidelight.common.registry.CDItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BeanCropBlock extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntProperty AGE = Properties.AGE_3;

    public BeanCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return CDItems.BEANS.get();
    }
}
