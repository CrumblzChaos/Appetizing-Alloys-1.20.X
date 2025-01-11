package net.crumblzchaos.appetizingalloys.datagen;

import net.crumblzchaos.appetizingalloys.AppetizingAlloys;
import net.crumblzchaos.appetizingalloys.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.FOODGEM.get())
                .pattern(" A ")
                .pattern(" E ")
                .pattern(" A ")
                .define('A', Items.AMETHYST_SHARD)
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.EDIBLEIRON.get())
                .pattern("III")
                .pattern("I0I")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('0', ModItems.FOODGEM.get())
                .unlockedBy(getHasName(ModItems.FOODGEM.get()), has(ModItems.FOODGEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.EDIBLECOPPER.get())
                .pattern("CCC")
                .pattern("C0C")
                .pattern("CCC")
                .define('C', Items.COPPER_INGOT)
                .define('0', ModItems.FOODGEM.get())
                .unlockedBy(getHasName(ModItems.FOODGEM.get()), has(ModItems.FOODGEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.EDIBLEGOLD.get())
                .pattern("GGG")
                .pattern("G0G")
                .pattern("GGG")
                .define('G', Items.GOLD_INGOT)
                .define('0', ModItems.FOODGEM.get())
                .unlockedBy(getHasName(ModItems.FOODGEM.get()), has(ModItems.FOODGEM.get()))
                .save(pWriter);
    }

}
