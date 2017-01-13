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
