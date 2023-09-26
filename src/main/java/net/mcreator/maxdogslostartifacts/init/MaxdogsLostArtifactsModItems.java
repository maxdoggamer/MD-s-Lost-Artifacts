
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogslostartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.maxdogslostartifacts.item.MemoriesOfHomeItem;
import net.mcreator.maxdogslostartifacts.item.MaxdogsUltimateGunItem;
import net.mcreator.maxdogslostartifacts.item.ManaTesterItem;
import net.mcreator.maxdogslostartifacts.item.LevitationWandItem;
import net.mcreator.maxdogslostartifacts.item.HomeDebugerItem;
import net.mcreator.maxdogslostartifacts.item.BuildersHammerItem;
import net.mcreator.maxdogslostartifacts.MaxdogsLostArtifactsMod;

public class MaxdogsLostArtifactsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MaxdogsLostArtifactsMod.MODID);
	public static final RegistryObject<Item> MAXDOGS_ULTIMATE_GUN = REGISTRY.register("maxdogs_ultimate_gun", () -> new MaxdogsUltimateGunItem());
	public static final RegistryObject<Item> BUILDERS_HAMMER = REGISTRY.register("builders_hammer", () -> new BuildersHammerItem());
	public static final RegistryObject<Item> MANA_TESTER = REGISTRY.register("mana_tester", () -> new ManaTesterItem());
	public static final RegistryObject<Item> MEMORIES_OF_HOME = REGISTRY.register("memories_of_home", () -> new MemoriesOfHomeItem());
	public static final RegistryObject<Item> HOME_DEBUGER = REGISTRY.register("home_debuger", () -> new HomeDebugerItem());
	public static final RegistryObject<Item> LEVITATION_WAND = REGISTRY.register("levitation_wand", () -> new LevitationWandItem());
}
