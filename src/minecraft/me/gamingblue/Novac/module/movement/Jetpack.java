package me.gamingblue.Novac.module.movement;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;

public class Jetpack extends Module{

	public Jetpack() {
		super("Jetpack", 0, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.gameSettings.keyBindJump.pressed) {
				mc.thePlayer.jump();
			}
		}
	}

}
