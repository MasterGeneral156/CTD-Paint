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
		//Black Brush
		GameRegistry.addRecipe(
				new ShapelessOreRecipe(
						new ItemStack(ModItems.black_brush, 1),
							new Object[] 
							{ 
								Items.WATER_BUCKET, "dyeBlack", ModItems.unused_brush
							}
						));
		//White Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.white_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeWhite", ModItems.unused_brush
									}
								));
		//Orange Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.orange_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeOrange", ModItems.unused_brush
									}
								));
		//Magenta Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.magenta_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeMagenta", ModItems.unused_brush
									}
								));
		//Light Blue Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.light_blue_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeLightBlue", ModItems.unused_brush
									}
								));
				//Yellow Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.yellow_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeYellow", ModItems.unused_brush
									}
								));
				//Lime Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.lime_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeLime", ModItems.unused_brush
									}
								));
				//Pink Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.pink_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyePink", ModItems.unused_brush
									}
								));
				//Purple Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.purple_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyePurple", ModItems.unused_brush
									}
								));
				//Gray Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.gray_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeGray", ModItems.unused_brush
									}
								));
				//Light Gray Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.silver_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeLightGray", ModItems.unused_brush
									}
								));
				//Cyan Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.cyan_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeCyan", ModItems.unused_brush
									}
								));
				//Blue Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.blue_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeBlue", ModItems.unused_brush
									}
								));
				//Brown Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.brown_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeBrown", ModItems.unused_brush
									}
								));
				//Green Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.green_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeGreen", ModItems.unused_brush
									}
								));
				//Red Brush
				GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.red_brush, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeRed", ModItems.unused_brush
									}
								));	
		//Unused Paintbrush
		GameRegistry.addRecipe(
				new ItemStack(ModItems.unused_brush), 
					"W", "S", 'W', Items.WHEAT, 'S', Items.STICK);
		
	}
}
