package me.gamingblue.Novac.module.player;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;

public class AntiCobweb extends Module{

	public AntiCobweb() {
		super("AntiCobweb", 0, Category.PLAYER);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.thePlayer.isInWeb = false;
		}
	}

}
