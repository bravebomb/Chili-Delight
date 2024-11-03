package com.bravebomb.chilidelight.client;

import com.bravebomb.chilidelight.common.registry.CDBlocks;
import io.github.fabricators_of_create.porting_lib.config.ConfigRegistry;
import io.github.fabricators_of_create.porting_lib.config.ConfigType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.*;
import vectorwing.farmersdelight.common.Configuration;


public class ChiliDelightClient implements ClientModInitializer {
    public static final String MODID = "chiilidelight";


    @Override
    public void onInitializeClient() {
        ConfigRegistry.registerConfig(MODID, ConfigType.CLIENT, Configuration.CLIENT_CONFIG);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CDBlocks.BEANS_BLOCK.get());
    }
}
