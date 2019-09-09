package com.example.imgstreamproject.api.imgur.endpoint.response;

import com.example.imgstreamproject.api.imgur.data.model.Album;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;
import com.example.imgstreamproject.api.imgur.data.util.TransformUtils;
import com.example.imgstreamproject.api.imgur.data.DataInterface;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.AlbumAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.request.AlbumRequest;
import com.example.imgstreamproject.api.imgur.endpoint.service.AlbumService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumResponseAsync implements AlbumService {

    private AlbumRequest albumRequest = AlbumAdapter.getAlbumRequest();

    public void getAlbum(String id, DataInterface dataInterface) {
        albumRequest.getAlbum(id).enqueue(new Callback<ImgurResponseModel>() {
            @Override
            public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                if (response.isSuccessful()) {
                    Album album = (Album) TransformUtils.transformTo(response.body().getData(), Album.class);
                    dataInterface.get(album);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumImages(String id, DataInterface dataInterface) {
        albumRequest.getAlbumImages(id).enqueue(new Callback<ImgurResponseModel>() {
            @Override
            public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                if (response.isSuccessful()) {
                    List<Image> albumImages = TransformUtils.transformToList(response.body().getData(), Image.class);
                    dataInterface.get(albumImages);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumImage(String idAlbum, String idImage, DataInterface dataInterface) {
        albumRequest.getAlbumImage(idAlbum, idImage).enqueue(
                new Callback<ImgurResponseModel>() {
                    @Override
                    public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                        if (response.isSuccessful()) {
                            Image albumImage = (Image) TransformUtils.transformTo(response.body().getData(), Image.class);
                            dataInterface.get(albumImage);
                        } else {
                            dataInterface.get(null);
                        }
                    }

                    @Override
                    public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                        dataInterface.get(null);
                    }
                });
    }
}
