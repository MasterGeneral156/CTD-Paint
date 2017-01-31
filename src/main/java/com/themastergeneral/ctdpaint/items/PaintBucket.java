package com.themastergeneral.ctdpaint.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.config.Config;

public class PaintBucket extends BasicItem
{
	public PaintBucket(String unlocalizedName, String modid) 
	{
		super(unlocalizedName, modid);
		this.setMaxDamage(Config.bucketUseNumber-1);
		this.setNoRepair();
		this.maxStackSize = 1;
	}
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
	 {
		 return false;
	 }

	 @Override
	 public boolean getShareTag()
	 {
		 return true;
	 }
	 public boolean hasContainerItem(ItemStack itemStack)
	 {
		 return true;
	 }
	 @Override
	 public ItemStack getContainerItem(ItemStack itemStack)
	 {
		 ItemStack stack = itemStack.copy();
		 stack.setItemDamage(stack.getItemDamage() + 1);
		 this.maxStackSize = 1;
		 return stack;
	}

}
