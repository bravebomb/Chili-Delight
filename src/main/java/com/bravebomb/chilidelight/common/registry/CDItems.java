package com.bravebomb.chilidelight.common.registry;
import com.bravebomb.chilidelight.common.utility.CDFoodValues;
import com.google.common.collect.Sets;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;

import net.minecraft.registry.Registries;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class CDItems {
    public static final LazyRegistrar<Item> ITEMS = LazyRegistrar.create(Registries.ITEM, "chilidelight");
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static Supplier<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        Supplier<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }


    //BLOCKS



    //ITEMS
    public static final Supplier<Item> BEANS;

    public CDItems() {
    }

    public static Item.Settings basicItem() {
        return (new Item.Settings());
    }

    public static Item.Settings foodItem(FoodComponent food) {
        return (new FabricItemSettings().food(food));
    }

    public static Item.Settings bowlFoodItem(FoodComponent food) {
        return (new Item.Settings()).food(food).recipeRemainder(Items.BOWL).maxCount(16);
    }
    public static Item.Settings bucketFoodItem(FoodComponent food) {
        return (new Item.Settings()).food(food).recipeRemainder(Items.BUCKET).maxCount(3);
    }

    static {
        BEANS = ITEMS.register("beans", () ->
                new AliasedBlockItem(CDBlocks.Bean_Crop_Block.get(),
                foodItem(CDFoodValues.BEANS).maxCount(64))
        );

    }
}

