package io.github.hiisuuii.passivegens.init;

import io.github.hiisuuii.passivegens.block.GeneratorCreativeBlock;
import io.github.hiisuuii.passivegens.block.GeneratorDiamondBlock;
import io.github.hiisuuii.passivegens.block.GeneratorEmeraldBlock;
import io.github.hiisuuii.passivegens.block.GeneratorGoldBlock;
import io.github.hiisuuii.passivegens.block.GeneratorIronBlock;
import io.github.hiisuuii.passivegens.block.GeneratorNetheriteBlock;
import io.github.hiisuuii.passivegens.block.GeneratorObsidianBlock;
import io.github.hiisuuii.passivegens.block.GeneratorStoneBlock;
import io.github.hiisuuii.passivegens.block.GeneratorUltimateBlock;
import io.github.hiisuuii.passivegens.core.PassiveGens;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PassiveGens.MOD_ID);
    
    public static final RegistryObject<Block> STONE_GENERATOR = BLOCKS.register("stone_generator", 
    		() -> new GeneratorStoneBlock(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> IRON_GENERATOR = BLOCKS.register("iron_generator", 
    		() -> new GeneratorIronBlock(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));    
    public static final RegistryObject<Block> GOLD_GENERATOR = BLOCKS.register("gold_generator", 
    		() -> new GeneratorGoldBlock(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));    
    public static final RegistryObject<Block> DIAMOND_GENERATOR = BLOCKS.register("diamond_generator", 
    		() -> new GeneratorDiamondBlock(AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK)));    
    public static final RegistryObject<Block> OBSIDIAN_GENERATOR = BLOCKS.register("obsidian_generator", 
    		() -> new GeneratorObsidianBlock(AbstractBlock.Properties.copy(Blocks.OBSIDIAN)));    
    public static final RegistryObject<Block> EMERALD_GENERATOR = BLOCKS.register("emerald_generator", 
    		() -> new GeneratorEmeraldBlock(AbstractBlock.Properties.copy(Blocks.EMERALD_BLOCK)));    
    public static final RegistryObject<Block> NETHERITE_GENERATOR = BLOCKS.register("netherite_generator", 
    		() -> new GeneratorNetheriteBlock(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK)));    
    public static final RegistryObject<Block> ULTIMATE_GENERATOR = BLOCKS.register("ultimate_generator", 
    		() -> new GeneratorUltimateBlock(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK)));    
    public static final RegistryObject<Block> CREATIVE_GENERATOR = BLOCKS.register("creative_generator", 
    		() -> new GeneratorCreativeBlock(AbstractBlock.Properties.copy(Blocks.STONE)));    
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach( (block) -> {
            final Item.Properties properties = new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }
}
