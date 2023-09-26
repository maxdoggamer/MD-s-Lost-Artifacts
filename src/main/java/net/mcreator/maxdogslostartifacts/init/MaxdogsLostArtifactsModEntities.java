
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogslostartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogslostartifacts.entity.MaxdogsUltimateGunEntity;
import net.mcreator.maxdogslostartifacts.entity.DoggyEntity;
import net.mcreator.maxdogslostartifacts.MaxdogsLostArtifactsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MaxdogsLostArtifactsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MaxdogsLostArtifactsMod.MODID);
	public static final RegistryObject<EntityType<DoggyEntity>> DOGGY = register("doggy",
			EntityType.Builder.<DoggyEntity>of(DoggyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DoggyEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<MaxdogsUltimateGunEntity>> MAXDOGS_ULTIMATE_GUN = register("projectile_maxdogs_ultimate_gun", EntityType.Builder.<MaxdogsUltimateGunEntity>of(MaxdogsUltimateGunEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MaxdogsUltimateGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DoggyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DOGGY.get(), DoggyEntity.createAttributes().build());
	}
}
