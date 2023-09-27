
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogslostartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.maxdogslostartifacts.block.SwordInStoneDoggoBlock;
import net.mcreator.maxdogslostartifacts.MaxdogsLostArtifactsMod;

public class MaxdogsLostArtifactsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MaxdogsLostArtifactsMod.MODID);
	public static final RegistryObject<Block> SWORD_IN_STONE_DOGGO = REGISTRY.register("sword_in_stone_doggo", () -> new SwordInStoneDoggoBlock());
}
