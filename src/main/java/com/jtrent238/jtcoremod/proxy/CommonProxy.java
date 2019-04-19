package com.jtrent238.jtcoremod.proxy;

import java.io.File;

import com.jtrent238.jtcoremod.Config;
import com.jtrent238.jtcoremod.Main;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	// Config instance
    public static Configuration config;
    
    public void preInit(FMLPreInitializationEvent e) {
    	File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), Main.MODID + ".cfg"));
        Config.readConfig();
        
     // Initialize our packet handler. Make sure the name is
        // 20 characters or less!
        //PacketHandler.registerMessages(Main.MODID);
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    	if (config.hasChanged()) {
            config.save();
        }
    }
}
