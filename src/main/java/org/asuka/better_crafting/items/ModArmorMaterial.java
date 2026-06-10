package org.asuka.better_crafting.items;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
	// 与铁相同的等级
	// 基础耐久乘数：铁=15
	// 保护值：铁头盔=2, 铁胸甲=5, 铁护腿=6, 铁靴子=2
	DIRTY_DIAMOND("dirty_diamond", 15, new int[] {2, 5, 6, 2}, 14,
				  SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
				  () -> Ingredient.of(ModItems.DIRTY_DIAMOND.get()));
	
	private static final int[] HEALTH_PER_SLOT = new int[] {13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyLoadedValue<Ingredient> repairIngredient;
	
	ModArmorMaterial (String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
					  SoundEvent sound, float toughness, float knockbackResistance,
					  Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.slotProtections = slotProtections;
		this.enchantmentValue = enchantmentValue;
		this.sound = sound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
	}
	
	@Override
	public int getDurabilityForType (ArmorItem.Type type) {
		return HEALTH_PER_SLOT[type.ordinal()] * this.durabilityMultiplier;
	}
	
	@Override
	public int getDefenseForType (ArmorItem.Type type) {
		return this.slotProtections[type.ordinal()];
	}
	
	@Override
	public int getEnchantmentValue () {
		return this.enchantmentValue;
	}
	
	@Override
	public @NotNull SoundEvent getEquipSound () {
		return this.sound;
	}
	
	@Override
	public @NotNull Ingredient getRepairIngredient () {
		return this.repairIngredient.get();
	}
	
	@Override
	public @NotNull String getName () {
		return this.name;
	}
	
	@Override
	public float getToughness () {
		return this.toughness;
	}
	
	@Override
	public float getKnockbackResistance () {
		return this.knockbackResistance;
	}
}