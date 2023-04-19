package net.mcreator.mcse.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.mcse.item.MCSECowDungItem;
import net.mcreator.mcse.McseModElements;
import net.mcreator.mcse.McseMod;

import java.util.Map;

@McseModElements.ModElement.Tag
public class MCSEDropCowDungProcedure extends McseModElements.ModElement {
	public MCSEDropCowDungProcedure(McseModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				McseMod.LOGGER.warn("Failed to load dependency x for procedure MCSEDropCowDung!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				McseMod.LOGGER.warn("Failed to load dependency y for procedure MCSEDropCowDung!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				McseMod.LOGGER.warn("Failed to load dependency z for procedure MCSEDropCowDung!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McseMod.LOGGER.warn("Failed to load dependency world for procedure MCSEDropCowDung!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(MCSECowDungItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
	}
}
