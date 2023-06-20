package ho.artisan.itig.gui;

import ho.artisan.itig.ITIGMod;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = ITIGMod.MOD_ID)
public class ModConfigScreen implements ConfigData {
    public String translatedLanguages = "en_us";
    public boolean tooltipVisibility = true;
    public String deeplToken = "";
}
