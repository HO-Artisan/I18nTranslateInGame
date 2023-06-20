package ho.artisan.itig.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.registry.Registry;

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

    private static final PlayerEntity player = MinecraftClient.getInstance().player; //玩家
    private static final ItemStack item = player.getMainHandStack().getItem().getDefaultStack(); //玩家拿着的物品

    public static String getItemModId() {
        return Registry.ITEM.getId(item.getItem()).getNamespace(); //物品的modid
    }

    public static String getItemTranslationKey() {
        return item.getTranslationKey(); //物品的翻译键
    }

    public static String getItemSourceText() {
        return TranslationUtil.getSourceTranslation(item).getString(); //物品的英文原文
    }

    public static String getItemDisplayName() {
        return item.getName().getString(); //物品的显示名称
    }
}
