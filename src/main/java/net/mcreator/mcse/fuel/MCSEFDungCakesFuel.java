
package net.mcreator.mcse.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.mcse.item.MCSEDungCakesItem;
import net.mcreator.mcse.McseModElements;

@McseModElements.ModElement.Tag
public class MCSEFDungCakesFuel extends McseModElements.ModElement {
	public MCSEFDungCakesFuel(McseModElements instance) {
		super(instance, 7);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(MCSEDungCakesItem.block, (int) (1)).getItem())
			event.setBurnTime(1200);
	}
}
