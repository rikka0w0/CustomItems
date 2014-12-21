package me.otho.customItems.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ForgeConfig 
{
	public static Configuration config;
	
	public static boolean debug = true;
	public static boolean defaultTab;
	public static boolean remake = true;
	
	public static void init(File configFile)
	{
		if(config == null) {
            config = new Configuration(configFile);
        }
        loadConfiguration();
	}
	
	private static void loadConfiguration()
	{		
		remake = config.getBoolean("remake", "OPTIONS", false, "Set true if you want to restore the default config on the next time the mod is loaded");		
		defaultTab = config.getBoolean("defaultTab", "OPTIONS", true, "Set to false, if you dont want the default creative tab");
		
		if(config.hasChanged()) {
            config.save();
        }
	}
}