package com.example.imgstreamproject.utils;

import android.widget.ImageView;

import com.example.imgstreamproject.R;
import com.squareup.picasso.Picasso;

public class PicassoUtil {

    public static void into(String path, ImageView imageView) {
        Picasso.get().load(path).error(R.drawable.ic_launcher_background).into(imageView);
    }
}
