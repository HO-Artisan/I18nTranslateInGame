package ho.artisan.itig.tooltip;

import dev.architectury.event.events.client.ClientTooltipEvent;
import ho.artisan.itig.util.TranslationUtil;
import net.minecraft.text.Text;

public class ITIGTooltips {
    public static final Text ORIGINAL_TEXT = Text.translatable("gui.igit.screen.original_text");
    public static final Text LANG_KEY_TEXT = Text.translatable("gui.igit.screen.lang_key");
    public static void clientInit() {
        ClientTooltipEvent.ITEM.register((stack, lines, flag) -> {
            lines.add(Text.of(ORIGINAL_TEXT.getString() + TranslationUtil.getSourceTranslation(stack).getString()));
            lines.add(Text.of(LANG_KEY_TEXT.getString() + stack.getTranslationKey()));
        });
    }
}
