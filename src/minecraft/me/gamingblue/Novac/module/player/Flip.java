package me.gamingblue.Novac.module.player;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;

public class Flip extends Module{

	public Flip() {
		super("Flip", 0, Category.PLAYER);
	}
	
	@Override
	public void toggle() {
		mc.thePlayer.rotationYaw += 180;
	}

}
