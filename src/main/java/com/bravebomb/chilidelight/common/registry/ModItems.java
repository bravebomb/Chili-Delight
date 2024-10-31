package com.bravebomb.chilidelight.common.registry;
import com.bravebomb.chilidelight.common.utility.CDFoodValues;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

import net.minecraft.registry.Registries;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ModItems {
    public static final LazyRegistrar<Item> ITEMS = LazyRegistrar.create(Registries.ITEM, "chilidelight");

    public static final Supplier<Item> BEANS;

    public ModItems() {
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
                new ConsumableItem(foodItem(CDFoodValues.BEANS).maxCount(64))
        );

    }
}

