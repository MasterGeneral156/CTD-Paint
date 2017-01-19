package com.themastergeneral.ctdpaint;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class VersionChecker implements Runnable
{
    private static boolean isLatestVersion = false;
    private static String latestVersion = "";
    @Override
    public void run() 
    {
        InputStream in = null;
        try 
        {
            in = new URL("https://dl.dropboxusercontent.com/u/72961306/TMG%20Assets/Mod%20Version/CTDPaint_1102").openStream();
        } 
        catch 
        (MalformedURLException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            latestVersion = IOUtils.readLines(in).get(0);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            IOUtils.closeQuietly(in);
        }
        isLatestVersion = CTDPaint.VERSION.equals(latestVersion);
    }
    
    public boolean isLatestVersion()
    {
     return isLatestVersion;
    }
    
    public static String getLatestVersion()
    {
    	return latestVersion;
    }
}
