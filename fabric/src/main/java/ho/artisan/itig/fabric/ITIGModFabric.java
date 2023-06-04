package ho.artisan.itig.fabric;

import ho.artisan.itig.ITIGMod;
import net.fabricmc.api.ModInitializer;

public class ITIGModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ITIGMod.init();
    }
}
