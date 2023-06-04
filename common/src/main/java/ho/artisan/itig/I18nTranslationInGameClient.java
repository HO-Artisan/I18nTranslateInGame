package ho.artisan.itig;

import dev.architectury.event.events.client.ClientTooltipEvent;
import net.minecraft.text.Text;

public class I18nTranslationInGameClient {
    public static void clientInit() {
        ClientTooltipEvent.ITEM.register((stack, lines, flag) -> {
            lines.add(Text.of("原文：" + stack.getName()));
            lines.add(Text.of("键：" + stack.getTranslationKey()));
        });
    }
}
