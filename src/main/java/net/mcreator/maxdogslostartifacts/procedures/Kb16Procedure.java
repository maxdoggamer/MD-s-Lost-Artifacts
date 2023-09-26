package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogslostartifacts.network.MaxdogsLostArtifactsModVariables;

public class Kb16Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MaxdogsLostArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaxdogsLostArtifactsModVariables.PlayerVariables())).Kinectic > 15) {
			return true;
		}
		return false;
	}
}
