package net.crumblzchaos.appetizingalloys.datagen;

import net.crumblzchaos.appetizingalloys.AppetizingAlloys;
import net.crumblzchaos.appetizingalloys.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AppetizingAlloys.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.EDIBLECOPPER);
        simpleItem(ModItems.EDIBLEIRON);
        simpleItem(ModItems.EDIBLEGOLD);
        simpleItem(ModItems.FOODGEM);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AppetizingAlloys.MODID, "item/" + item.getId().getPath()));
    }
}
