package com.example.imgstreamproject.api.imgur.endpoint.response;

import android.util.Log;

import com.example.imgstreamproject.api.imgur.data.model.Album;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.model.ImgurDataModel;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.AlbumAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.request.AlbumRequest;
import com.example.imgstreamproject.api.imgur.endpoint.service.AlbumService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumResponse implements AlbumService {

    private AlbumRequest albumRequest = AlbumAdapter.getAlbumRequest();;


    public Album getAlbum(String id) {
        Log.i("getAlbum", "1");
        final Album[] data = new Album[1];

        albumRequest.getAlbum(id).enqueue(new Callback<ImgurResponseModel>() {
            @Override
            public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                Log.i("getAlbum", "onResponse");
                data[0] = (Album) ImgurDataModel.transform(response.body().getData(), Album.class);
            }

            @Override
            public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                Log.i("getAlbum", "onFailure");
                data[0] = null;

            }
        });

        Log.i("getAlbum", "2");
        return data[0];
    }

    public List<Image> getAlbumImages(String id) {
        final List<Image>[] data = new List[1];
        albumRequest.getAlbumImages(id).enqueue(new Callback<ImgurResponseModel>() {
            @Override
            public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                data[0] = ImgurDataModel.transformList(response.body().getData(), Image.class);
            }

            @Override
            public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                data[0] = null;
            }
        });
        return data[0];
    }

    @Override
    public Image getAlbumImage(String id_album, String id_image) {
        final Image[] data = new Image[1];
        albumRequest.getAlbumImage(id_album, id_image).enqueue(new Callback<ImgurResponseModel>() {
            @Override
            public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                data[0] = (Image) ImgurDataModel.transform(response.body().getData(), Image.class);
            }

            @Override
            public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                data[0] = null;

            }
        });
        return data[0];
    }
}
