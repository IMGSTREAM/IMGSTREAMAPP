package com.example.imgstreamproject.util;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.model.GalleryImage;
import com.example.imgstreamproject.api.imgur.data.model.GalleryItem;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.global.parameter.Type;

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
        Glide.with(context).load(path).error(R.drawable.ic_launcher_background).into(imageView);
    }

    public static void gif(Context context, String path, ImageView imageView) {
        Glide.with(context).asGif().load(path).error(R.drawable.ic_launcher_background).into(imageView);
    }

}
