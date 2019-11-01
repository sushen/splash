package blog.video.biswas.retrofit;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {
    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public Preference(Context context) {
        this.context = context;
    }
}
