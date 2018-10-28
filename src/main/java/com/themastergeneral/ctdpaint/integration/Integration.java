package com.themastergeneral.ctdpaint.integration;

import net.minecraftforge.fml.common.Loader;

public class Integration {
	public static void load()
	{
		
	}
	
	public static void moGlowstone()
	{
		if (Loader.isModLoaded("moglowstone"))
		{
			MoGlowstone.load();
		}
	}
}
