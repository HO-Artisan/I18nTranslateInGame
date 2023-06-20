package ho.artisan.itig;

import ho.artisan.itig.config.ITIGConfig;
import ho.artisan.itig.keybind.ITIGKeyBinding;
import ho.artisan.itig.tooltip.ITIGTooltips;

public class ITIGModClient {
    public static void clientInit() {
        if (!ITIGConfig.getConfig().seeTooltip) {
            ITIGTooltips.clientInit();
        }
        ITIGKeyBinding.clientInit();
        ITIGConfig.setConfigScreen();
    }
}
