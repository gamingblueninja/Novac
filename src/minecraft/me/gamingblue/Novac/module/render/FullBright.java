package me.gamingblue.Novac.module.render;

import org.lwjgl.input.Keyboard;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
import net.minecraft.network.play.client.C03PacketPlayer;

public class FullBright extends Module{

	public FullBright() {
		super("FullBright", Keyboard.KEY_P, Category.MOVEMENT);
	}
	
	public void onEnable() {
		mc.gameSettings.gammaSetting = 100;

	}
	
	public void onDisable() {
		mc.gameSettings.gammaSetting = 1;
	}
}
