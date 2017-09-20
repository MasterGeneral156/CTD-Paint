package com.themastergeneral.ctdpaint.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdpaint.CTDPaint;

public class ModItems extends RegisterItem {
	public static BasicItem unused_brush;
	public static WhitePaint white_brush;
	public static OrangePaint orange_brush;
	public static MagentaPaint magenta_brush;
	public static LightBluePaint light_blue_brush;
	public static YellowPaint yellow_brush;
	public static LimePaint lime_brush;
	public static PinkPaint pink_brush;
	public static GrayPaint gray_brush;
	public static SilverPaint silver_brush;
	public static CyanPaint cyan_brush;
	public static PurplePaint purple_brush;
	public static BluePaint blue_brush;
	public static BrownPaint brown_brush;
	public static GreenPaint green_brush;
	public static RedPaint red_brush;
	public static BlackPaint black_brush;

	public static void registerItems() {
		unused_brush = register(new BasicItem("unused_brush", CTDPaint.MODID));

		light_blue_brush = register(new LightBluePaint("light_blue_brush",
				CTDPaint.MODID));
		yellow_brush = register(new YellowPaint("yellow_brush", CTDPaint.MODID));
		lime_brush = register(new LimePaint("lime_brush", CTDPaint.MODID));
		pink_brush = register(new PinkPaint("pink_brush", CTDPaint.MODID));
		green_brush = register(new GreenPaint("green_brush", CTDPaint.MODID));
		silver_brush = register(new SilverPaint("silver_brush", CTDPaint.MODID));
		cyan_brush = register(new CyanPaint("cyan_brush", CTDPaint.MODID));
		gray_brush = register(new GrayPaint("gray_brush", CTDPaint.MODID));
		purple_brush = register(new PurplePaint("purple_brush", CTDPaint.MODID));
		blue_brush = register(new BluePaint("blue_brush", CTDPaint.MODID));
		brown_brush = register(new BrownPaint("brown_brush", CTDPaint.MODID));
		white_brush = register(new WhitePaint("white_brush", CTDPaint.MODID));
		orange_brush = register(new OrangePaint("orange_brush", CTDPaint.MODID));
		magenta_brush = register(new MagentaPaint("magenta_brush",
				CTDPaint.MODID));
		red_brush = register(new RedPaint("red_brush", CTDPaint.MODID));
		black_brush = register(new BlackPaint("black_brush", CTDPaint.MODID));
	}
}
