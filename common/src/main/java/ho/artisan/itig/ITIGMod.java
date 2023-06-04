package ho.artisan.itig;

import com.google.common.base.Suppliers;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.Registries;
import ho.artisan.itig.screen.ITIGConfigScreen;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ITIGMod {
    public static final String MOD_ID = "itig";

    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    
    public static void init() {
        Platform.getMod(MOD_ID).registerConfigurationScreen(parent -> AutoConfig.getConfigScreen(ITIGConfigScreen.class, parent).get());
    }

    public static Identifier getId(String id) {
        return new Identifier(MOD_ID, id);
    }
}