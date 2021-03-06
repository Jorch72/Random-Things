package lumien.randomthings.container.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotGhostItemHandlerStacked extends SlotItemHandler
{
	public SlotGhostItemHandlerStacked(IItemHandler itemHandler, int index, int xPosition, int yPosition)
	{
		super(itemHandler, index, xPosition, yPosition);
	}

	@Override
	public boolean canTakeStack(EntityPlayer playerIn)
	{
		ItemStack holding = playerIn.inventory.getItemStack();

		if (!holding.isEmpty())
		{
			holding = holding.copy();
		}
		this.putStack(holding);
		return false;
	}

	@Override
	public boolean isItemValid(ItemStack stack)
	{
		ItemStack copy = stack.copy();
		this.putStack(copy);
		return false;
	}

	@Override
	public ItemStack decrStackSize(int amount)
	{
		this.putStack(ItemStack.EMPTY);
		return ItemStack.EMPTY;
	}
}
