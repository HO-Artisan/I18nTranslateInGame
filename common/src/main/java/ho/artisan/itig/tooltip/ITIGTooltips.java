package ho.artisan.itig.tooltip;

import dev.architectury.event.events.client.ClientTooltipEvent;
import net.minecraft.text.Text;

public class ITIGTooltips {
    public static void clientInit() {
        ClientTooltipEvent.ITEM.register((stack, lines, flag) -> {
            lines.add(Text.of(Text.translatable("gui.igit.screen.original_text").getString() + stack.getName().getString()));
            lines.add(Text.of(Text.translatable("gui.igit.screen.lang_key").getString() + stack.getTranslationKey()));
        });
    }
}
