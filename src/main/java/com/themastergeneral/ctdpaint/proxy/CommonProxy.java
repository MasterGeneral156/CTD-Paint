package com.themastergeneral.ctdpaint.proxy;

import java.io.File;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.config.Config;
import com.themastergeneral.ctdpaint.integration.Integration;
import com.themastergeneral.ctdpaint.items.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	// Config instance
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(),
				"ctd/ctdpaint.cfg"));
		Config.readConfig();
		ModItems.registerItems();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {
		if (config.hasChanged()) {
			config.save();
		}
		//Integration.load();
	}
}
