package com.bravebomb.chilidelight.common.utility;
import net.minecraft.item.*;


public class CDFoodValues {

    public static final FoodComponent BEANS = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.25f)
            .alwaysEdible().build();
}
