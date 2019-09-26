package com.example.imgstreamproject.views.adapters.recyclers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.utils.GlideUtil;
import com.example.imgstreamproject.views.BaseActivity;
import com.example.imgstreamproject.views.activities.FullScreenActivity;

import java.util.List;

public class PostRecyclerAdapter extends RecyclerView.Adapter<PostRecyclerAdapter.ViewHolder> {

    Context context;
    List<Image> data;

    public PostRecyclerAdapter(Context context, List<Image> data) {
        this.context = context;
        this.data = data;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_post, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        GlideUtil.insetInto(context, data.get(position), holder.imageView);
        holder.imageView.setOnTouchListener((v, me) -> false);
        holder.imageView.setOnClickListener(v -> ((BaseActivity) context).launchActivity(FullScreenActivity.class));
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
            imageView = itemView.findViewById(R.id.recycler_item_post_iv_image);
        }
    }
}
