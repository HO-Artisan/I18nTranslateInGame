package ho.artisan.itig;

import ho.artisan.itig.config.ITIGConfig;
import ho.artisan.itig.keybind.ITIGKeyBinding;
import ho.artisan.itig.gui.tooltip.SubTranslationTooltips;

public class ITIGModClient {
    public static void clientInit() {
        SubTranslationTooltips.clientInit();
        ITIGKeyBinding.clientInit();
        ITIGConfig.setConfigScreen();
    }
}
