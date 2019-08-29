package com.example.imgstreamproject.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.example.imgstreamproject.R;

public class GlideUtil {

    public static void into(Context context, String path, ImageView imageView) {
        Glide.with(context).load(path).error(R.drawable.ic_launcher_background).into(imageView);
    }

    public static void gif(Context context, String path, ImageView imageView) {
        Glide.with(context).asGif().load(path).error(R.drawable.ic_launcher_background).into(imageView);
    }

}
