package ho.artisan.itig.fabric;

import ho.artisan.itig.ITIGModClient;
import net.fabricmc.api.ClientModInitializer;

public class ITIGModClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ITIGModClient.clientInit();
    }
}
