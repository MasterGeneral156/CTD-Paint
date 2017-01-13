package com.themastergeneral.ctdpaint.items;

import java.util.List;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.client.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItem extends Item implements ItemModelProvider
{
	protected String name;
	public BasicItem(String unlocalizedName) 
	{
        super();
        this.setUnlocalizedName(unlocalizedName + "_brush");
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setRegistryName(unlocalizedName + "_brush");
        this.setNoRepair();
        this.maxStackSize = 1;
    }
	public void registerItemModel(Item item) 
	{
		CTDPaint.proxy.registerItemRenderer(this, 0, name);
	}
}
