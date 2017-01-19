package com.themastergeneral.ctdpaint.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.client.ItemModelProvider;
import com.themastergeneral.ctdpaint.config.Config;

public class PaintBucket extends Item implements ItemModelProvider
{
	String name;
	public PaintBucket(String unlocalizedName) 
	{
		super();
		this.name = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setRegistryName(unlocalizedName);
		this.setMaxDamage(Config.bucketUseNumber-1);
		this.setNoRepair();
		this.maxStackSize = 1;
	}
	public void registerItemModel(Item item) 
	{
		CTDPaint.proxy.registerItemRenderer(this, 0, name);
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
