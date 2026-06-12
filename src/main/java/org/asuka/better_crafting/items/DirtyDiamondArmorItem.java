package org.asuka.better_crafting.items;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class DirtyDiamondArmorItem extends ArmorItem {
	public DirtyDiamondArmorItem (ArmorMaterial p_40386_, Type p_266831_, Properties p_40388_) {
		super(p_40386_, p_266831_, p_40388_);
	}
	
	@Override
	public @Nullable String getArmorTexture (ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
		int layer = (slot == EquipmentSlot.LEGS) ? 2 : 1;
		return "minecraft:textures/models/armor/diamond_layer_" + layer + ".png";
	}
}
