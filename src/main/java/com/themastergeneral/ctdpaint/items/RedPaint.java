package com.themastergeneral.ctdpaint.items;

import com.themastergeneral.ctdpaint.CTDPaint;

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

public class RedPaint extends PaintBrush 
{
	private Block containedBlock;
	public RedPaint(String unlocalizedName, String modid) 
	{
		super(unlocalizedName, modid);
	}
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (!worldIn.isRemote)
        {
			if (!worldIn.isBlockModifiable(playerIn, pos))
	        {
				return EnumActionResult.FAIL;
	        }
			if (!playerIn.canPlayerEdit(pos, facing, stack))
			{
				return EnumActionResult.FAIL;
			}
			IBlockState iblockstate = worldIn.getBlockState(pos);
			for (int x=0; x < 16; x=x+1)
			{
				if (iblockstate == Blocks.WOOL.getStateFromMeta(x) && iblockstate != Blocks.WOOL.getStateFromMeta(14))
				{
					worldIn.setBlockState(pos, Blocks.WOOL.getStateFromMeta(14));
					stack.damageItem(1, playerIn);
					return EnumActionResult.SUCCESS;
				}
				if (iblockstate == Blocks.GLASS.getStateFromMeta(0))
				{
					worldIn.setBlockState(pos, Blocks.STAINED_GLASS.getStateFromMeta(14));
					stack.damageItem(1, playerIn);
					return EnumActionResult.SUCCESS;
				}
				if (iblockstate == Blocks.HARDENED_CLAY.getStateFromMeta(0))
				{
					worldIn.setBlockState(pos, Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(14));
					stack.damageItem(1, playerIn);
					return EnumActionResult.SUCCESS;
				}
				if (iblockstate == Blocks.GLASS_PANE.getStateFromMeta(0))
				{
					worldIn.setBlockState(pos, Blocks.STAINED_GLASS_PANE.getStateFromMeta(14));
					stack.damageItem(1, playerIn);
					return EnumActionResult.SUCCESS;
				}
				if (iblockstate == Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(x) && iblockstate != Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(14))
				{
					worldIn.setBlockState(pos, Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(14));
					stack.damageItem(1, playerIn);
					return EnumActionResult.SUCCESS;
				}
				if (iblockstate == Blocks.STAINED_GLASS_PANE.getStateFromMeta(x) && iblockstate != Blocks.STAINED_GLASS_PANE.getStateFromMeta(14))
				{
					worldIn.setBlockState(pos, Blocks.STAINED_GLASS_PANE.getStateFromMeta(14));
					stack.damageItem(1, playerIn);
					return EnumActionResult.SUCCESS;
				}
				if (iblockstate == Blocks.CARPET.getStateFromMeta(x) && iblockstate != Blocks.CARPET.getStateFromMeta(14))
				{
					worldIn.setBlockState(pos, Blocks.CARPET.getStateFromMeta(14));
					stack.damageItem(1, playerIn);
					return EnumActionResult.SUCCESS;
				}
			}
        }
		return EnumActionResult.FAIL;
	}
}
