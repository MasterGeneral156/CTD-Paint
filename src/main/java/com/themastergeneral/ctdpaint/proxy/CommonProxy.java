package com.themastergeneral.ctdpaint.proxy;

import com.themastergeneral.ctdpaint.events.Painting;
import com.themastergeneral.ctdpaint.items.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{

	public void preInit(FMLPreInitializationEvent e) 
	{
		ModItems.registerItems();
	}

	public void init(FMLInitializationEvent e) 
	{
		MinecraftForge.EVENT_BUS.register(new Painting());
	}

	public void postInit(FMLPostInitializationEvent e) 
	{
		
	}
	public void registerItemRenderer(Item item, int meta, String id) 
    {
    	 
    }

}
