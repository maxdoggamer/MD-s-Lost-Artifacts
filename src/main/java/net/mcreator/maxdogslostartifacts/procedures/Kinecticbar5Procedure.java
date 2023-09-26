package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogslostartifacts.network.MaxdogsLostArtifactsModVariables;

public class Kinecticbar5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MaxdogsLostArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaxdogsLostArtifactsModVariables.PlayerVariables())).Kinectic > 4) {
			return true;
		}
		return false;
	}
}
