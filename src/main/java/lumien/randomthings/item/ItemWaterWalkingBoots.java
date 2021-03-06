package lumien.randomthings.item;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemWaterWalkingBoots extends ItemArmor
{
	public ItemWaterWalkingBoots()
	{
		super(ItemArmor.ArmorMaterial.CHAIN, 0, EntityEquipmentSlot.FEET);
		ItemBase.registerItem("waterWalkingBoots", this);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return EnumRarity.RARE;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return "randomthings:textures/models/armor/waterWalkingBoots.png";
	}

	@Override
	public int getMaxDamage()
	{
		return 0;
	}

	@Override
	public boolean isDamageable()
	{
		return false;
	}
}
