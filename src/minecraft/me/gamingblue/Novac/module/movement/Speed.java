package me.gamingblue.Novac.module.movement;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import me.gamingblue.Novac.utils.*;
import me.gamingblue.Novac.module.*;
import me.gamingblue.Novac.module.Module;
public class Speed extends Module {
	public int SpeedTimer = 0;
	public Speed() {
		super("Speed", Keyboard.KEY_LCONTROL, Category.MOVEMENT);
	}

	
	public void onDisable() {
		SpeedTimer = 0;
	}
	
	public void onEnable() {
		SpeedTimer = 0;
	}
		
	
	public void onUpdate() {
		if(this.isToggled()) {
		      mc.thePlayer.moveStrafing = 0.5f;

		      if(mc.thePlayer.onGround) {                    
		        mc.thePlayer.jump();                                                                           
		        System.out.println("JUMPING " + mc.thePlayer.motionY);
		      }

		      if (SpeedTimer == 8) {                                    
		        mc.thePlayer.motionY = -0.4;                    
		        System.out.println("FALLING " + mc.thePlayer.motionY);                
		        System.out.println("RESETTING TIMER " + mc.thePlayer.motionY);                
		        SpeedTimer = 0;
		      }

		      SpeedTimer++;
		      super.onDisable();
		    }
		  }
		}




