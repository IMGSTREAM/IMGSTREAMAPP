package com.example.imgstreamproject.views.adapters.recyclers;

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
import com.example.imgstreamproject.api.imgur.data.models.GalleryItem;
import com.example.imgstreamproject.utils.GlideUtil;
import com.example.imgstreamproject.views.activities.PostActivity;

import java.util.List;

public class GalleryRecyclerAdapter extends RecyclerView.Adapter<GalleryRecyclerAdapter.ViewHolder> {

    private Context context;
    private List<GalleryItem> data;

    public GalleryRecyclerAdapter(Context context, List<GalleryItem> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public GalleryRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_gallery, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GalleryRecyclerAdapter.ViewHolder holder, int position) {
        GalleryItem galleryItem = data.get(position);
        Boolean isAlbum = galleryItem.getIs_album();
        String link;
        String type;
        Boolean animated;

        holder.tvTitle.setText(galleryItem.getTitle());

        GlideUtil.insetInto(context, galleryItem, holder.ivImage);
        holder.ivImage.setClipToOutline(true);
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, PostActivity.class);
            intent.putExtra("isAlbum", isAlbum);
            intent.putExtra("galleryItem", galleryItem);
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
            cLayout = itemView.findViewById(R.id.root_recycler_item_gallery);
            ivImage = itemView.findViewById(R.id.recycler_item_gallery_iv_image);
            tvTitle = itemView.findViewById(R.id.recycler_item_gallery_tv_title);
        }
    }

    public List<GalleryItem> getData() {
        return data;
    }

    public void setData(List<GalleryItem> data) {
        this.data = data;
    }
}
