package com.themastergeneral.ctdpaint.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdpaint.client.ItemModelProvider;

public class ModItems 
{
	public static BasicItem unused;
	public static BasicItem black;
	public static BasicItem white;
	public static BasicItem orange;
	public static BasicItem magenta;
	public static BasicItem cyan;
	public static BasicItem yellow;
	public static BasicItem light_blue;
	public static BasicItem lime;
	public static BasicItem pink;
	public static BasicItem green;
	public static BasicItem gray;
	public static BasicItem silver;
	public static BasicItem purple;
	public static BasicItem blue;
	public static BasicItem brown;
	public static BasicItem red;
	
	public static PaintBucket black_bucket;
	public static PaintBucket white_bucket;
	public static PaintBucket orange_bucket;
	public static PaintBucket magenta_bucket;
	public static PaintBucket cyan_bucket;
	public static PaintBucket yellow_bucket;
	public static PaintBucket light_blue_bucket;
	public static PaintBucket lime_bucket;
	public static PaintBucket pink_bucket;
	public static PaintBucket green_bucket;
	public static PaintBucket gray_bucket;
	public static PaintBucket silver_bucket;
	public static PaintBucket purple_bucket;
	public static PaintBucket blue_bucket;
	public static PaintBucket brown_bucket;
	public static PaintBucket red_bucket;

	public static void registerItems() 
	{
		unused = register(new BasicItem("unused"));
		black = register(new BasicItem("black"));
		white = register(new BasicItem("white"));
		orange = register(new BasicItem("orange"));
		magenta = register(new BasicItem("magenta"));
		light_blue = register(new BasicItem("light_blue"));
		yellow = register(new BasicItem("yellow"));
		lime = register(new BasicItem("lime"));
		pink = register(new BasicItem("pink"));
		green = register(new BasicItem("green"));
		silver = register(new BasicItem("silver"));
		cyan = register(new BasicItem("cyan"));
		gray = register(new BasicItem("gray"));
		purple = register(new BasicItem("purple"));
		blue = register(new BasicItem("blue"));
		brown = register(new BasicItem("brown"));
		red = register(new BasicItem("red"));
		
		black_bucket = register(new PaintBucket("black_bucket"));
		white_bucket = register(new PaintBucket("white_bucket"));
		orange_bucket = register(new PaintBucket("orange_bucket"));
		magenta_bucket = register(new PaintBucket("magenta_bucket"));
		light_blue_bucket = register(new PaintBucket("light_blue_bucket"));
		yellow_bucket = register(new PaintBucket("yellow_bucket"));
		lime_bucket = register(new PaintBucket("lime_bucket"));
		pink_bucket = register(new PaintBucket("pink_bucket"));
		green_bucket = register(new PaintBucket("green_bucket"));
		silver_bucket = register(new PaintBucket("silver_bucket"));
		cyan_bucket = register(new PaintBucket("cyan_bucket"));
		gray_bucket = register(new PaintBucket("gray_bucket"));
		purple_bucket = register(new PaintBucket("purple_bucket"));
		blue_bucket = register(new PaintBucket("blue_bucket"));
		brown_bucket = register(new PaintBucket("brown_bucket"));
		red_bucket = register(new PaintBucket("red_bucket"));
	}
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
}
