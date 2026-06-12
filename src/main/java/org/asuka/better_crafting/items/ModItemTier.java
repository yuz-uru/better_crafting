package org.asuka.better_crafting.items;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

@SuppressWarnings ({"deprecation"})
public enum ModItemTier implements Tier {
	// 与铁相同的等级：level=2, durability=250, speed=6.0, damage=2.0, enchantability=14
	DIRTY_DIAMOND(2, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(ModItems.DIRTY_DIAMOND.get()));
	
	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyLoadedValue<Ingredient> repairIngredient;
	
	ModItemTier (int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.uses = durability;
		this.speed = miningSpeed;
		this.damage = damage;
		this.enchantmentValue = enchantability;
		this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
	}
	
	@Override
	public int getUses () {
		return this.uses;
	}
	
	@Override
	public float getSpeed () {
		return this.speed;
	}
	
	@Override
	public float getAttackDamageBonus () {
		return this.damage;
	}
	
	@Override
	public int getLevel () {
		return this.level;
	}
	
	@Override
	public int getEnchantmentValue () {
		return this.enchantmentValue;
	}
	
	@Override
	public @NotNull Ingredient getRepairIngredient () {
		return this.repairIngredient.get();
	}
}