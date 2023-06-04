package ho.artisan.itig.tooltip;

import dev.architectury.event.events.client.ClientTooltipEvent;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;

public class ITIGTooltips {
    public static void clientInit() {
        ClientTooltipEvent.ITEM.register((stack, lines, flag) -> {
            lines.add(Text.of(new TranslatableTextContent("gui.igit.screen.original_text") + stack.getName().getString()));
            lines.add(Text.of(new TranslatableTextContent("gui.igit.screen.lang_key") + stack.getTranslationKey()));
        });
    }
}
