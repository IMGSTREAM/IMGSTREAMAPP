package com.example.imgstreamproject.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.models.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.models.GalleryImage;
import com.example.imgstreamproject.api.imgur.data.models.GalleryItem;
import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.api.imgur.global.parameters.Type;

public class GlideUtil {

    public static void insetInto(Context context, GalleryItem data, View view) {
        String link;
        String type;
        Boolean isAlbum = data.getIs_album();
        Boolean animated;

        if (isAlbum) {
            link = ((GalleryAlbum) data).getImages().get(0).getLink();
            type = ((GalleryAlbum) data).getImages().get(0).getType();
            animated = ((GalleryAlbum) data).getImages().get(0).getAnimated();
        } else {
            link = data.getLink();
            type = ((GalleryImage) data).getType();
            animated = ((GalleryImage) data).getAnimated();
        }

        if (animated) {
            if (type.equals(Type.MP4.getType())) {
                String aux = link.split(".mp4")[0].concat("h.jpeg");
                into(context, aux, (ImageView) view);
            } else {
                gif(context, link, (ImageView) view);
            }
        } else {
            into(context, link, (ImageView) view);
        }

    }

    public static void insetInto(Context context, Image data, View view) {
        String link;
        String type;
        Boolean animated;

        link = data.getLink();
        type = data.getType();
        animated = data.getAnimated();


        if (animated) {
            if (type.equals(Type.MP4.getType())) {
                String aux = link.split(".mp4")[0].concat("h.jpeg");
                into(context, aux, (ImageView) view);
            } else {
                gif(context, link, (ImageView) view);
            }
        } else {
            into(context, link, (ImageView) view);
        }

    }

    public static void into(Context context, String path, ImageView imageView) {
        Glide.with(context).load(path)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .error(R.drawable.ic_launcher_background)
                .into(imageView);
    }

    public static void gif(Context context, String path, ImageView imageView) {
        Glide.with(context).asGif().load(path)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .error(R.drawable.ic_launcher_background)
                .into(imageView);
    }

}
