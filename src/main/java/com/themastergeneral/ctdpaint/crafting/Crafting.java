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
		//Black Paint Bucket
		GameRegistry.addRecipe(
				new ShapelessOreRecipe(
						new ItemStack(ModItems.black_bucket, 1),
							new Object[] 
							{ 
								Items.WATER_BUCKET, "dyeBlack", Items.CLAY_BALL
							}
						));
		//Black Paint Brush
		GameRegistry.addShapelessRecipe(
				new ItemStack(ModItems.black), 
					new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.black_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
		//Blue Paint Bucket
		GameRegistry.addRecipe(
						new ShapelessOreRecipe(
								new ItemStack(ModItems.blue_bucket, 1),
									new Object[] 
									{ 
										Items.WATER_BUCKET, "dyeBlue", Items.CLAY_BALL
									}
								));
		//Blue Paint Brush
		GameRegistry.addShapelessRecipe(
				new ItemStack(ModItems.blue), 
					new Object[] 
					{ 
						ModItems.unused, new ItemStack(ModItems.blue_bucket, 1, OreDictionary.WILDCARD_VALUE),
					}
				);
		//Brown Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.brown_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeBrown", Items.CLAY_BALL
											}
										));
				//Brown Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.brown), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.brown_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Cyan Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.cyan_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeCyan", Items.CLAY_BALL
											}
										));
				//Cyan Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.cyan), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.cyan_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Gray Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.gray_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeGray", Items.CLAY_BALL
											}
										));
				//Gray Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.gray), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.gray_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Green Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.green_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeGreen", Items.CLAY_BALL
											}
										));
				//Green Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.green), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.green_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Light Blue Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.light_blue_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeLightBlue", Items.CLAY_BALL
											}
										));
				//Light Blue Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.light_blue), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.light_blue_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Lime Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.lime_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeLime", Items.CLAY_BALL
											}
										));
				//Lime Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.lime), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.lime_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Magenta Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.magenta_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeMagenta", Items.CLAY_BALL
											}
										));
				//Magenta Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.magenta), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.magenta_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Orange Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.orange_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeOrange", Items.CLAY_BALL
											}
										));
				//Orange Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.orange), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.orange_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Pink Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.pink_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyePink", Items.CLAY_BALL
											}
										));
				//Pink Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.pink), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.pink_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Purple Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.purple_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyePurple", Items.CLAY_BALL
											}
										));
				//Purple Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.purple), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.purple_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Red Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.red_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeRed", Items.CLAY_BALL
											}
										));
				//Red Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.red), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.red_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Silver Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.silver_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeLightGray", Items.CLAY_BALL
											}
										));
				//Silver Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.silver), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.silver_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//White Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.white_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeWhite", Items.CLAY_BALL
											}
										));
				//White Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.white), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.white_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				//Yellow Paint Bucket
				GameRegistry.addRecipe(
								new ShapelessOreRecipe(
										new ItemStack(ModItems.yellow_bucket, 1),
											new Object[] 
											{ 
												Items.WATER_BUCKET, "dyeYellow", Items.CLAY_BALL
											}
										));
				//gray Paint Brush
				GameRegistry.addShapelessRecipe(
						new ItemStack(ModItems.yellow), 
							new Object[] 
							{ 
								ModItems.unused, new ItemStack(ModItems.yellow_bucket, 1, OreDictionary.WILDCARD_VALUE),
							}
						);
				
		//Unused Paintbrush
		GameRegistry.addRecipe(
				new ItemStack(ModItems.unused), 
					"W", "S", 'W', Items.WHEAT, 'S', Items.STICK);
		
	}
}
