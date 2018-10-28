package com.themastergeneral.ctdpaint;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdpaint.painting.imc.IMCHandler;
import com.themastergeneral.ctdpaint.proxy.CommonProxy;

@Mod(modid = CTDPaint.MODID, name = CTDPaint.MODNAME, certificateFingerprint = CTDPaint.Fingerprint, version = CTDPaint.VERSION, acceptedMinecraftVersions = CTDPaint.acceptedMinecraftVersions, updateJSON = CTDPaint.updateJSON, dependencies = CTDPaint.DEPENDENCIES)
public class CTDPaint {
	public static final String MODID = "ctdpaint";
	public static final String MODNAME = "CTD Paint";
	public static final String VERSION = "2.2.0";
	public static final String acceptedMinecraftVersions = "1.12.2";
	public static final String updateJSON = "https://github.com/MasterGeneral156/Version/blob/master/CTD-Paint.json";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.3.0,];";
	public static final String Fingerprint = "b50fe22651b9d97d9d6631514a6a57cd6174b0dc";

	@Instance
	public static CTDPaint instance = new CTDPaint();

	public static Logger logger;

	@SidedProxy(clientSide = "com.themastergeneral.ctdpaint.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdpaint.proxy.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Starting CTD Paint.");
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		logger.info("CTD Paint has loaded successfully.");
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for CTD Paint! TheMasterGeneral will not support this version!");
	}

	@EventHandler
	public void handleIMC(IMCEvent e) {
		logger.info("CTD Paint is awaiting IMC from other mods...");
		IMCHandler.INSTANCE.handleIMC(e.getMessages());
	}
}