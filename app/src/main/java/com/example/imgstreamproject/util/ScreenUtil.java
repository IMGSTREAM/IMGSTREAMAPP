package com.example.imgstreamproject.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.view.WindowManager;

public class ScreenUtil {

    public static int getX(SharedPreferences preferences) {
        SharedPreferences sharedPreferences = preferences;
        return sharedPreferences.getInt("x", 0);
    }

    public static void setX(WindowManager windowManager, SharedPreferences preferences) {
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        int screenWidth = point.x;

        SharedPreferences sharedPreferences = preferences;
        SharedPreferences.Editor lPEditor = sharedPreferences.edit();
        lPEditor.putInt("x", screenWidth);
        lPEditor.commit();
    }
}
