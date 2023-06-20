package ho.artisan.itig.config;

import dev.architectury.platform.Platform;
import ho.artisan.itig.ITIGMod;
import ho.artisan.itig.gui.ModConfigScreen;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class ITIGConfig {
    public static ModConfigScreen configScreen;

    public static ModConfigScreen getConfig() {
        if (configScreen == null) {
            AutoConfig.register(ModConfigScreen.class, GsonConfigSerializer::new);
            configScreen = AutoConfig.getConfigHolder(ModConfigScreen.class).getConfig();
        }
        return configScreen;
    }

    public static void saveConfig() {
        AutoConfig.getConfigHolder(getConfig().getClass()).save();
    }

    public static void setConfigScreen() {
        Platform.getMod(ITIGMod.MOD_ID).registerConfigurationScreen(parent -> AutoConfig.getConfigScreen(ModConfigScreen.class, parent).get());
    }
}
