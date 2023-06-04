package ho.artisan.itig;

import ho.artisan.itig.config.ITIGConfig;
import ho.artisan.itig.keybind.ITIGKeyBinding;
import ho.artisan.itig.tooltip.ITIGTooltips;

public class I18nTranslationInGameClient {
    public static void clientInit() {
        if (!ITIGConfig.getConfig().seeTooltip) {
            ITIGTooltips.clientInit();
        }
        ITIGKeyBinding.clientInit();
    }
}
