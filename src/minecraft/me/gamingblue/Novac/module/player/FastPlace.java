package me.gamingblue.Novac.module.player;

import org.lwjgl.input.Keyboard;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;


public class FastPlace extends Module{

	public FastPlace() {
		super("FastPlace", Keyboard.KEY_B, Category.PLAYER);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.rightClickDelayTimer = 0;
		}
	}

}
