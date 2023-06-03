package ho.artisan.itig.util;

import net.minecraft.item.ItemStack;

public record ItemInfoGetter(String sourceText, String stringID, ItemStack itemStack) {

    public String getSourceText() {
        return sourceText;
    }

    public String getStringID() {
        return stringID;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
