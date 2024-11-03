package com.bravebomb.chilidelight.common.registry;

import com.bravebomb.chilidelight.common.block.BeansBlock;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.registry.Registries;

import java.util.function.Supplier;

public class CDBlocks
{
    public static final LazyRegistrar<Block> BLOCKS = LazyRegistrar.create(Registries.BLOCK, "chilidelight");

    public static final Supplier<CropBlock> BEANS_BLOCK;

    //public static final Supplier<Block> Test_Block;

    public CDBlocks() {
    }

    static {
        BEANS_BLOCK = BLOCKS.register("beans_crop", () ->
                new BeansBlock(FabricBlockSettings.copyOf(Blocks.WHEAT))
        );

    }
}
