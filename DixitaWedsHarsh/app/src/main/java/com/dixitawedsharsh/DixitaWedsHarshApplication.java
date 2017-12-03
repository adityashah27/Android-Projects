package com.dixitawedsharsh;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by Aditya on 2/6/2017.
 */
public class DixitaWedsHarshApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Elevation.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
