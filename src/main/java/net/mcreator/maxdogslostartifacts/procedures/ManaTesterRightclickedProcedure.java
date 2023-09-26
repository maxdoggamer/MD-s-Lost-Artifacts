package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogslostartifacts.network.MaxdogsLostArtifactsModVariables;

public class ManaTesterRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(MaxdogsLostArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Mana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
