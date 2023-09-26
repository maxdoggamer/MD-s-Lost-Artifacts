
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogslostartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.maxdogslostartifacts.MaxdogsLostArtifactsMod;

public class MaxdogsLostArtifactsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MaxdogsLostArtifactsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ARTIFACTS = REGISTRY.register("artifacts",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.maxdogs_lost_artifacts.artifacts")).icon(() -> new ItemStack(Blocks.AMETHYST_CLUSTER)).displayItems((parameters, tabData) -> {
				tabData.accept(MaxdogsLostArtifactsModItems.MAXDOGS_ULTIMATE_GUN.get());
				tabData.accept(MaxdogsLostArtifactsModItems.BUILDERS_HAMMER.get());
				tabData.accept(MaxdogsLostArtifactsModItems.MEMORIES_OF_HOME.get());
				tabData.accept(MaxdogsLostArtifactsModItems.HOME_DEBUGER.get());
				tabData.accept(MaxdogsLostArtifactsModItems.LEVITATION_WAND.get());
			}).withSearchBar().build());
}
