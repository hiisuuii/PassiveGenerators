package io.github.hiisuuii.passivegens.blockentity;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public abstract class GeneratorBaseTE extends TileEntity implements ITickableTileEntity {

	public GeneratorBaseTE(TileEntityType<?> p_i48289_1_) {
		super(p_i48289_1_);
	}
	
	@Override
	public void tick() {
		
	}

}
