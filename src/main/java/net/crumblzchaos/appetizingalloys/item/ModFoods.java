package net.crumblzchaos.appetizingalloys.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties EDIBLEIRON = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200), 1f)
            .build();
    public static final FoodProperties EDIBLEGOLD = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 2), 1f)
            .build();
    public static final FoodProperties EDIBLECOPPER = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1), 1f)
            .build();
}
