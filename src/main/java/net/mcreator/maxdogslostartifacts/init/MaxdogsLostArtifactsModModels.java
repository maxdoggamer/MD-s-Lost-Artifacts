
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogslostartifacts.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.maxdogslostartifacts.client.model.Modelcustom_model;
import net.mcreator.maxdogslostartifacts.client.model.ModelDoguinho;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MaxdogsLostArtifactsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelDoguinho.LAYER_LOCATION, ModelDoguinho::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
