package com.example.imgstreamproject.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.model.ImgurDataModel;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.AlbumAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.GalleryAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.request.AlbumRequest;
import com.example.imgstreamproject.api.imgur.endpoint.request.GalleryRequest;
import com.example.imgstreamproject.api.imgur.endpoint.response.AlbumResponse;
import com.example.imgstreamproject.api.imgur.endpoint.service.AlbumService;
import com.example.imgstreamproject.view.BaseActivity;
import com.example.imgstreamproject.view.adapter.GalleryAlbumAdapter;
import com.example.imgstreamproject.view.custom.CommentView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GalleryAlbumActivity extends BaseActivity {

    private Context context = this;

    //SERVICE
    private GalleryRequest galleryRequest = GalleryAdapter.getGalleryRequest();
    private AlbumRequest albumRequest = AlbumAdapter.getAlbumRequest();

    private AlbumService albumService = new AlbumResponse();

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

        getData();

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

    public void getData() {
        albumRequest.getAlbumImages(galleryAlbum.getId()).enqueue(getAlbumCallBack());
        data = albumService.getAlbumImages(galleryAlbum.getId());

    }

    public void setRecyclerView() {
        rvGalleryAlbumImages.setLayoutManager(new LinearLayoutManager(context));
        rvGalleryAlbumImages.setAdapter(new GalleryAlbumAdapter(context, data));
    }

    public Callback<ImgurResponseModel> getAlbumCallBack() {
        return new Callback<ImgurResponseModel>() {
            @Override
            public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                Log.i("Call", "Response");
                data = ImgurDataModel.transformList(response.body().getData(), Image.class);
                setRecyclerView();
            }

            @Override
            public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                Log.i("Call", "Throwable");

            }
        };
    }


}
