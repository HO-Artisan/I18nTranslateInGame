package ho.artisan.itig.forge;

import dev.architectury.platform.forge.EventBuses;
import ho.artisan.itig.ITIGMod;
import ho.artisan.itig.ITIGModClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;

@Mod(ITIGMod.MOD_ID)
public class ITIGModForge {
    public ITIGModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ITIGMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ITIGMod.init();

        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ITIGModClientForge::onInitializeClient);
    }
}
