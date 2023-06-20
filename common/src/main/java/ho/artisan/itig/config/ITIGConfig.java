package ho.artisan.itig.config;

import dev.architectury.platform.Platform;
import ho.artisan.itig.ITIGMod;
import ho.artisan.itig.screen.ITIGConfigScreen;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class ITIGConfig {
    public static ITIGConfigScreen configScreen;

    public static ITIGConfigScreen getConfig() {
        if (configScreen == null) {
            AutoConfig.register(ITIGConfigScreen.class, GsonConfigSerializer::new);
            configScreen = AutoConfig.getConfigHolder(ITIGConfigScreen.class).getConfig();
        }
        return configScreen;
    }

    public static void saveConfig() {
        AutoConfig.getConfigHolder(getConfig().getClass()).save();
    }

    public static void setConfigScreen() {
        Platform.getMod(ITIGMod.MOD_ID).registerConfigurationScreen(parent -> AutoConfig.getConfigScreen(ITIGConfigScreen.class, parent).get());
    }
}
