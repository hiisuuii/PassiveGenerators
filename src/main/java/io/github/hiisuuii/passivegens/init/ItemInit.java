package io.github.hiisuuii.passivegens.init;

import io.github.hiisuuii.passivegens.core.PassiveGens;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PassiveGens.MOD_ID);

    public static final RegistryObject<Item> GENERATOR_CORE = ITEMS.register("generator_core", 
    		() -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> COMPONENT_TIER1 = ITEMS.register("component_tier1", 
    		() -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> COMPONENT_TIER2 = ITEMS.register("component_tier2", 
    		() -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> COMPONENT_TIER3 = ITEMS.register("component_tier3", 
    		() -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> COMPONENT_TIER4 = ITEMS.register("component_tier4", 
    		() -> new Item(new Item.Properties()) );

}
