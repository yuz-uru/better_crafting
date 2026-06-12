package org.asuka.better_crafting.creativeTabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.asuka.better_crafting.BetterCrafting;
import org.asuka.better_crafting.items.ModItems;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterCrafting.MODID);
	
	public static final RegistryObject<CreativeModeTab> BETTER_CRAFTING_TAB = CREATIVE_MODE_TABS.register(
			"better_crafting_tab",
			() -> CreativeModeTab.builder()
								 .icon(() -> new ItemStack(ModItems.DIRTY_DIAMOND.get()))
								 .title(Component.translatable("creativetab.better_crafting.dirty_diamond_tab"))
								 .displayItems((params, output) -> {
									 // 在这里添加所有要显示的物品
									 output.accept(ModItems.DIRTY_DIAMOND_ORE.get());
									 output.accept(ModItems.DIRTY_DIAMOND.get());
									 output.accept(ModItems.DIRTY_DIAMOND_HELMET.get());
									 output.accept(ModItems.DIRTY_DIAMOND_CHESTPLATE.get());
									 output.accept(ModItems.DIRTY_DIAMOND_LEGGINGS.get());
									 output.accept(ModItems.DIRTY_DIAMOND_BOOTS.get());
									 output.accept(ModItems.DIRTY_DIAMOND_AXE.get());
									 output.accept(ModItems.DIRTY_DIAMOND_PICKAXE.get());
									 output.accept(ModItems.DIRTY_DIAMOND_SHOVEL.get());
									 output.accept(ModItems.DIRTY_DIAMOND_HOE.get());
									 output.accept(ModItems.DIRTY_DIAMOND_SWORD.get());
								 })
								 .build()
	);
	
	public static void register (IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}