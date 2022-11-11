package io.github.hiisuuii.passivegens.data.client;

import io.github.hiisuuii.passivegens.core.PassiveGens;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
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

		builder(itemGenerated,"generator_core");
		builder(itemGenerated,"component_tier1");
		builder(itemGenerated,"component_tier2");
		builder(itemGenerated,"component_tier3");
		builder(itemGenerated,"component_tier4");
	}
	
	ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
	
	
	private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
		return getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+name);
	}
	
}
