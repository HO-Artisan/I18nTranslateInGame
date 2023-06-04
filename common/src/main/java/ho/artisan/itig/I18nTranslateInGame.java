package ho.artisan.itig;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registries;

import java.util.function.Supplier;

public class I18nTranslateInGame {
    public static final String MOD_ID = "itig";

    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    
    public static void init() {

    }
}
