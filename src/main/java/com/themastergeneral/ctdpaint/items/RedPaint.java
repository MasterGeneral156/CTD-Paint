package com.themastergeneral.ctdpaint.items;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class RedPaint extends BasicItem 
{
	private Block containedBlock;
	public RedPaint(String unlocalizedName, String modid) 
	{
		super(unlocalizedName, modid);
	}
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	 {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		Block blocktotest = Blocks.WOOL;
		boolean flag = this.containedBlock == blocktotest;
		RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, flag);
		if (raytraceresult == null)
		{
			return new ActionResult(EnumActionResult.PASS, itemstack);
		}
		else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
		{
			return new ActionResult(EnumActionResult.PASS, itemstack);
		}
		else
		{
			BlockPos blockpos = raytraceresult.getBlockPos();
            if (!worldIn.isBlockModifiable(playerIn, blockpos))
            {
                return new ActionResult(EnumActionResult.FAIL, itemstack);
            }
            if (!playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
            {
               return new ActionResult(EnumActionResult.FAIL, itemstack);
            }
            else
            {
	           	IBlockState iblockstate = worldIn.getBlockState(blockpos);
	           	if (iblockstate == Blocks.WOOL)
	           	{
	           		worldIn.setBlockState(blockpos, Blocks.WOOL.getStateFromMeta(1), 11);
	           		itemstack.damageItem(1, playerIn);
	           		return new ActionResult(EnumActionResult.PASS, itemstack);
	           	}
	           	else
	           	{
	           		return new ActionResult(EnumActionResult.FAIL, itemstack);
	           	}
            }
		}
 	}

}
