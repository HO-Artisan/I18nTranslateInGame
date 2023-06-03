package ho.artisan.itig.screen;

import ho.artisan.itig.I18nTranslateInGame;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ITIGScreen extends Screen {
    public static final Text TRANSLATION_KEY_TEXT = Text.translatable("");
    public static final Text TRANSLATION_CONTEXT_TEXT = Text.translatable("");
    public static final Text BUTTON_TEXT = Text.translatable("");
    public static final Text TITLE_TEXT = Text.translatable("gui.igit.title");
    protected ITIGScreen(Text title) {
        super(title);

    }

    @Override
    public Text getTitle() {
        return TITLE_TEXT;
    }
}
