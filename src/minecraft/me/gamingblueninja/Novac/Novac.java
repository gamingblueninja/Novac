package me.gamingblueninja.Novac;

import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.Display;

import de.Hero.clickgui.ClickGUI;
import de.Hero.settings.SettingsManager;
import me.gamingblue.Novac.alt.AltManager;
//import me.connorivanxdd.dream.extensions.DiscordRP;
import me.gamingblue.Novac.module.Module;
import me.gamingblue.Novac.module.ModuleManager;

public class Novac {
	
	public static String name = "Novac", version = "1.8.8", creator = "Gamingblueninja";
	
	public static Novac instance = new Novac();
	
	public static SettingsManager settingsManager;
	public static ModuleManager moduleManager;
	public static ClickGUI clickGUI;
	public static AltManager altManager;
	
	//public static DiscordRP discordRP = new DiscordRP();
	public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
	
	public static void startClient() {
		settingsManager = new SettingsManager();
		moduleManager = new ModuleManager();
		clickGUI = new ClickGUI();
		altManager = new AltManager();
		//discordRP.start();
		
		
		
		
		
		
		
		
		Display.setTitle(name + " " + version + " by " + creator);
	}
	
	//public static DiscordRP getDiscordRP() {
		// discordRP;
	//}
	
	
}
