package com.themastergeneral.ctdpaint.events;

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

import com.themastergeneral.ctdpaint.items.ModItems;

public class Painting 
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
				if (item == ModItems.white)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(0));
					painted = true;
				}
				if (item == ModItems.orange)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(1));
					painted = true;
				}
				if (item == ModItems.magenta)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(2));
					painted = true;
				}
				if (item == ModItems.light_blue)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(3));
					painted = true;
				}
				if (item == ModItems.yellow)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(4));
					painted = true;
				}
				if (item == ModItems.lime)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(5));
					painted = true;
				}
				if (item == ModItems.pink)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(6));
					painted = true;
				}
				if (item == ModItems.gray)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(7));
					painted = true;
				}
				if (item == ModItems.silver)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(8));
					painted = true;
				}
				if (item == ModItems.cyan)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(9));
					painted = true;
				}
				if (item == ModItems.purple)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(10));
					painted = true;
				}
				if (item == ModItems.blue)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(11));
					painted = true;
				}
				if (item == ModItems.brown)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(12));
					painted = true;
				}
				if (item == ModItems.green)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(13));
					painted = true;
				}
				if (item == ModItems.red)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(14));
					painted = true;
				}
				if (item == ModItems.black)
				{
					world.setBlockState(event.getPos(), Blocks.WOOL.getStateFromMeta(15));
					painted = true;
				}
				if (painted == true)
				{
					Random randomGenerator = new Random();
					int randomInt = randomGenerator.nextInt(100);
					if (randomInt == 1)
					{
						System.out.println("Paintbrush out of paint.");
						player.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ModItems.unused));
					}
				}
			}
		}
		if (block == Blocks.GLASS || block == Blocks.STAINED_GLASS)
		{
			if (player.getHeldItem(EnumHand.MAIN_HAND) != null)
			{
				Item item = player.getHeldItem(EnumHand.MAIN_HAND).getItem();
				if (item == ModItems.white)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(0));
					painted = true;
				}
				if (item == ModItems.orange)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(1));
					painted = true;
				}
				if (item == ModItems.magenta)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(2));
					painted = true;
				}
				if (item == ModItems.light_blue)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(3));
					painted = true;
				}
				if (item == ModItems.yellow)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(4));
					painted = true;
				}
				if (item == ModItems.lime)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(5));
					painted = true;
				}
				if (item == ModItems.pink)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(6));
					painted = true;
				}
				if (item == ModItems.gray)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(7));
					painted = true;
				}
				if (item == ModItems.silver)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(8));
					painted = true;
				}
				if (item == ModItems.cyan)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(9));
					painted = true;
				}
				if (item == ModItems.purple)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(10));
					painted = true;
				}
				if (item == ModItems.blue)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(11));
					painted = true;
				}
				if (item == ModItems.brown)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(12));
					painted = true;
				}
				if (item == ModItems.green)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(13));
					painted = true;
				}
				if (item == ModItems.red)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(14));
					painted = true;
				}
				if (item == ModItems.black)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS.getStateFromMeta(15));
					painted = true;
				}
				if (painted == true)
				{
					Random randomGenerator = new Random();
					int randomInt = randomGenerator.nextInt(100);
					if (randomInt == 1)
					{
						player.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ModItems.unused));
					}
				}
			}
		}
		if (block == Blocks.STAINED_HARDENED_CLAY || block == Blocks.HARDENED_CLAY)
		{
			if (player.getHeldItem(EnumHand.MAIN_HAND) != null)
			{
				Item item = player.getHeldItem(EnumHand.MAIN_HAND).getItem();
				if (item == ModItems.white)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(0));
					painted = true;
				}
				if (item == ModItems.orange)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(1));
					painted = true;
				}
				if (item == ModItems.magenta)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(2));
					painted = true;
				}
				if (item == ModItems.light_blue)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(3));
					painted = true;
				}
				if (item == ModItems.yellow)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(4));
					painted = true;
				}
				if (item == ModItems.lime)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(5));
					painted = true;
				}
				if (item == ModItems.pink)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(6));
					painted = true;
				}
				if (item == ModItems.gray)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(7));
					painted = true;
				}
				if (item == ModItems.silver)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(8));
					painted = true;
				}
				if (item == ModItems.cyan)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(9));
					painted = true;
				}
				if (item == ModItems.purple)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(10));
					painted = true;
				}
				if (item == ModItems.blue)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(11));
					painted = true;
				}
				if (item == ModItems.brown)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(12));
					painted = true;
				}
				if (item == ModItems.green)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(13));
					painted = true;
				}
				if (item == ModItems.red)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(14));
					painted = true;
				}
				if (item == ModItems.black)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_HARDENED_CLAY.getStateFromMeta(15));
					painted = true;
				}
				if (painted == true)
				{
					Random randomGenerator = new Random();
					int randomInt = randomGenerator.nextInt(100);
					if (randomInt == 1)
					{
						player.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ModItems.unused));
					}
				}
			}
		}
		if (block == Blocks.STAINED_GLASS_PANE || block == Blocks.GLASS_PANE)
		{
			if (player.getHeldItem(EnumHand.MAIN_HAND) != null)
			{
				Item item = player.getHeldItem(EnumHand.MAIN_HAND).getItem();
				if (item == ModItems.white)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(0));
					painted = true;
				}
				if (item == ModItems.orange)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(1));
					painted = true;
				}
				if (item == ModItems.magenta)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(2));
					painted = true;
				}
				if (item == ModItems.light_blue)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(3));
					painted = true;
				}
				if (item == ModItems.yellow)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(4));
					painted = true;
				}
				if (item == ModItems.lime)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(5));
					painted = true;
				}
				if (item == ModItems.pink)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(6));
					painted = true;
				}
				if (item == ModItems.gray)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(7));
					painted = true;
				}
				if (item == ModItems.silver)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(8));
					painted = true;
				}
				if (item == ModItems.cyan)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(9));
					painted = true;
				}
				if (item == ModItems.purple)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(10));
					painted = true;
				}
				if (item == ModItems.blue)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(11));
					painted = true;
				}
				if (item == ModItems.brown)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(12));
					painted = true;
				}
				if (item == ModItems.green)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(13));
					painted = true;
				}
				if (item == ModItems.red)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(14));
					painted = true;
				}
				if (item == ModItems.black)
				{
					world.setBlockState(event.getPos(), Blocks.STAINED_GLASS_PANE.getStateFromMeta(15));
					painted = true;
				}
				if (painted == true)
				{
					Random randomGenerator = new Random();
					int randomInt = randomGenerator.nextInt(100);
					if (randomInt == 1)
					{
						player.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ModItems.unused));
					}
				}
			}
		}
	}
}
