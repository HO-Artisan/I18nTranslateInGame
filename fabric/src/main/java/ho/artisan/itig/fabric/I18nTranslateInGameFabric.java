package ho.artisan.itig.fabric;

import ho.artisan.itig.I18nTranslateInGame;
import net.fabricmc.api.ModInitializer;

public class I18nTranslateInGameFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        I18nTranslateInGame.init();
    }
}
