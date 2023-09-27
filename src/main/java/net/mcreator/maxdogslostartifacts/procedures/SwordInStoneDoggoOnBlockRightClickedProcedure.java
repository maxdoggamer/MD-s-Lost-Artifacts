package net.mcreator.maxdogslostartifacts.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.maxdogslostartifacts.network.MaxdogsLostArtifactsModVariables;
import net.mcreator.maxdogslostartifacts.init.MaxdogsLostArtifactsModItems;

public class SwordInStoneDoggoOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("joaoinde09")) {
			{
				boolean _setval = true;
				entity.getCapability(MaxdogsLostArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.BearerOfTheSword = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MaxdogsLostArtifactsModItems.LEGENDARY_SWORD_OF_DOGGO.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			BecomeTheBearerOfTheSwordProcedure.execute(entity);
		}
	}
}
