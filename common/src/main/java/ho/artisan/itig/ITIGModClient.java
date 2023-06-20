package ho.artisan.itig;

import ho.artisan.itig.config.ITIGConfig;
import ho.artisan.itig.keybind.ITIGKeyBinding;
import ho.artisan.itig.tooltip.ITIGTooltips;

public class ITIGModClient {
    public static void clientInit() {
        ITIGConfig.setConfigScreen();
        ITIGKeyBinding.clientInit();
        tooltipInit();
    }

    public static void tooltipInit() {
        if (!ITIGConfig.getConfig().seeTooltip) {
            ITIGTooltips.clientInit();
        }
    }
}
