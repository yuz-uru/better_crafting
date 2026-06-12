package org.asuka.better_crafting.items;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.asuka.better_crafting.BetterCrafting;
import org.asuka.better_crafting.blocks.ModBlocks;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
																			   BetterCrafting.MODID);
	
	// ==================== 基础物品 ====================
	public static final RegistryObject<Item> DIRTY_DIAMOND = ITEMS.register("dirty_diamond",
																			() -> new Item(new Item.Properties()));
	
	// ==================== 工具 ====================
	// 剑: 基础攻击3, 攻击速度-2.4 (与铁剑相同)
	public static final RegistryObject<Item> DIRTY_DIAMOND_SWORD = ITEMS.register("dirty_diamond_sword",
																				  () -> new SwordItem(
																						  ModItemTier.DIRTY_DIAMOND, 3,
																						  -2.4F,
																						  new Item.Properties()));
	
	// 镐: 基础攻击1, 攻击速度-2.8 (与铁镐相同)
	public static final RegistryObject<Item> DIRTY_DIAMOND_PICKAXE = ITEMS.register("dirty_diamond_pickaxe",
																					() -> new PickaxeItem(
																							ModItemTier.DIRTY_DIAMOND,
																							1, -2.8F,
																							new Item.Properties()));
	
	// 锹: 基础攻击1.5, 攻击速度-3.0 (与铁锹相同)
	public static final RegistryObject<Item> DIRTY_DIAMOND_SHOVEL = ITEMS.register("dirty_diamond_shovel",
																				   () -> new ShovelItem(
																						   ModItemTier.DIRTY_DIAMOND,
																						   1.5F, -3.0F,
																						   new Item.Properties()));
	
	// 斧: 基础攻击6, 攻击速度-3.1 (与铁斧相同)
	public static final RegistryObject<Item> DIRTY_DIAMOND_AXE = ITEMS.register("dirty_diamond_axe",
																				() -> new AxeItem(
																						ModItemTier.DIRTY_DIAMOND, 6.0F,
																						-3.1F, new Item.Properties()));
	
	// 锄: 基础攻击-2, 攻击速度-1.0 (与铁锄相同)
	public static final RegistryObject<Item> DIRTY_DIAMOND_HOE = ITEMS.register("dirty_diamond_hoe",
																				() -> new HoeItem(
																						ModItemTier.DIRTY_DIAMOND, -2,
																						-1.0F, new Item.Properties()));
	
	// ==================== 盔甲 ====================
	public static final RegistryObject<Item> DIRTY_DIAMOND_HELMET = ITEMS.register("dirty_diamond_helmet",
																				   () -> new DirtyDiamondArmorItem(
																						   ModArmorMaterial.DIRTY_DIAMOND,
																						   ArmorItem.Type.HELMET,
																						   new Item.Properties()));
	
	public static final RegistryObject<Item> DIRTY_DIAMOND_CHESTPLATE = ITEMS.register("dirty_diamond_chestplate",
																					   () -> new DirtyDiamondArmorItem(
																							   ModArmorMaterial.DIRTY_DIAMOND,
																							   ArmorItem.Type.CHESTPLATE,
																							   new Item.Properties()));
	
	public static final RegistryObject<Item> DIRTY_DIAMOND_LEGGINGS = ITEMS.register("dirty_diamond_leggings",
																					 () -> new DirtyDiamondArmorItem(
																							 ModArmorMaterial.DIRTY_DIAMOND,
																							 ArmorItem.Type.LEGGINGS,
																							 new Item.Properties()));
	
	public static final RegistryObject<Item> DIRTY_DIAMOND_BOOTS = ITEMS.register("dirty_diamond_boots",
																				  () -> new DirtyDiamondArmorItem(
																						  ModArmorMaterial.DIRTY_DIAMOND,
																						  ArmorItem.Type.BOOTS,
																						  new Item.Properties()));
	
	public static final RegistryObject<Item> DIRTY_DIAMOND_ORE = ITEMS.register(
			"dirty_diamond_ore",
			() -> new BlockItem(
					ModBlocks.DIRTY_DIAMOND_ORE.get(),
					new Item.Properties()
			)
	);
}