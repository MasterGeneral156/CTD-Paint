package com.themastergeneral.ctdpaint.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import com.themastergeneral.ctdpaint.config.Config;

public class PaintBrush extends BasicItem {

	public PaintBrush(String unlocalizedName, String modid) {
		super(unlocalizedName, modid);
		if (Config.DoPaintBrushBreak == true) {
			this.setMaxDamage(Config.PaintBrushDurability);
		}
	}
}
