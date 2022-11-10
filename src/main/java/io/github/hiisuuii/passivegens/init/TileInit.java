package io.github.hiisuuii.passivegens.init;

import io.github.hiisuuii.passivegens.blockentity.GeneratorBaseTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorCreativeTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorDiamondTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorEmeraldTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorGoldTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorIronTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorNetheriteTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorObsidianTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorStoneTE;
import io.github.hiisuuii.passivegens.blockentity.GeneratorUltimateTE;
import io.github.hiisuuii.passivegens.core.PassiveGens;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileInit {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, PassiveGens.MOD_ID);
    
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_STONE = TILE_ENTITY_TYPES.register("te_generator_stone", 
    		() -> TileEntityType.Builder.of(GeneratorStoneTE::new, BlockInit.STONE_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_IRON = TILE_ENTITY_TYPES.register("te_generator_iron", 
    		() -> TileEntityType.Builder.of(GeneratorIronTE::new, BlockInit.IRON_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_GOLD = TILE_ENTITY_TYPES.register("te_generator_gold", 
    		() -> TileEntityType.Builder.of(GeneratorGoldTE::new, BlockInit.GOLD_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_DIAMOND = TILE_ENTITY_TYPES.register("te_generator_diamond", 
    		() -> TileEntityType.Builder.of(GeneratorDiamondTE::new, BlockInit.DIAMOND_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_OBSIDIAN = TILE_ENTITY_TYPES.register("te_generator_obsidian", 
    		() -> TileEntityType.Builder.of(GeneratorObsidianTE::new, BlockInit.OBSIDIAN_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_EMERALD= TILE_ENTITY_TYPES.register("te_generator_emerald", 
    		() -> TileEntityType.Builder.of(GeneratorEmeraldTE::new, BlockInit.EMERALD_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_NETHERITE = TILE_ENTITY_TYPES.register("te_generator_netherite", 
    		() -> TileEntityType.Builder.of(GeneratorNetheriteTE::new, BlockInit.NETHERITE_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_ULTIMATE = TILE_ENTITY_TYPES.register("te_generator_ultimate", 
    		() -> TileEntityType.Builder.of(GeneratorUltimateTE::new, BlockInit.ULTIMATE_GENERATOR.get()).build(null) );
    public static final RegistryObject<TileEntityType<? extends GeneratorBaseTE>> TE_GENERATOR_CREATIVE = TILE_ENTITY_TYPES.register("te_generator_creative", 
    		() -> TileEntityType.Builder.of(GeneratorCreativeTE::new, BlockInit.CREATIVE_GENERATOR.get()).build(null) );
	
}
