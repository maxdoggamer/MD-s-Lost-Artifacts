
package net.mcreator.maxdogslostartifacts.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.maxdogslostartifacts.procedures.Kinecticbar5Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kinecticbar4Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kinecticbar3Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kinecticbar2Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kinecticbar1Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb9Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb8Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb7Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb6Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb16Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb15Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb14Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb13Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb12Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb11Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Kb10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class KinecticOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (Kinecticbar1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k1.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kinecticbar2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k2.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kinecticbar3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k3.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kinecticbar4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k4.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kinecticbar5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k5.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k6.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k7.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k8.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k9.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k10.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k11.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k12.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k13.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k14.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k15.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
			if (Kb16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/k16.png"), posX + 99, posY + 104, 0, 0, 32, 16, 32, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
