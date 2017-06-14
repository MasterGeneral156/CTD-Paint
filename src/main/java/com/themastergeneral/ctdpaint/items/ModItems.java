package com.themastergeneral.ctdpaint.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdpaint.CTDPaint;

public class ModItems extends RegisterItem
{
	/*public static BasicItem unused_brush;
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
	public static BasicItem brown_brush;*/
	public static WhitePaint white_brush;
	public static RedPaint red_brush;
	public static BlackPaint black_brush;
	public static OrangePaint orange_brush;

	public static void registerItems() 
	{
		/*unused_brush = register(new BasicItem("unused_brush", CTDPaint.MODID));
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
		brown_brush = register(new BasicItem("brown_brush", CTDPaint.MODID));*/
		white_brush = register(new WhitePaint("white_brush", CTDPaint.MODID));
		orange_brush = register(new OrangePaint("orange_brush", CTDPaint.MODID));
		red_brush = register(new RedPaint("red_brush", CTDPaint.MODID));
		black_brush = register(new BlackPaint("black_brush", CTDPaint.MODID));
	}
}
