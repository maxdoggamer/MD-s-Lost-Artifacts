package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraft.world.entity.Entity;

public class LegendarySwordOfDoggoRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		BecomeTheBearerOfTheSwordProcedure.execute(entity);
	}
}
