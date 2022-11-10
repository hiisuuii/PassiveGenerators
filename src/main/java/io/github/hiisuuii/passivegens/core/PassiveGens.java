package io.github.hiisuuii.passivegens.core;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.hiisuuii.passivegens.init.BlockInit;
import io.github.hiisuuii.passivegens.init.ItemInit;
import io.github.hiisuuii.passivegens.init.TileInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PassiveGens.MOD_ID)
public class PassiveGens {
	// Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final String MOD_ID = "passivegens";

    public PassiveGens() {
    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
        // Register the setup method for modloading
        modEventBus.addListener(this::setup);
        
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        TileInit.TILE_ENTITY_TYPES.register(modEventBus);
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Setting up PassiveGenerators");
    }

}
