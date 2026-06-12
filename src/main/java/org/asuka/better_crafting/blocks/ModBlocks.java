package org.asuka.better_crafting.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.asuka.better_crafting.BetterCrafting;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, BetterCrafting.MODID);
	
	// 使用 BlockBehaviour.Properties.copy() 复制钻石矿的所有属性
	// 钻石矿属性：硬度 3，爆炸抗性 3，需要镐子挖掘，掉落经验 3-7
	public static final RegistryObject<Block> DIRTY_DIAMOND_ORE = BLOCKS.register(
			"dirty_diamond_ore",
			() -> new DropExperienceBlock(
					BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
											 .strength(3.0f, 3.0f)           // 硬度 3，爆炸抗性 3
											 .sound(SoundType.STONE)          // 石头音效
											 .requiresCorrectToolForDrops(),  // 需要正确工具才掉落
					UniformInt.of(3, 7)                  // 掉落 3-7 点经验
			)
	);
	
	public static void register(IEventBus eventBus){
		BLOCKS.register(eventBus);
	}
}
