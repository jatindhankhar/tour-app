package in.jatindhankhar.places.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

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
    public static String[] fetchArraybyId(Context context, String resName)
    {
        int resId = context.getResources().getIdentifier(resName,"array",context.getPackageName());
        return context.getResources().getStringArray(resId);
    }
}
