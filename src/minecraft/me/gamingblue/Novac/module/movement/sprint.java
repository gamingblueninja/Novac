package me.gamingblue.Novac.module.movement;

import org.lwjgl.input.Keyboard;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;

public class sprint extends Module {

	public sprint() {
		super("Sprint", Keyboard.KEY_P, Category.MOVEMENT);
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		mc.thePlayer.setSprinting(mc.gameSettings.keyBindSprint.isPressed());
	}
	
	
	public void onUpdate() {
		if(this.isToggled()) {
				if(mc.thePlayer.moveForward > 0 && !mc.thePlayer.isUsingItem() && !mc.thePlayer.isSneaking() && !mc.thePlayer.isCollidedHorizontally)
				mc.thePlayer.setSprinting(true);
			}
		}
	}

