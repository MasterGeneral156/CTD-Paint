package com.themastergeneral.ctdpaint.events;

import java.time.format.TextStyle;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

import com.themastergeneral.ctdpaint.CTDPaint;
import com.themastergeneral.ctdpaint.VersionChecker;
import com.themastergeneral.ctdpaint.config.Config;

public class UpdateNotify 
{
	public static VersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(PlayerTickEvent event)
	{
		if (Config.NotifiyUpdate == true)
		{
		    if (!CTDPaint.haveWarnedVersionOutOfDate && event.player.world.isRemote && !CTDPaint.versionChecker.isLatestVersion())
		    {
		        ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://minecraft.curseforge.com/projects/ctd-paint");
		        Style clickableChatStyle = new Style().setClickEvent(versionCheckChatClickEvent);
		        TextComponentString versionWarningChatComponent =   new TextComponentString("CTD Paint is now at "+VersionChecker.getLatestVersion()+". You are currently running "+CTDPaint.VERSION+". Click here to update.");
		        versionWarningChatComponent.setStyle(clickableChatStyle);
		        event.player.sendMessage(versionWarningChatComponent);
		        CTDPaint.haveWarnedVersionOutOfDate = true;
		    }
		}
	}
}
