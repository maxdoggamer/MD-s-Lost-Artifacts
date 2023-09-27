package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogslostartifacts.MaxdogsLostArtifactsMod;

public class DoggyOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		MaxdogsLostArtifactsMod.queueServerWork(600, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(0);
		});
	}
}
