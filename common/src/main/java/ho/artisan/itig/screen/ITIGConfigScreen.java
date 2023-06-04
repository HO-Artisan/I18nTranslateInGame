package ho.artisan.itig.screen;

import ho.artisan.itig.I18nTranslateInGame;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = I18nTranslateInGame.MOD_ID)
public class ITIGConfigScreen implements ConfigData {
    public boolean seeTooltip = true;
    public String deeplToken = "";
}
