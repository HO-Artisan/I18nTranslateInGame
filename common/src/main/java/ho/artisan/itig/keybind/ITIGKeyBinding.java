package ho.artisan.itig.keybind;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import ho.artisan.itig.screen.ITIGScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ITIGKeyBinding {
    //按键绑定之后再说（
    public static final KeyBinding TRANSLATION_SCREEN_KEYBIND = new KeyBinding("key.igit.translation_screen", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "key.igit.categories");

    public static void clientInit() {
        KeyMappingRegistry.register(TRANSLATION_SCREEN_KEYBIND);

        ClientTickEvent.CLIENT_POST.register(client -> {
            if (TRANSLATION_SCREEN_KEYBIND.wasPressed()) {
                MinecraftClient.getInstance().setScreen(new ITIGScreen());
            }
        });
    }
}
