package com.themastergeneral.ctdpaint.items;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.painting.PaintLightBlue;
import com.themastergeneral.ctdpaint.painting.PaintRed;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class LightBluePaint extends PaintBrush {
	private Block containedBlock;

	public LightBluePaint(String unlocalizedName, String modid) {
		super(unlocalizedName, modid);
	}

	public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn,
			BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX,
			float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			ItemStack stack = playerIn.getHeldItem(handIn);
			if (!worldIn.isBlockModifiable(playerIn, pos)) {
				return EnumActionResult.FAIL;
			}
			if (!playerIn.canPlayerEdit(pos, facing, stack)) {
				return EnumActionResult.FAIL;
			}
			IBlockState iblockstate = worldIn.getBlockState(pos);
			if (PaintLightBlue.instance().getRecipeResult(iblockstate) != Blocks.AIR
					.getDefaultState()) {
				stack.damageItem(1, playerIn);
				worldIn.setBlockState(pos,
						PaintLightBlue.instance().getRecipeResult(iblockstate));
				return EnumActionResult.SUCCESS;
			}
		}
		return EnumActionResult.FAIL;
	}
}
