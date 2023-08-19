package ho.artisan.itig.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;

public class GsonUtil {

    private Gson gson;
    private Map<String, String> map;

    public GsonUtil(GsonBuilder builder) {
        this.gson = builder.create();
    }

    public void putTranslateKey(String key, String value) {
        map.put(key, value);
    }

    public String toJson() {
        return gson.toJson(map);
    }

}
