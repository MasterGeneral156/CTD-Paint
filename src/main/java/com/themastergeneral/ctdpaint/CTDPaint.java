package com.themastergeneral.ctdpaint;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdpaint.proxy.CommonProxy;

@Mod(modid = CTDPaint.MODID, name = CTDPaint.MODNAME, version = CTDPaint.VERSION, acceptedMinecraftVersions = CTDPaint.acceptedMinecraftVersions, updateJSON = CTDPaint.updateJSON)
public class CTDPaint 
{
	public static final String MODID = "ctdpaint";
    public static final String MODNAME = "CTD Paint";
    public static final String VERSION = "1.1.0";
    public static final String acceptedMinecraftVersions = "1.10.2";
	public static final String updateJSON = "https://dl.dropboxusercontent.com/u/72961306/TMG%20Assets/Update%20JSONs/CTD-Paint.json";
    
    @Instance
    public static CTDPaint instance = new CTDPaint();
    
    @SidedProxy(clientSide="com.themastergeneral.ctdpaint.proxy.ClientProxy", serverSide="com.themastergeneral.ctdpaint.proxy.ServerProxy")
    public static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}