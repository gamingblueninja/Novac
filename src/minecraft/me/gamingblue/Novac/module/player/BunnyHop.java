package me.gamingblue.Novac.module.player;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
public class BunnyHop extends Module{

	public BunnyHop() {
		super("BunnyHop", 0, Category.PLAYER);
	}
	
	@Override
	public void onDisable() {
		mc.gameSettings.keyBindJump.pressed = false;
		super.onDisable();
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.gameSettings.keyBindJump.pressed = true;
		}
	}

}
