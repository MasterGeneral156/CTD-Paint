package com.themastergeneral.ctdpaint.integration;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.themastergeneral.ctdpaint.config.Config;
import com.themastergeneral.ctdpaint.items.ModItems;

public class MoGlowstone 
{
	@SubscribeEvent
	public void onCraft(PlayerInteractEvent event)
	{
		EntityPlayer player = event.getEntityPlayer();
		World world = player.getEntityWorld();
		Boolean painted = false;
		Block block = world.getBlockState(event.getPos()).getBlock();
		if (block == Blocks.WOOL)
		{
			if (player.getHeldItem(EnumHand.MAIN_HAND) != null)
			{
				Item item = player.getHeldItem(EnumHand.MAIN_HAND).getItem();
				if (item == ModItems.white_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(0));
					painted = true;
				}
				if (item == ModItems.orange_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(1));
					painted = true;
				}
				if (item == ModItems.magenta_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(2));
					painted = true;
				}
				if (item == ModItems.light_blue_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(3));
					painted = true;
				}
				if (item == ModItems.yellow_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(4));
					painted = true;
				}
				if (item == ModItems.lime_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(5));
					painted = true;
				}
				if (item == ModItems.pink_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(6));
					painted = true;
				}
				if (item == ModItems.gray_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(7));
					painted = true;
				}
				if (item == ModItems.silver_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(8));
					painted = true;
				}
				if (item == ModItems.cyan_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(9));
					painted = true;
				}
				if (item == ModItems.purple_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(10));
					painted = true;
				}
				if (item == ModItems.blue_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(11));
					painted = true;
				}
				if (item == ModItems.brown_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(12));
					painted = true;
				}
				if (item == ModItems.green_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(13));
					painted = true;
				}
				if (item == ModItems.red_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(14));
					painted = true;
				}
				if (item == ModItems.black_brush)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(15));
					painted = true;
				}
				if (painted == true && Config.DoPaintBrushBreak == true)
				{
					Random randomGenerator = new Random();
					int randomInt = randomGenerator.nextInt(Config.PaintBrushBreakChance);
					if (randomInt == 1)
					{
						player.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ModItems.unused_brush));
						player.inventoryContainer.detectAndSendChanges();
					}
				}
			}
		}
	}
}
