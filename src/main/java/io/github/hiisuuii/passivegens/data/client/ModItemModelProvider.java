package io.github.hiisuuii.passivegens.data.client;

import io.github.hiisuuii.passivegens.core.PassiveGens;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider{

	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, PassiveGens.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		withExistingParent("diamond_generator", mcLoc("block/diamond_block"));
	}
	
	ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
	
	getBuilder("dummy_item").parent(itemGenerated).texture("layer0","item/dummy_item");
	
}
