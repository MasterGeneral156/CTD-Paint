package com.themastergeneral.ctdpaint.proxy;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.VersionChecker;
import com.themastergeneral.ctdpaint.events.Painting;
import com.themastergeneral.ctdpaint.events.UpdateNotify;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
    }
    public void init(FMLInitializationEvent e) 
    {
        super.init(e);
        MinecraftForge.EVENT_BUS.register(new UpdateNotify());
    }
    public void postInit(FMLPostInitializationEvent e) 
    {
        super.postInit(e);
        CTDPaint.versionChecker = new VersionChecker();
        Thread versionCheckThread = new Thread(CTDPaint.versionChecker, "Version Check");
        versionCheckThread.start();
    }
}
