package io.github.hiisuuii.passivegens.blockentity;

import io.github.hiisuuii.passivegens.init.TileInit;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.energy.CapabilityEnergy;

public class GeneratorIronTE extends GeneratorBaseTE {
	
	private int rfPerTick = 32;
	
	public GeneratorIronTE() {
		super(TileInit.TE_GENERATOR_IRON.get());
	}

	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		for(Direction direction : Direction.values()) {
			TileEntity te = level.getBlockEntity(worldPosition.relative(direction));
			if(te == null)
				continue;
			
			te.getCapability(CapabilityEnergy.ENERGY, direction.getOpposite()).ifPresent(storage ->
			{
				if(storage.canReceive())
					storage.receiveEnergy(rfPerTick, false);
			});
			
		}
	}

}
