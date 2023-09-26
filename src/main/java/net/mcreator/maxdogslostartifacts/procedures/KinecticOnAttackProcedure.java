package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogslostartifacts.network.MaxdogsLostArtifactsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KinecticOnAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			{
				double _setval = (sourceentity.getCapability(MaxdogsLostArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaxdogsLostArtifactsModVariables.PlayerVariables())).Kinectic + 1;
				sourceentity.getCapability(MaxdogsLostArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Kinectic = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
