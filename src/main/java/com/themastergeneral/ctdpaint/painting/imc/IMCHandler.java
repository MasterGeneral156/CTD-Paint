package com.themastergeneral.ctdpaint.painting.imc;

import java.util.List;
import java.util.Locale;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.painting.PaintBlack;
import com.themastergeneral.ctdpaint.painting.PaintBlue;
import com.themastergeneral.ctdpaint.painting.PaintBrown;
import com.themastergeneral.ctdpaint.painting.PaintCyan;
import com.themastergeneral.ctdpaint.painting.PaintGray;
import com.themastergeneral.ctdpaint.painting.PaintLightBlue;
import com.themastergeneral.ctdpaint.painting.PaintLime;
import com.themastergeneral.ctdpaint.painting.PaintMagenta;
import com.themastergeneral.ctdpaint.painting.PaintOrange;
import com.themastergeneral.ctdpaint.painting.PaintPink;
import com.themastergeneral.ctdpaint.painting.PaintPurple;
import com.themastergeneral.ctdpaint.painting.PaintRed;
import com.themastergeneral.ctdpaint.painting.PaintSilver;
import com.themastergeneral.ctdpaint.painting.PaintWhite;
import com.themastergeneral.ctdpaint.painting.PaintYellow;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCMessage;

public class IMCHandler {
	public static final IMCHandler INSTANCE = new IMCHandler();

	public void handleIMC(List<IMCMessage> messages) {
		NBTTagCompound nbt;
		for (IMCMessage message : messages) {
			try {
				if (!message.isNBTMessage()) {
					continue;
				}
				nbt = message.getNBTValue();
				String operation = message.key.toLowerCase(Locale.US);

				switch (operation) {
				case ADD_BLACK:
					PaintBlack.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_BLACK:
					PaintBlack.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_BLUE:
					PaintBlue.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_BLUE:
					PaintBlue.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_BROWN:
					PaintBrown.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_BROWN:
					PaintBrown.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_CYAN:
					PaintCyan.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_CYAN:
					PaintCyan.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_GRAY:
					PaintGray.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_GRAY:
					PaintGray.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_LIGHT_BLUE:
					PaintLightBlue.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_LIGHT_BLUE:
					PaintLightBlue.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_LIME:
					PaintLime.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_LIME:
					PaintLime.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_MAGENTA:
					PaintMagenta.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_MAGENTA:
					PaintMagenta.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_ORANGE:
					PaintOrange.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_ORANGE:
					PaintOrange.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_PINK:
					PaintPink.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_PINK:
					PaintPink.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_PURPLE:
					PaintPurple.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_PURPLE:
					PaintPurple.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_RED:
					PaintRed.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_RED:
					PaintRed.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_SILVER:
					PaintSilver.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_SILVER:
					PaintSilver.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_WHITE:
					PaintWhite.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_WHITE:
					PaintWhite.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case ADD_YELLOW:
					PaintYellow.instance().addPaint(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				case REMOVE_YELLOW:
					PaintYellow.instance().removeRecipe(
							(IBlockState) nbt.getCompoundTag(PAINTED),
							(IBlockState) nbt.getCompoundTag(NEWBLOCK));
					continue;
				}
				CTDPaint.logger.error("CTD Paint received an invalid IMC from "
						+ message.getSender() + "! Key was " + message.key);
			} catch (Exception e) {
				CTDPaint.logger.error("CTD Paint received a broken IMC from "
						+ message.getSender() + "!");
				e.printStackTrace();
			}
		}
	}

	/*
	 * IMC Strings
	 */
	static final String PAINTED = "painted";
	static final String NEWBLOCK = "newblock";

	public static final String ADD_BLACK = "add_black_paint";
	public static final String REMOVE_BLACK = "remove_black_paint";
	public static final String ADD_BLUE = "add_blue_paint";
	public static final String REMOVE_BLUE = "remove_blue_paint";
	public static final String ADD_BROWN = "add_brown_paint";
	public static final String REMOVE_BROWN = "remove_brown_paint";
	public static final String ADD_CYAN = "add_cyan_paint";
	public static final String REMOVE_CYAN = "remove_cyan_paint";
	public static final String ADD_GRAY = "add_gray_paint";
	public static final String REMOVE_GRAY = "remove_gray_paint";
	public static final String ADD_GREEN = "add_green_paint";
	public static final String REMOVE_GREEN = "remove_green_paint";
	public static final String ADD_LIGHT_BLUE = "add_light_blue_paint";
	public static final String REMOVE_LIGHT_BLUE = "remove_light_blue_paint";
	public static final String ADD_LIME = "add_lime_paint";
	public static final String REMOVE_LIME = "remove_lime_paint";
	public static final String ADD_MAGENTA = "add_magenta_paint";
	public static final String REMOVE_MAGENTA = "remove_magenta_paint";
	public static final String ADD_ORANGE = "add_orange_paint";
	public static final String REMOVE_ORANGE = "remove_orange_paint";
	public static final String ADD_PINK = "add_pink_paint";
	public static final String REMOVE_PINK = "remove_pink_paint";
	public static final String ADD_PURPLE = "add_purple_paint";
	public static final String REMOVE_PURPLE = "remove_purple_paint";
	public static final String ADD_RED = "add_red_paint";
	public static final String REMOVE_RED = "remove_red_paint";
	public static final String ADD_SILVER = "add_silver_paint";
	public static final String REMOVE_SILVER = "remove_silver_paint";
	public static final String ADD_WHITE = "add_white_paint";
	public static final String REMOVE_WHITE = "remove_white_paint";
	public static final String ADD_YELLOW = "add_yellow_paint";
	public static final String REMOVE_YELLOW = "remove_yellow_paint";

}
