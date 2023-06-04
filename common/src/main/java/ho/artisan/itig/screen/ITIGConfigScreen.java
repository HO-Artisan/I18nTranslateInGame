package ho.artisan.itig.screen;

import ho.artisan.itig.ITIGMod;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = ITIGMod.MOD_ID)
public class ITIGConfigScreen implements ConfigData {
    public boolean seeTooltip = true;
    public String deeplToken = "";
}
