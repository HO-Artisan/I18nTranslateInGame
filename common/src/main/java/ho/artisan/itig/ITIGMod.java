package ho.artisan.itig;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ITIGMod {
    public static final String MOD_ID = "itig";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {

    }

    public static Identifier getId(String id) {
        return new Identifier(MOD_ID, id);
    }
}
