
package net.mcreator.mcse.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.mcse.block.MCSEDungCakeBlock;
import net.mcreator.mcse.McseModElements;

@McseModElements.ModElement.Tag
public class MCSEDungCakeFuelFuel extends McseModElements.ModElement {
	public MCSEDungCakeFuelFuel(McseModElements instance) {
		super(instance, 9);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(MCSEDungCakeBlock.block, (int) (1)).getItem())
			event.setBurnTime(1200);
	}
}
