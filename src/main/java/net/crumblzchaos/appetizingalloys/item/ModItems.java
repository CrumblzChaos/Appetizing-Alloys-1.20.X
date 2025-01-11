package net.crumblzchaos.appetizingalloys.item;


import com.google.common.eventbus.EventBus;
import net.crumblzchaos.appetizingalloys.AppetizingAlloys;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AppetizingAlloys.MODID);

    public static final RegistryObject<Item> FOODGEM = ITEMS.register("foodgem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EDIBLEIRON = ITEMS.register("edibleiron",
            () -> new Item(new Item.Properties().food(ModFoods.EDIBLEIRON)));
    public static final RegistryObject<Item> EDIBLEGOLD = ITEMS.register("ediblegold",
            () -> new Item(new Item.Properties().food(ModFoods.EDIBLEGOLD)));
    public static final RegistryObject<Item> EDIBLECOPPER = ITEMS.register("ediblecopper",
            () -> new Item(new Item.Properties().food(ModFoods.EDIBLECOPPER)));
    public static final RegistryObject<Item> ROSEGOLD = ITEMS.register("rosegold",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}