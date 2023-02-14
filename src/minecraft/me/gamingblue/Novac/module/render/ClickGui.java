package me.gamingblue.Novac.module.render;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import de.Hero.settings.Setting;
import me.gamingblue.Novac.module.Category;
import me.gamingblue.Novac.module.Module;
import me.gamingblueninja.Novac.Novac;

public class ClickGui extends Module{

	public ClickGui() {
        super("ClickGui", Keyboard.KEY_RSHIFT, Category.RENDER);
    }

    @Override
    public void setup() {
        ArrayList<String> options = new ArrayList<>();
        options.add("New");
        options.add("JellyLike");
        Novac.instance.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Novac.instance.settingsManager.rSetting(new Setting("Sound", this, false));
        Novac.instance.settingsManager.rSetting(new Setting("GuiRed", this, 166, 0, 255, true));
        Novac.instance.settingsManager.rSetting(new Setting("GuiGreen", this, 124, 0, 255, true));
        Novac.instance.settingsManager.rSetting(new Setting("GuiBlue", this, 255, 0, 255, true));
    }

    @Override
    public void onEnable() {
        super.onEnable();

        mc.displayGuiScreen(Novac.instance.clickGUI);
        toggle();
    }
}