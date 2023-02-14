package me.gamingblue.Novac.gui;

import java.util.Comparator;
import java.util.Iterator;

import me.gamingblue.Novac.module.render.NameTags;
import me.gamingblue.Novac.module.Module;
import me.gamingblue.Novac.utils.ColorUtils;
import me.gamingblue.Novac.utils.Invoker;
import me.gamingblue.Novac.utils.Wrapper;
import me.gamingblueninja.Novac.Novac;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.client.entity.EntityPlayerSP;

public class GuiIngameHook extends GuiIngame {
	protected Minecraft mc = Minecraft.getMinecraft();
	
	public GuiIngameHook(Minecraft mcIn) {
		super(mcIn);
	}
	
	public void renderGameOverlay(float p_175180_1_){
		super.renderGameOverlay(p_175180_1_);
		
		String targetname;
		if (Invoker.getCurrentTarget() != null) {
			System.out.println("Target found!");
			targetname = Invoker.getCurrentTarget().getName();
		} else {
			System.out.println("No target found.");
			targetname = "Unknown";
		}
		
		
		
			
			
			
		
		
		
		
		
		if (!mc.gameSettings.showDebugInfo) {
			Wrapper.fr.drawString("Novac " + Novac.version, 4, 4, 0xbaa0da);
			Wrapper.fr.drawString("FPS: " + mc.getDebugFPS(), 65, 4, -10000000);
			Wrapper.fr.drawString("Target Name = ", 4, 14, -10000000);
			Wrapper.fr.drawString(targetname, 90, 14, -10000000);
			renderArrayList();
		}
		
	}
	
	private void renderArrayList() {
		int yCount = 0;
		int index = 0;
		long x = 0;
		Novac.instance.moduleManager.getModules().sort(Comparator.comparingInt(m -> Wrapper.fr.getStringWidth(((Module) m).getName())).reversed());
		for (Module m : Novac.instance.moduleManager.getModules()) {
			m.onRender();
			
			ScaledResolution sr = new ScaledResolution(mc);
			double offset = yCount * (Wrapper.fr.FONT_HEIGHT + 1);
			
			if (m.isToggled()) {
				Gui.drawRect(sr.getScaledWidth() - Wrapper.fr.getStringWidth(m.getName()) - 1, offset, sr.getScaledWidth(), 1 + Wrapper.fr.FONT_HEIGHT + offset, 0x80000000);
				Wrapper.fr.drawString("" + m.getName(), sr.getScaledWidth() - Wrapper.fr.getStringWidth(m.getName()) - 1, 1 + offset, ColorUtils.rainbowEffect(index + x * 200000000L, 1.0f).getRGB());
				yCount++;
				index++;
				x++;
			}
		}
	}
}