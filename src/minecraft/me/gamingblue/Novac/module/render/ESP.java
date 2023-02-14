package me.gamingblue.Novac.module.render;

import de.Hero.settings.Setting;
import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
import me.gamingblue.Novac.utils.esp.ChestESPUtils;
import me.gamingblue.Novac.utils.esp.MobESPUtils;
import me.gamingblueninja.Novac.Novac;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityChest;

public class ESP extends Module{

	public ESP() {
		super("ESP", 0 , Category.RENDER);
	}
	
	public void setup() {
		Novac.instance.settingsManager.rSetting(new Setting("Player", this, false));
		Novac.instance.settingsManager.rSetting(new Setting("Chest", this, false));
		Novac.instance.settingsManager.rSetting(new Setting("HostileMobs", this, false));
		Novac.instance.settingsManager.rSetting(new Setting("FriendlyMobs", this, false));
	}
	
	public void onRender() {
		if(this.isToggled() && Novac.instance.settingsManager.getSettingByName("Player").getValBoolean()) {
			for(Object e : mc.theWorld.loadedEntityList) {
				if(e instanceof EntityPlayer) {
					MobESPUtils.entityESPBox((Entity)e, 0);
				}
			}
		}
		
		if(this.isToggled() && Novac.instance.settingsManager.getSettingByName("Chest").getValBoolean()) {
			for(Object o: mc.theWorld.loadedTileEntityList) {
				if(o instanceof TileEntityChest) {
					ChestESPUtils.blockESPBox(((TileEntityChest)o).getPos());
				}
			}
		}
		
		if(this.isToggled() && Novac.instance.settingsManager.getSettingByName("HostileMobs").getValBoolean()) {
			for(Object h : mc.theWorld.loadedEntityList) {
				if(h instanceof EntityMob) {
					MobESPUtils.entityESPBox((Entity)h, 0);
				}
			}
		}
		
		 if(this.isToggled() && Novac.instance.settingsManager.getSettingByName("FriendlyMobs").getValBoolean()) {
			 for(Object f : mc.theWorld.loadedEntityList) {
				 if(f instanceof EntityAnimal) {
					 MobESPUtils.entityESPBox((Entity)f, 0);
				 }
			 }
		 }
	}
	

}
