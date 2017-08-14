package com.jtrent238.coremod;

import java.util.logging.Level;

import cpw.mods.fml.common.Loader;

public class ModsLoaded{
	{
		
	if (Loader.isModLoaded("jtrent238youtubers")) {
		
		System.out.println("jtrent238's YouTuber Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded jtrent238's YouTuber Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.SEVERE, "Could not load jtrent238's YouTuber Mod");
            e.printStackTrace(System.err);
        }
    
		}
}
}
    