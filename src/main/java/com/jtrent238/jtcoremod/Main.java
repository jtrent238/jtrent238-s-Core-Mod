package com.jtrent238.jtcoremod;

import org.apache.logging.log4j.Logger;

import com.jtrent238.jtcoremod.proxy.CommonProxy;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class Main {

    public static final String MODID = "jtcoremod";
	public static final String MODNAME = "jtrent238's Core Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MODVERSION = "2.0.0.3";
	public static final String MC = "1.12.2";

    @SidedProxy(clientSide = "com.jtrent238.jtcoremod.proxy.ClientProxy", serverSide = "com.jtrent238.jtcoremod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Main instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
        //JTAPI.addNewCreativeTab("MyAwesomeTab", Items.DIAMOND, true);
    }
}