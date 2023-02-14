package me.gamingblue.Novac.module.player;

import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
import me.gamingblue.Novac.utils.Invoker;
import net.minecraft.util.MovingObjectPosition;
public class AutoMine extends Module{

	public AutoMine() {
		super("AutoMine", 0, Category.PLAYER);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			MovingObjectPosition hover = Invoker.getObjectMouseOver();
			
			if(hover.typeOfHit != null) {
				if(hover.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
					Invoker.setKeyBindAttackPressed(true);
				}
			}else {
				Invoker.setKeyBindAttackPressed(false);
			}
		}
	}

}