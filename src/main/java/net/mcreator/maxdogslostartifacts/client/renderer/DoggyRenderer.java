
package net.mcreator.maxdogslostartifacts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.maxdogslostartifacts.entity.DoggyEntity;
import net.mcreator.maxdogslostartifacts.client.model.ModelDoguinho;

public class DoggyRenderer extends MobRenderer<DoggyEntity, ModelDoguinho<DoggyEntity>> {
	public DoggyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDoguinho(context.bakeLayer(ModelDoguinho.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DoggyEntity entity) {
		return new ResourceLocation("maxdogs_lost_artifacts:textures/entities/doguinho.png");
	}
}
