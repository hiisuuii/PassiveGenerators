package io.github.hiisuuii.passivegens.data;

import java.io.IOException;

import io.github.hiisuuii.passivegens.core.PassiveGens;
import io.github.hiisuuii.passivegens.data.client.ModBlockStateProvider;
import io.github.hiisuuii.passivegens.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = PassiveGens.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
	private DataGenerators() {};
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) throws IOException {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper();
		gen.addProvider(new ModItemModelProvider(gen, helper));
		gen.addProvider(new ModBlockStateProvider(gen, helper));
		gen.run();
	}
}
