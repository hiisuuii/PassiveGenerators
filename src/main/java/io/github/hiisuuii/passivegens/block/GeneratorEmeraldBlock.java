package io.github.hiisuuii.passivegens.block;

import io.github.hiisuuii.passivegens.init.TileInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class GeneratorEmeraldBlock extends Block {

	public GeneratorEmeraldBlock(Properties p_i48440_1_) {
		super(p_i48440_1_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileInit.TE_GENERATOR_EMERALD.get().create();
	}

}
