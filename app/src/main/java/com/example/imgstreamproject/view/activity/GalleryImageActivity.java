package com.example.imgstreamproject.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.GalleryImage;
import com.example.imgstreamproject.util.GlideUtil;
import com.example.imgstreamproject.view.BaseActivity;
import com.example.imgstreamproject.view.custom.CommentView;

public class GalleryImageActivity extends BaseActivity {

    private GalleryImage data;


    //VIEWS
    private TextView tvTitle;
    private TextView tvPoints;
    private TextView tvViews;

    private ImageView ivGalleryImage;
    private CommentView commentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_image);

        Intent intent = getIntent();
        data = (GalleryImage) intent.getSerializableExtra("gallery");

        //VIEWS
        tvTitle = findViewById(R.id.tv_gallery_album_title);
        if (data.getTitle() != null)
            tvTitle.setText(data.getTitle());

        tvPoints = findViewById(R.id.tv_gallery_album_points);
        tvPoints.setText(String.valueOf(data.getPoints()).concat(" Points"));

        tvViews = findViewById(R.id.tv_gallery_album_views);
        tvViews.setText(String.valueOf(data.getViews()).concat(" Views"));

        ivGalleryImage = findViewById(R.id.iv_gallery_image);
        GlideUtil.insetInto(this, data, ivGalleryImage);

        commentView = findViewById(R.id.comment_view_gallery_image_comment);
        commentView.setAuthor("Feliciano");
        commentView.setComment("Feliciano");
        commentView.setPoints(110);

    }

}
