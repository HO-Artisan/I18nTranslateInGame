package ho.artisan.itig.forge;

import dev.architectury.platform.forge.EventBuses;
import ho.artisan.itig.I18nTranslateInGame;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(I18nTranslateInGame.MOD_ID)
public class I18nTranslateInGameForge {
    public I18nTranslateInGameForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(I18nTranslateInGame.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        I18nTranslateInGame.init();
    }
}
