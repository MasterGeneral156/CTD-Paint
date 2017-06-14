package com.themastergeneral.ctdpaint.crafting;

import com.themastergeneral.ctdcore.utils.ModUtils;
import com.themastergeneral.ctdpaint.CTDPaint;
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
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"black_brush", 
				new ItemStack(ModItems.black_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 0), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"red_brush", 
				new ItemStack(ModItems.red_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 1), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"green_brush", 
				new ItemStack(ModItems.green_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 2), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"brown_brush", 
				new ItemStack(ModItems.brown_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 3), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"blue_brush", 
				new ItemStack(ModItems.blue_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 4), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"purple_brush", 
				new ItemStack(ModItems.purple_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 5), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"cyan_brush", 
				new ItemStack(ModItems.cyan_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 6), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"silver_brush", 
				new ItemStack(ModItems.silver_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 7), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"gray_brush", 
				new ItemStack(ModItems.gray_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 8), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"pink_brush", 
				new ItemStack(ModItems.pink_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 9), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"lime_brush", 
				new ItemStack(ModItems.lime_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 10), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"yellow_brush", 
				new ItemStack(ModItems.yellow_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 11), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"light_blue_brush", 
				new ItemStack(ModItems.light_blue_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 12), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"magenta_brush", 
				new ItemStack(ModItems.magenta_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 13), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"orange_brush", 
				new ItemStack(ModItems.orange_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 14), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapelessRecipe(CTDPaint.MODID, 
				"white_brush", 
				new ItemStack(ModItems.white_brush), 
				new Object[] 
						{ 
							Items.WATER_BUCKET, 
							new ItemStack(Items.DYE, 1, 15), 
							ModItems.unused_brush
						}
					);
		ModUtils.addShapedRecipe(CTDPaint.MODID, "unused_brush", 
				 new ItemStack(ModItems.unused_brush), 
				 new Object[]{"W","S",
				 'W', Items.WHEAT, 'S', Items.STICK
				 });
	}
}
