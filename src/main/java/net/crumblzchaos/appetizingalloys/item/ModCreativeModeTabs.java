package net.crumblzchaos.appetizingalloys.item;

import net.crumblzchaos.appetizingalloys.AppetizingAlloys;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AppetizingAlloys.MODID);

    public static final RegistryObject<CreativeModeTab> INEDIBLE_NONALLOYS = CREATIVE_MODE_TABS.register("inedible_nonalloys",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOODGEM.get()))
                    .title(Component.translatable("creativetab.inedible_nonalloys"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FOODGEM.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EDIBLE_ALLOYS = CREATIVE_MODE_TABS.register("edible_alloys",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EDIBLEIRON.get()))
                    .title(Component.translatable("creativetab.edible_alloys"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EDIBLEIRON.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
