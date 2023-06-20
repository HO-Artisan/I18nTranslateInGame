package ho.artisan.itig.mixin;

import com.google.common.collect.Lists;
import ho.artisan.itig.ITIGMod;
import ho.artisan.itig.config.ITIGConfig;
import ho.artisan.itig.util.TranslationUtil;
import net.minecraft.client.resource.language.LanguageDefinition;
import net.minecraft.client.resource.language.LanguageManager;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.resource.ResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;

@Mixin(LanguageManager.class)
public abstract class LanguageManagerMixin {
    @Shadow
    public abstract LanguageDefinition getLanguage(String code);

    @Inject(method = "reload(Lnet/minecraft/resource/ResourceManager;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/resource/language/TranslationStorage;load(Lnet/minecraft/resource/ResourceManager;Ljava/util/List;)Lnet/minecraft/client/resource/language/TranslationStorage;"
            ),
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void init(ResourceManager manager, CallbackInfo ci, LanguageDefinition languageDefinition, List<LanguageDefinition> list) {
        try {
            LanguageDefinition sublanguage = this.getLanguage(ITIGConfig.getConfig().translatedLanguages);
            list.add(1, sublanguage);
            TranslationUtil.subTranslationStorage = TranslationStorage.load(manager, Lists.newArrayList(sublanguage));
            ITIGMod.LOGGER.info("已加载第二语言的翻译对象。");
        } catch (Exception exception) {
            ITIGMod.LOGGER.error(new RuntimeException("未知的第二语言：" + ITIGConfig.getConfig().translatedLanguages, exception).getMessage());
        }

    }
}
