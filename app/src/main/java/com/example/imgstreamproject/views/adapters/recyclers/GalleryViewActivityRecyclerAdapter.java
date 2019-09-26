package com.example.imgstreamproject.views.adapters.recyclers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.api.imgur.global.parameters.Type;
import com.example.imgstreamproject.utils.GlideUtil;

import java.util.List;

public class GalleryViewActivityRecyclerAdapter extends RecyclerView.Adapter<GalleryViewActivityRecyclerAdapter.ViewHolder> {

    Context context;
    List<Image> data;

    public GalleryViewActivityRecyclerAdapter(Context context, List<Image> data) {
        this.context = context;
        this.data = data;
    }

    public GalleryViewActivityRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);

        //SET THE VIEW'S ATTRIBUTES (SIZE, MARGINS...)

        ViewHolder galleryViewHolder = new ViewHolder(view);
        return galleryViewHolder;
    }


    public void onBindViewHolder(GalleryViewActivityRecyclerAdapter.ViewHolder holder, int position) {
        Image image = data.get(position);
        String link = image.getLink();
        String type = image.getType();
        Boolean animated = image.getAnimated();

        if (animated) {
            if (type.equals(Type.MP4.getType())) {
                String aux = link.split(".mp4")[0].concat("h.jpeg");
                GlideUtil.into(context, aux, (ImageView) holder.imageView);
            } else {
                GlideUtil.gif(context, link, (ImageView) holder.imageView);
            }
        } else {
            GlideUtil.into(context, link, (ImageView) holder.imageView);
        }

        GlideUtil.into(context, data.get(position).getLink(), (ImageView) holder.imageView);

    }


    public int getItemCount() {
        if (data != null) {
            return data.size();
        }
        return 0;
    }

    //CUSTOM VIEW HOLDER
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView;
        }
    }
}
