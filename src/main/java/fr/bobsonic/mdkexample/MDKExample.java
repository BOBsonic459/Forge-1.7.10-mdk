package fr.bobsonic.mdkexample;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.bobsonic.mdkexample.logger.Logger;
import fr.bobsonic.mdkexample.utils.Constants;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.MOD_VERSION, acceptedMinecraftVersions = Constants.MOD_VERSION)
public class MDKExample {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Logger.debug("Mod entering to pre initializationt phase");
	}
	
	@EventHandler
	public void preInit(FMLInitializationEvent event) {
		Logger.debug("Mod entering to initializationt phase");
	}
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event) {
		Logger.debug("Mod entering to post initializationt phase");
	}
	
}
