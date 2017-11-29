package com.themastergeneral.ctdpaint.config;

import org.apache.logging.log4j.Level;

import scala.Int;
import net.minecraftforge.common.config.Configuration;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.proxy.CommonProxy;

public class Config {

	private static final String CATEGORY_GENERAL = "General";

	// This values below you can access elsewhere in your mod:
	public static boolean DoPaintBrushBreak = true;
	public static boolean NotifiyUpdate = true;
	public static int PaintBrushDurability = 1024;

	// Call this from CommonProxy.preInit(). It will create our config if it
	// doesn't
	// exist yet and read the values if it does exist.
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			CTDPaint.logger
					.log(Level.ERROR, "Problem loading config file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initGeneralConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_GENERAL,
				"General configuration for the CTD Paint mod.");
		DoPaintBrushBreak = cfg
				.getBoolean(
						"DoPaintBrushBreak",
						CATEGORY_GENERAL,
						DoPaintBrushBreak,
						"Set to false if you do not want your paint brushes to run out of paint after a random amount of time.");
		NotifiyUpdate = cfg
				.getBoolean(
						"NotifiyUpdate",
						CATEGORY_GENERAL,
						NotifiyUpdate,
						"If set to false, you won't be notified of an update when you log into a server.");
		PaintBrushDurability = cfg.getInt("Paint Brush Durability",
				CATEGORY_GENERAL, PaintBrushDurability, 1, 65655,
				"How long should it take for your brush to empty?");
	}
}
