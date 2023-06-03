package ho.artisan.itig;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registries;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import java.util.function.Supplier;

public class I18nTranslateInGame {
    public static final String MOD_ID = "itig";

    //按键绑定之后再说（
    public static final KeyBinding TRANSLATION_SCREEN_KEYBIND = new KeyBinding("key.igit.translation_screen", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "key.igit.categories");
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    
    public static void init() {

    }
}
