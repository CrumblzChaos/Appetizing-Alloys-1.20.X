package net.crumblzchaos.appetizingalloys;

import com.mojang.logging.LogUtils;
import net.crumblzchaos.appetizingalloys.block.ModBlocks;
import net.crumblzchaos.appetizingalloys.item.ModCreativeModeTabs;
import net.crumblzchaos.appetizingalloys.item.ModItems;
import net.crumblzchaos.appetizingalloys.loot.ModLootModifiers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AppetizingAlloys.MODID)
public class AppetizingAlloys
{

    public static final String MODID = "appetizingalloys";

    private static final Logger LOGGER = LogUtils.getLogger();

    public AppetizingAlloys()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //this registers the creative tabs
        ModCreativeModeTabs.register(modEventBus);
        //this registers the mod items
        ModItems.register(modEventBus);
        //this registers the mod blocks
        ModBlocks.register(modEventBus);
        //this registers the loot modifiers
        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.FOODGEM);
            event.accept(ModItems.EDIBLEIRON);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
           
        }
    }
}
