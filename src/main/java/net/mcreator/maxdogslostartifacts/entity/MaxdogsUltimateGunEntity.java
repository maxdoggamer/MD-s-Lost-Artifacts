
package net.mcreator.maxdogslostartifacts.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.maxdogslostartifacts.procedures.MaxdogsUltimateGunProjectileHitsBlockProcedure;
import net.mcreator.maxdogslostartifacts.init.MaxdogsLostArtifactsModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class MaxdogsUltimateGunEntity extends AbstractArrow implements ItemSupplier {
	public MaxdogsUltimateGunEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MaxdogsLostArtifactsModEntities.MAXDOGS_ULTIMATE_GUN.get(), world);
	}

	public MaxdogsUltimateGunEntity(EntityType<? extends MaxdogsUltimateGunEntity> type, Level world) {
		super(type, world);
	}

	public MaxdogsUltimateGunEntity(EntityType<? extends MaxdogsUltimateGunEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public MaxdogsUltimateGunEntity(EntityType<? extends MaxdogsUltimateGunEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.BONE);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		MaxdogsUltimateGunProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), entity);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		MaxdogsUltimateGunProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), entityHitResult.getEntity());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		MaxdogsUltimateGunProjectileHitsBlockProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ(), this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static MaxdogsUltimateGunEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		MaxdogsUltimateGunEntity entityarrow = new MaxdogsUltimateGunEntity(MaxdogsLostArtifactsModEntities.MAXDOGS_ULTIMATE_GUN.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.howl")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static MaxdogsUltimateGunEntity shoot(LivingEntity entity, LivingEntity target) {
		MaxdogsUltimateGunEntity entityarrow = new MaxdogsUltimateGunEntity(MaxdogsLostArtifactsModEntities.MAXDOGS_ULTIMATE_GUN.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(3);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(true);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.howl")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
