package net.mcreator.maxdogslostartifacts.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.maxdogslostartifacts.entity.MaxdogsUltimateGunEntity;
import net.mcreator.maxdogslostartifacts.client.model.Modelcustom_model;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MaxdogsUltimateGunRenderer extends EntityRenderer<MaxdogsUltimateGunEntity> {
	private static final ResourceLocation texture = new ResourceLocation("maxdogs_lost_artifacts:textures/entities/doguinhomissel.png");
	private final Modelcustom_model model;

	public MaxdogsUltimateGunRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION));
	}

	@Override
	public void render(MaxdogsUltimateGunEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(MaxdogsUltimateGunEntity entity) {
		return texture;
	}
}
