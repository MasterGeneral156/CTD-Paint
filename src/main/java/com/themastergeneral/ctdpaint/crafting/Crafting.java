package com.themastergeneral.ctdpaint.crafting;

import com.themastergeneral.ctdpaint.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Crafting 
{
	public static void addRecipes() 
	{
		//Unused Paintbrush
		GameRegistry.addRecipe(
				new ItemStack(ModItems.unused_brush), 
					"W", "S", 'W', Items.WHEAT, 'S', Items.STICK);
		
	}
}
