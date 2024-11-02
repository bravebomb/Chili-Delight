package com.bravebomb.chilidelight.common.registry;

import com.bravebomb.chilidelight.common.block.BeanCropBlock;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;

import java.util.function.Supplier;

public class CDBlocks
{
    public static final LazyRegistrar<Block> BLOCKS = LazyRegistrar.create(Registries.BLOCK, "chilidelight");

    public static final Supplier<Block> Bean_Crop_Block;

    public CDBlocks() {
    }

    static {
        Bean_Crop_Block = BLOCKS.register("bean_crop_block", () ->
                new BeanCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT))
        );
    }
}
