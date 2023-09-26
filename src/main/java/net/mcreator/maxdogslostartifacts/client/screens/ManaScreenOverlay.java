
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
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.maxdogslostartifacts.procedures.Mana9Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana8Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana7Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana6Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana5Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana4Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana3Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana2Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana1Procedure;
import net.mcreator.maxdogslostartifacts.procedures.Mana10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaScreenOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
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
			if (Mana1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + -112, 0, 0, 16, 16, 16, 16);
			}
			if (Mana2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + -94, 0, 0, 16, 16, 16, 16);
			}
			if (Mana3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + -76, 0, 0, 16, 16, 16, 16);
			}
			if (Mana4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + -58, 0, 0, 16, 16, 16, 16);
			}
			if (Mana5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + -40, 0, 0, 16, 16, 16, 16);
			}
			if (Mana6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + -22, 0, 0, 16, 16, 16, 16);
			}
			if (Mana7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + -4, 0, 0, 16, 16, 16, 16);
			}
			if (Mana8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + 14, 0, 0, 16, 16, 16, 16);
			}
			if (Mana9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + 32, 0, 0, 16, 16, 16, 16);
			}
			if (Mana10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("maxdogs_lost_artifacts:textures/screens/mana.png"), posX + 198, posY + 50, 0, 0, 16, 16, 16, 16);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.maxdogs_lost_artifacts.mana_screen.label_varmana"), posX + 162, posY + -121, -16776961, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
