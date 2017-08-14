package com.jtrent238.coremod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

@Mod(modid=jtrent238Core.MODID, name=jtrent238Core.MODNAME, version=jtrent238Core.MODVERSION)
public class jtrent238Core
{
	
	
	@SidedProxy(clientSide="com.jtrent238.coremod.client.ClientProxy", serverSide="com.jtrent238.youtubers.coremod.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "jtrent238core";

	@Instance(MODID)
    public static jtrent238Core instance;
	public static final String MODVERSION = "1.0.0.3";
	public static final String MODNAME = "jtrent238's Core Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {
	}
    

	
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
  }
  

  @Mod.EventHandler
  public void init(FMLInitializationEvent event)
  {
    NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());




  } ;
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {}
}
