package me.gamingblue.Novac.module.render;
import org.lwjgl.input.Keyboard;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
import me.gamingblue.Novac.utils.*;
import me.gamingblueninja.Novac.Novac;

public class NameTags extends Module{
	
	public static int nametagonoroff = 0;
	
	
	
	
	//public String TargetName = Invoker.getCurrentTarget().getName();
	
	public NameTags() {
		super("NameTags", Keyboard.KEY_0, Category.RENDER);
	}
	
	public void onDisable() {
		
	}
	
	public void onEnable() {
		Invoker.getCurrentTarget();
		nametagonoroff += 1;
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			
			//Wrapper.fr.drawString((Invoker.getCurrentTarget().getName()) + "Ps They Are not good at the game", 4, 6, 0xbaa0da);
			
		}
	}
		
	
	
	
	
}
