package ho.artisan.itig.fabric;

import ho.artisan.itig.I18nTranslationInGameClient;
import net.fabricmc.api.ClientModInitializer;

public class I18nTranslateInGameClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        I18nTranslationInGameClient.clientInit();
    }
}
