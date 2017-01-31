package com.themastergeneral.ctdpaint.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdpaint.CTDPaint;

public class ModItems 
{
	public static BasicItem unused_brush;
	public static BasicItem black_brush;
	public static BasicItem white_brush;
	public static BasicItem orange_brush;
	public static BasicItem magenta_brush;
	public static BasicItem cyan_brush;
	public static BasicItem yellow_brush;
	public static BasicItem light_blue_brush;
	public static BasicItem lime_brush;
	public static BasicItem pink_brush;
	public static BasicItem green_brush;
	public static BasicItem gray_brush;
	public static BasicItem silver_brush;
	public static BasicItem purple_brush;
	public static BasicItem blue_brush;
	public static BasicItem brown_brush;
	public static BasicItem red_brush;
	
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
		unused_brush = register(new BasicItem("unused_brush", CTDPaint.MODID));
		black_brush = register(new BasicItem("black_brush", CTDPaint.MODID));
		white_brush = register(new BasicItem("white_brush", CTDPaint.MODID));
		orange_brush = register(new BasicItem("orange_brush", CTDPaint.MODID));
		magenta_brush = register(new BasicItem("magenta_brush", CTDPaint.MODID));
		light_blue_brush = register(new BasicItem("light_blue_brush", CTDPaint.MODID));
		yellow_brush = register(new BasicItem("yellow_brush", CTDPaint.MODID));
		lime_brush = register(new BasicItem("lime_brush", CTDPaint.MODID));
		pink_brush = register(new BasicItem("pink_brush", CTDPaint.MODID));
		green_brush = register(new BasicItem("green_brush", CTDPaint.MODID));
		silver_brush = register(new BasicItem("silver_brush", CTDPaint.MODID));
		cyan_brush = register(new BasicItem("cyan_brush", CTDPaint.MODID));
		gray_brush = register(new BasicItem("gray_brush", CTDPaint.MODID));
		purple_brush = register(new BasicItem("purple_brush", CTDPaint.MODID));
		blue_brush = register(new BasicItem("blue_brush", CTDPaint.MODID));
		brown_brush = register(new BasicItem("brown_brush", CTDPaint.MODID));
		red_brush = register(new BasicItem("red_brush", CTDPaint.MODID));
		
		black_bucket = register(new PaintBucket("black_bucket", CTDPaint.MODID));
		white_bucket = register(new PaintBucket("white_bucket", CTDPaint.MODID));
		orange_bucket = register(new PaintBucket("orange_bucket", CTDPaint.MODID));
		magenta_bucket = register(new PaintBucket("magenta_bucket", CTDPaint.MODID));
		light_blue_bucket = register(new PaintBucket("light_blue_bucket", CTDPaint.MODID));
		yellow_bucket = register(new PaintBucket("yellow_bucket", CTDPaint.MODID));
		lime_bucket = register(new PaintBucket("lime_bucket", CTDPaint.MODID));
		pink_bucket = register(new PaintBucket("pink_bucket", CTDPaint.MODID));
		green_bucket = register(new PaintBucket("green_bucket", CTDPaint.MODID));
		silver_bucket = register(new PaintBucket("silver_bucket", CTDPaint.MODID));
		cyan_bucket = register(new PaintBucket("cyan_bucket", CTDPaint.MODID));
		gray_bucket = register(new PaintBucket("gray_bucket", CTDPaint.MODID));
		purple_bucket = register(new PaintBucket("purple_bucket", CTDPaint.MODID));
		blue_bucket = register(new PaintBucket("blue_bucket", CTDPaint.MODID));
		brown_bucket = register(new PaintBucket("brown_bucket", CTDPaint.MODID));
		red_bucket = register(new PaintBucket("red_bucket", CTDPaint.MODID));
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
