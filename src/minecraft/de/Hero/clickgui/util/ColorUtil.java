package de.Hero.clickgui.util;

import java.awt.Color;

import me.gamingblueninja.Novac.Novac;

/**
 *  Made by HeroCode
 *  it's free to use
 *  but you have to credit me
 *
 *  @author HeroCode
 */
public class ColorUtil {
	
	public static Color getClickGUIColor(){
		return new Color((int)Novac.instance.settingsManager.getSettingByName("GuiRed").getValDouble(), (int)Novac.instance.settingsManager.getSettingByName("GuiGreen").getValDouble(), (int)Novac.instance.settingsManager.getSettingByName("GuiBlue").getValDouble());
	}
}
