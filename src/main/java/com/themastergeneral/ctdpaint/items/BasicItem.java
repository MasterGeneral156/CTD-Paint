package com.themastergeneral.ctdpaint.items;

import java.util.List;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdpaint.CTDPaint;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItem extends CTDItem {
	public BasicItem(String unlocalizedName, String modid) {
		super(unlocalizedName, modid);
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.setNoRepair();
		this.maxStackSize = 1;
	}
}
