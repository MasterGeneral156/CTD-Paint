package com.themastergeneral.ctdpaint.painting;

import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.themastergeneral.ctdpaint.CTDPaint;

public class PaintMagenta {
	private static final PaintMagenta MAGENTAPAINT_RECIPES = new PaintMagenta();
	private final Multimap<IBlockState, IBlockState> recipeList = ArrayListMultimap
			.create();

	public static PaintMagenta instance() {
		return MAGENTAPAINT_RECIPES;
	}

	private PaintMagenta() {
		for (int x = 0; x < 16; x = x + 1) {
			if (x != 2) {
				addPaint(Blocks.WOOL.getBlockState().getValidStates().get(x),
						Blocks.WOOL.getBlockState().getValidStates().get(2));
				addPaint(Blocks.STAINED_GLASS.getBlockState().getValidStates()
						.get(x), Blocks.STAINED_GLASS.getBlockState()
						.getValidStates().get(2));
				addPaint(Blocks.STAINED_GLASS_PANE.getBlockState()
						.getValidStates().get(x), Blocks.STAINED_GLASS_PANE
						.getBlockState().getValidStates().get(2));
				addPaint(Blocks.STAINED_HARDENED_CLAY.getBlockState()
						.getValidStates().get(x), Blocks.STAINED_HARDENED_CLAY
						.getBlockState().getValidStates().get(2));
				addPaint(Blocks.CARPET.getBlockState().getValidStates().get(x),
						Blocks.CARPET.getBlockState().getValidStates().get(2));
				addPaint(Blocks.CONCRETE.getBlockState().getValidStates()
						.get(x), Blocks.CONCRETE.getBlockState()
						.getValidStates().get(2));
				addPaint(Blocks.CONCRETE_POWDER.getBlockState()
						.getValidStates().get(x), Blocks.CONCRETE_POWDER
						.getBlockState().getValidStates().get(2));
			}
		}
		addPaint(Blocks.GLASS.getDefaultState(), Blocks.STAINED_GLASS
				.getBlockState().getValidStates().get(2));
		addPaint(Blocks.GLASS_PANE.getDefaultState(), Blocks.STAINED_GLASS_PANE
				.getBlockState().getValidStates().get(2));
		addPaint(Blocks.HARDENED_CLAY.getDefaultState(),
				Blocks.STAINED_HARDENED_CLAY.getBlockState().getValidStates()
						.get(2));
	}

	public void addPaint(IBlockState painted, IBlockState newblock) {
		recipeList.put(painted, newblock);
	}

	public void removeRecipe(IBlockState painted, IBlockState newblock) {
		IBlockState result = getRecipeResult(painted);
		if (result == Blocks.AIR.getDefaultState()) {
			CTDPaint.logger.error("Could not remove: " + painted
					+ " from the Magenta Paint registry as it doesn't exist.");
			return;
		}
		recipeList.remove(painted, newblock);
	}

	public IBlockState getRecipeResult(IBlockState painted) {
		for (Entry<IBlockState, IBlockState> entry : recipeList.entries()) {
			if (painted == entry.getKey()) {
				return (IBlockState) entry.getValue();
			}
		}

		return Blocks.AIR.getDefaultState();
	}

	public Multimap<IBlockState, IBlockState> getRecipeList() {
		return recipeList;
	}
}
