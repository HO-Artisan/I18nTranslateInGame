package ho.artisan.itig.gui.tooltip;

import dev.architectury.event.events.client.ClientTooltipEvent;

import ho.artisan.itig.config.ITIGConfig;
import ho.artisan.itig.util.TranslationUtil;

import net.minecraft.text.Text;

public class SubTranslationTooltips {
    public static final Text ORIGINAL_TEXT = Text.translatable("gui.igit.screen.original_text");
    public static final Text LANG_KEY_TEXT = Text.translatable("gui.igit.screen.lang_key");
    public static final String sourceText = TranslationUtil.getItemSourceText();
    public static void clientInit() {
        if (ITIGConfig.getConfig().tooltipVisibility) {
            tooltipsInit();
        }
    }

    public static void tooltipsInit() {
        ClientTooltipEvent.ITEM.register((stack, lines, flag) -> {
            lines.add(Text.of(ORIGINAL_TEXT.getString() + sourceText));
            lines.add(Text.of(LANG_KEY_TEXT.getString() + stack.getTranslationKey()));
        });
    }
}
