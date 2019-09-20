package com.example.imgstreamproject.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.util.GlideUtil;

import java.util.List;

public class GalleryAlbumRecyclerAdapter extends RecyclerView.Adapter<GalleryAlbumRecyclerAdapter.ViewHolder> {

    Context context;
    List<Image> data;

    public GalleryAlbumRecyclerAdapter(Context context, List<Image> data) {
        this.context = context;
        this.data = data;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_gallery_album, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    public void onBindViewHolder(ViewHolder holder, int position) {
        GlideUtil.insetInto(context, data.get(position), holder.imageView);
    }


    public int getItemCount() {
        if (data != null) {
            return data.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_item_gallery_album_image);
        }
    }
}
