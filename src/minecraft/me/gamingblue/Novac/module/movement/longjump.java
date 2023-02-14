package me.gamingblue.Novac.module.movement;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
import me.gamingblue.Novac.utils.Invoker;
public class longjump extends Module {

	public longjump() {
		super("LongJump", Keyboard.KEY_V, Category.MOVEMENT);
	}

	
	public void onDisable() {

	}
	
	public void onEnable() {
		System.out.println("WAITING FOR DAMAGE"); 
		mc.thePlayer.onGround = false;
		mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.2, this.mc.thePlayer.posZ);
		mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 3.52, this.mc.thePlayer.posZ, this.mc.thePlayer.onGround));
		System.out.println("READY WITH A MOTION Y OF  " + mc.thePlayer.motionY); 
	}
		
	
	public void onUpdate() {
		if(this.isToggled()) {
		        if (mc.thePlayer.hurtTime > 5.5) {
		        	System.out.println("LAUNCHING WITH MOTION X Y Z OF " + mc.thePlayer.motionX + " " + mc.thePlayer.motionY + " " + mc.thePlayer.motionZ); 
		        	mc.thePlayer.motionY = this.mc.thePlayer.motionY + 0.1452;
		        	mc.thePlayer.jump();
		        	mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.05, this.mc.thePlayer.posZ);
		        	mc.thePlayer.moveStrafing = 2f;
		        	//made by ConnorivanXDD
		        	//remove watermark if big cringe
		        	
		} 
			
		}
	}
}



