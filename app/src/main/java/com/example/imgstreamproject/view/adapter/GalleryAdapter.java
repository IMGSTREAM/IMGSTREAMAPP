package com.example.imgstreamproject.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.GalleryItem;
import com.example.imgstreamproject.util.GlideUtil;
import com.example.imgstreamproject.view.activity.GalleryAlbumActivity;
import com.example.imgstreamproject.view.activity.GalleryImageActivity;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    private Context context;
    private List<GalleryItem> data;

    public GalleryAdapter(Context context, List<GalleryItem> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GalleryAdapter.ViewHolder holder, int position) {
        GalleryItem galleryItem = data.get(position);
        String link;
        String type;
        Boolean animated;

        holder.tvTitle.setText(galleryItem.getTitle());

        GlideUtil.insetInto(context, galleryItem, holder.ivImage);
        holder.ivImage.setClipToOutline(true);
        holder.itemView.setOnClickListener(v -> {
            Intent intent;
            if (galleryItem.getIs_album()) {
                intent = new Intent(context, GalleryAlbumActivity.class);
            } else {
                intent = new Intent(context, GalleryImageActivity.class);
            }
            intent.putExtra("gallery", galleryItem);
            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        return data.size();
    }

    //CUSTOM VIEW HOLDER
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout cLayout;
        ImageView ivImage;
        TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            cLayout = itemView.findViewById(R.id.c_layout_item_gallery);
            ivImage = itemView.findViewById(R.id.iv_item_gallery_image);
            tvTitle = itemView.findViewById(R.id.tv_item_gallery_title);
        }
    }

    public List<GalleryItem> getData() {
        return data;
    }

    public void setData(List<GalleryItem> data) {
        this.data = data;
    }
}
