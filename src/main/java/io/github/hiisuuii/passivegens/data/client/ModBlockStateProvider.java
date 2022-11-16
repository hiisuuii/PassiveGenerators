package io.github.hiisuuii.passivegens.data.client;

import io.github.hiisuuii.passivegens.core.PassiveGens;
import io.github.hiisuuii.passivegens.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PassiveGens.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModBlockStateProvider extends BlockStateProvider{

	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, PassiveGens.MOD_ID, exFileHelper);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void registerStatesAndModels() {
		// TODO Auto-generated method stub
		simpleBlock(BlockInit.STONE_GENERATOR.get());
		simpleBlock(BlockInit.IRON_GENERATOR.get());
		simpleBlock(BlockInit.GOLD_GENERATOR.get());
		simpleBlock(BlockInit.DIAMOND_GENERATOR.get());
		simpleBlock(BlockInit.OBSIDIAN_GENERATOR.get());
		simpleBlock(BlockInit.EMERALD_GENERATOR.get());
		simpleBlock(BlockInit.NETHERITE_GENERATOR.get());
		
	}

}
