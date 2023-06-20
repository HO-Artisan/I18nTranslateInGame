package ho.artisan.itig.util;

import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class TranslationUtil {
    public static TranslationStorage subTranslationStorage;

    public static Text getSourceTranslation(ItemStack itemStack) {
        if (subTranslationStorage != null && !itemStack.hasCustomName()) {
            Text name = itemStack.getName();
            String subName = subTranslationStorage.get(itemStack.getTranslationKey());
            if (!subName.equals(name.getString()) && !subName.equals(itemStack.getTranslationKey())) {
                return Text.literal(subName);
            }
        }
        return itemStack.getName();
    }
}
