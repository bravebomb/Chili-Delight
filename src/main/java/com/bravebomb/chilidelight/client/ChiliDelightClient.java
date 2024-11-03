package com.bravebomb.chilidelight.client;

import com.bravebomb.chilidelight.common.registry.CDBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.*;

public class ChiliDelightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CDBlocks.BEANS_BLOCK.get());
    }
}
