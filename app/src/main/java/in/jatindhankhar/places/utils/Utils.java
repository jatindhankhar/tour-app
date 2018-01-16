package in.jatindhankhar.places.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import java.util.HashMap;

import in.jatindhankhar.places.R;

import static in.jatindhankhar.places.utils.Constants.MAP_KEY_IMAGES;
import static in.jatindhankhar.places.utils.Constants.MAP_KEY_LOCATION;
import static in.jatindhankhar.places.utils.Constants.MAP_KEY_NAME;

/**
 * Created by jatin on 1/15/18.
 */

public class Utils {
    public static void setStatusColor(Context ctx, int color) {
        Window window = ((Activity) ctx).getWindow();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.setStatusBarColor(ContextCompat.getColor(ctx, color));
            }
        }
    }

    public static void setSupportActionBarColor(Context context, int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ((AppCompatActivity) context).getSupportActionBar().setBackgroundDrawable(context.getDrawable(color));
        }
    }

    public static void setAmbience(Context context, int color) {
        setStatusColor(context, color);
        setSupportActionBarColor(context, color);
    }

    @NonNull
    public static String[] fetchArraybyId(Context context, String resName) {
        int resId = context.getResources().getIdentifier(resName, "array", context.getPackageName());
        return context.getResources().getStringArray(resId);
    }

    public static HashMap<String, Object> getExploreMap(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME, context.getResources().getStringArray(R.array.explore_places_name));
        map.put(MAP_KEY_LOCATION, context.getResources().getStringArray(R.array.explore_places_location));
        int[] images = {R.drawable.india_gate,R.drawable.lotus_temple,R.drawable.qutub_minar,R.drawable.akshardham_temple};
        map.put(MAP_KEY_IMAGES, images);
        return map;

    }

    public static HashMap<String, Object> getEatMap(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME, context.getResources().getStringArray(R.array.eat_places_name));
        map.put(MAP_KEY_LOCATION, context.getResources().getStringArray(R.array.eat_places_location));
        int[] images = {R.drawable.paranthe,R.drawable.kulfi,R.drawable.sweets,R.drawable.chaat};
        map.put(MAP_KEY_IMAGES, images);
        return map;
    }

    public static HashMap<String, Object> getShopMap(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME, context.getResources().getStringArray(R.array.shop_places_name));
        map.put(MAP_KEY_LOCATION, context.getResources().getStringArray(R.array.shop_places_location));
        int[] images = {R.drawable.cp,R.drawable.janpath,R.drawable.sn,R.drawable.dilli_haat};
        map.put(MAP_KEY_IMAGES, images);
        return map;
    }

    public static HashMap<String, Object> getStayMap(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME, context.getResources().getStringArray(R.array.stay_places_name));
        map.put(MAP_KEY_LOCATION, context.getResources().getStringArray(R.array.stay_places_location));
        int[] images = {R.drawable.paharganj,R.drawable.saket,R.drawable.cp,R.drawable.south_delhi};
        map.put(MAP_KEY_IMAGES, images);
        return map;
    }
}
