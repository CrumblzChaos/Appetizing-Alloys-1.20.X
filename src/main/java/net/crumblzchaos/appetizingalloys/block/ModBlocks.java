package net.crumblzchaos.appetizingalloys.block;

import net.crumblzchaos.appetizingalloys.AppetizingAlloys;
import net.crumblzchaos.appetizingalloys.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AppetizingAlloys.MODID);

    public static final RegistryObject<Block> ROSEGOLD_BLOCK = registerBlock("rosegold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    public static final RegistryObject<Block> METALLICINFUSER = registerBlock("metallicinfuser",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    //This part basically just creates the block item
    private static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> Block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(Block.get(), new Item.Properties()));
    }

    //This part registers the block in whole
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
