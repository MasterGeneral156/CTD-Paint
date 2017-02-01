package com.themastergeneral.ctdpaint.integration;

import javax.annotation.Nonnull;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.config.Config;
import com.themastergeneral.ctdpaint.items.ModItems;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IModRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

@mezz.jei.api.JEIPlugin
public class JEIIntegration extends BlankModPlugin 
{
	@Override
	public void register(@Nonnull IModRegistry registry) 
	{
		if (Config.disableJEI == false)
		{
			registry.addDescription(new ItemStack(ModItems.unused_brush), "Combined with an ore-dictionaried dye to get a painted brush.");
			if (CTDPaint.moglowstoneloaded == true)
			{
				registry.addDescription(new ItemStack(Blocks.GLOWSTONE), "Can be painted with a paint brush to get colored glowstone.");
			}
		}
		else
		{
			
		}
	}
}
