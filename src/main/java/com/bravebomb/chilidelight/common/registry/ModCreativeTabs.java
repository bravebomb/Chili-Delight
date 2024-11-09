package com.bravebomb.chilidelight.common.registry;


import com.bravebomb.chilidelight.ChiliDelight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeTabs {
 public static final ItemGroup CHILI_DELIGHT_GROUP = Registry.register(Registries.ITEM_GROUP,
         new Identifier(ChiliDelight.MOD_ID, "chili"),
         FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chili"))
                 .icon(() -> new ItemStack(CDItems.CHILI.get())).entries((displayContext, entries) -> {
                     entries.add(CDItems.BEANS.get());
                     entries.add(CDItems.CHILI.get());
                     entries.add((CDItems.BURNT_CHILI.get()));
                 }).build());

    public static void initialize() {
    }
}
