package com.example.imgstreamproject.view.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.imgstreamproject.api.imgur.data.model.GalleryAlbum;

import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.GalleryImage;
import com.example.imgstreamproject.api.imgur.data.model.GalleryItem;
import com.example.imgstreamproject.api.imgur.global.parameter.Type;
import com.example.imgstreamproject.util.GlideUtil;
import com.example.imgstreamproject.util.ToastUtil;

import java.util.List;

public class GalleryActivityAdapter extends RecyclerView.Adapter<GalleryActivityAdapter.GalleryViewHolder> {

    private static SharedPreferences layoutPreferences;
    private Context context;
    private List<GalleryItem> data;

    public GalleryActivityAdapter(Context context, List<GalleryItem> data) {

        this.context = context;
        this.data = data;
    }

    @Override
    public GalleryActivityAdapter.GalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //INFLATE THE ITEM
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);

        //SET THE VIEW'S ATTRIBUTES (SIZE, MARGINS...)

        GalleryViewHolder galleryViewHolder = new GalleryViewHolder(view);
        return galleryViewHolder;
    }

    @Override
    public void onBindViewHolder(GalleryActivityAdapter.GalleryViewHolder holder, int position) {
            GalleryItem item = data.get(position);
            String link;
            String type;
            Boolean animated;


            if (item.getIs_album()) {
                link = ((GalleryAlbum) item).getImages().get(0).getLink();
                type = ((GalleryAlbum) item).getImages().get(0).getType();
                animated = ((GalleryAlbum) item).getImages().get(0).getAnimated();
            } else {
                link = item.getLink();
                type = ((GalleryImage) item).getType();
                animated = ((GalleryImage) item).getAnimated();
            }

            //SET THE DATA IN THE ITEM
            holder.tvTitle.setText(item.getTitle());
            if (animated) {
                if (type.equals(Type.MP4.getType())) {
                    String aux = link.split(".mp4")[0].concat("h.jpeg");
                    GlideUtil.into(context, aux, holder.ivImage);
                } else {
                    GlideUtil.gif(context, link, holder.ivImage);
                }
            } else {
                GlideUtil.into(context, link, holder.ivImage);
            }

            holder.ivImage.setClipToOutline(true);
            //IMPLEMENT setOnClickListener FOR ITEM
            holder.itemView.setOnClickListener(v -> {
                ToastUtil.toast(context, String.valueOf(position));
            });

    }

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        return data.size();
    }

    //CUSTOM VIEW HOLDER
    public static class GalleryViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout cLayout;
        ImageView ivImage;
        TextView tvTitle;

        public GalleryViewHolder(View itemView) {
            super(itemView);
            cLayout = itemView.findViewById(R.id.r_layout_item_gallery);
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
