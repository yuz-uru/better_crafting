package org.asuka.better_crafting;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.asuka.better_crafting.blocks.ModBlocks;
import org.asuka.better_crafting.items.ModItems;

@Mod (BetterCrafting.MODID)
public class BetterCrafting {
	public static final String MODID = "better_crafting";
	
	public BetterCrafting (FMLJavaModLoadingContext context) {
		IEventBus modEventBus = context.getModEventBus();
		
		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
	}
}