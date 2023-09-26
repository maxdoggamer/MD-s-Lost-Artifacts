package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogslostartifacts.entity.DoggyEntity;

public class NotDogProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DoggyEntity) && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player)) {
			return true;
		}
		return false;
	}
}
