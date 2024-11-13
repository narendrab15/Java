import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yourcompany.adapters.OptionalTypeAdapter;
import java.util.Optional;

public class GsonConfig {
    public static Gson createGson() {
        return new GsonBuilder()
                .registerTypeAdapter(Optional.class, new OptionalTypeAdapter<>())
                .create();
    }
}