package com.example.imgstreamproject.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.models.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.models.GalleryImage;
import com.example.imgstreamproject.api.imgur.data.models.GalleryItem;
import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.api.imgur.endpoint.responses.AlbumResponseAsync;
import com.example.imgstreamproject.api.imgur.endpoint.services.AlbumService;
import com.example.imgstreamproject.utils.GlideUtil;
import com.example.imgstreamproject.views.BaseActivity;
import com.example.imgstreamproject.views.adapters.recyclers.PostRecyclerAdapter;
import com.example.imgstreamproject.views.customs.CommentView;

import java.util.ArrayList;
import java.util.List;

public class PostActivity extends BaseActivity {

    private Boolean isAlbum;
    private GalleryItem galleryItem;
    private GalleryAlbum galleryAlbum;
    private List<Image> postImages = new ArrayList<>();
    private GalleryImage galleryImage;
    private AlbumService albumService;

    //VIEW
    private TextView tvTitle;
    private TextView tvPoints;
    private TextView tvViews;

    private RecyclerView rvImages;
    private ImageView ivGalleryImage;

    private CommentView commentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        isAlbum = intent.getBooleanExtra("isAlbum", false);
        galleryItem = (GalleryItem) intent.getSerializableExtra("galleryItem");

        initView();
        if (isAlbum) {
            galleryAlbum = (GalleryAlbum) galleryItem;
            albumService = new AlbumResponseAsync();

            albumService.getAlbumImages(galleryAlbum.getId(), ai -> {
                postImages = (List<Image>) ai;
                setAlbumRecyclerView();
            });

            rvImages = findViewById(R.id.activity_post_rv_images);
            rvImages.setVisibility(View.VISIBLE);
        } else {
            galleryImage = (GalleryImage) galleryItem;

            ivGalleryImage = findViewById(R.id.activity_post_iv_image);
            ivGalleryImage.setVisibility(View.VISIBLE);
            GlideUtil.insetInto(this, galleryImage, ivGalleryImage);
        }
    }

    private void initView() {
        tvTitle = findViewById(R.id.activity_post_header_tv_title);
        if (galleryItem.getTitle() != null)
            tvTitle.setText(galleryItem.getTitle());
        tvPoints = findViewById(R.id.activity_post_header_tv_points);
        tvPoints.setText(String.valueOf(galleryItem.getPoints()).concat(" Points"));
        tvViews = findViewById(R.id.activity_post_header_tv_views);
        tvViews.setText(String.valueOf(galleryItem.getViews()).concat(" Views"));

        commentView = findViewById(R.id.activity_post_cv_comment);
        commentView.setAuthor("Feliciano");
        commentView.setComment("Feliciano");
        commentView.setPoints(110);
    }

    public void setAlbumRecyclerView() {
        rvImages.setLayoutManager(new LinearLayoutManager(this));
        rvImages.setAdapter(new PostRecyclerAdapter(this, postImages));
    }

}
