package com.example.imgstreamproject.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.endpoint.response.AlbumResponseAsync;
import com.example.imgstreamproject.api.imgur.endpoint.service.AlbumService;
import com.example.imgstreamproject.view.BaseActivity;
import com.example.imgstreamproject.view.adapter.GalleryAlbumRecyclerAdapter;
import com.example.imgstreamproject.view.custom.CommentView;

import java.util.ArrayList;
import java.util.List;

public class GalleryAlbumActivity extends BaseActivity {

    private Context mContext = this;

    //SERVICE
    private AlbumService albumService = new AlbumResponseAsync();

    //DATA
    private GalleryAlbum galleryAlbum = new GalleryAlbum();
    private List<Image> data = new ArrayList<>();

    //VIEWS
    private TextView tvTitle;
    private TextView tvPoints;
    private TextView tvViews;

    private RecyclerView rvGalleryAlbumImages;
    private CommentView commentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_album);

        Intent intent = getIntent();
        galleryAlbum = (GalleryAlbum) intent.getSerializableExtra("gallery");

        initData();

        //VIEWS
        tvTitle = findViewById(R.id.tv_gallery_album_title);
        tvTitle.setText(galleryAlbum.getTitle());

        tvPoints = findViewById(R.id.tv_gallery_album_points);
        tvPoints.setText(String.valueOf(galleryAlbum.getPoints()).replaceFirst(".0", "").concat(" Points"));

        tvViews = findViewById(R.id.tv_gallery_album_views);
        tvViews.setText(String.valueOf(galleryAlbum.getViews()).replaceFirst(".0", "").concat(" Views"));

        rvGalleryAlbumImages = findViewById(R.id.rv_gallery_album_images);
        setRecyclerView();

        commentView = findViewById(R.id.comment_view_gallery_album_comment);
        commentView.setAuthor("Feliciano");
        commentView.setComment("Feliciano");
        commentView.setPoints(110);


    }

    public void initData() {
        albumService.getAlbumImages(galleryAlbum.getId(), ai -> {
            data = (List<Image>) ai;
            setRecyclerView();
        });
    }

    public void setRecyclerView() {
        rvGalleryAlbumImages.setLayoutManager(new LinearLayoutManager(mContext));
        rvGalleryAlbumImages.setAdapter(new GalleryAlbumRecyclerAdapter(mContext, data));
    }

}
