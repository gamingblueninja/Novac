package me.gamingblue.Novac.module.combat;

import org.lwjgl.input.Keyboard;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBow;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;

public class AutoClicker extends Module{
	
	public AutoClicker() {
		super("AutoClicker", Keyboard.KEY_C, Category.COMBAT);
	}
	
	
	void OnEnable()
	{
		
	}
	
	public void onUpdate() {
		//mc.gameSettings.keyBindAttack.pressed = true;
//		mc.gameSettings.keyBindForward.pressed = true;
	//	mc.gameSettings.keyBindForward.pressed = false;
		//mc.gameSettings.keyBindAttack.pressed = false;
	}
	
	
}
//mc.gameSettings.keyBindAttack.pressed = true;