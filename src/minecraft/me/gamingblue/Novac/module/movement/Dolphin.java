package me.gamingblue.Novac.module.movement;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;

public class Dolphin extends Module{

	public Dolphin() {
		super("Dolphin", 0, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.isInWater()) {
				mc.thePlayer.motionY += 0.30;
			}
		}
	}

}
