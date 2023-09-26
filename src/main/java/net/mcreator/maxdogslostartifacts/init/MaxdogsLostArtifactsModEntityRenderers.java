
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogslostartifacts.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.maxdogslostartifacts.client.renderer.MaxdogsUltimateGunRenderer;
import net.mcreator.maxdogslostartifacts.client.renderer.DoggyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MaxdogsLostArtifactsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MaxdogsLostArtifactsModEntities.DOGGY.get(), DoggyRenderer::new);
		event.registerEntityRenderer(MaxdogsLostArtifactsModEntities.MAXDOGS_ULTIMATE_GUN.get(), MaxdogsUltimateGunRenderer::new);
	}
}
