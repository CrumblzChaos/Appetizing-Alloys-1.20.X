package net.crumblzchaos.appetizingalloys.datagen;

import net.crumblzchaos.appetizingalloys.AppetizingAlloys;
import net.crumblzchaos.appetizingalloys.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AppetizingAlloys.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Needs iron tool tag
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ROSEGOLD_BLOCK.get());
        //Needs pickaxe tag
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ROSEGOLD_BLOCK.get());
    }
}
