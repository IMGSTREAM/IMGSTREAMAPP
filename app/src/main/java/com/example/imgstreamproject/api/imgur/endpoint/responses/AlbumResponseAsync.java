package com.example.imgstreamproject.api.imgur.endpoint.responses;

import com.example.imgstreamproject.api.imgur.data.models.Album;
import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.api.imgur.data.models.ResponseDataModel;
import com.example.imgstreamproject.api.imgur.data.utils.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;
import com.example.imgstreamproject.api.imgur.endpoint.clients.AlbumClient;
import com.example.imgstreamproject.api.imgur.endpoint.requests.AlbumRequest;
import com.example.imgstreamproject.api.imgur.endpoint.services.AlbumService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumResponseAsync implements AlbumService {

    private AlbumRequest albumRequest = AlbumClient.getAlbumRequest();

    public void getAlbum(String id, DataInterface dataInterface) {
        albumRequest.getAlbum(id).enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    Album album = (Album) TransformUtils.transformTo(response.body().getData(), Album.class);
                    dataInterface.get(album);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumImages(String id, DataInterface dataInterface) {
        albumRequest.getAlbumImages(id).enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    List<Image> albumImages = TransformUtils.transformToList(response.body().getData(), Image.class);
                    dataInterface.get(albumImages);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumImage(String idAlbum, String idImage, DataInterface dataInterface) {
        albumRequest.getAlbumImage(idAlbum, idImage).enqueue(
                new Callback<ResponseDataModel>() {
                    @Override
                    public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                        if (response.isSuccessful()) {
                            Image albumImage = (Image) TransformUtils.transformTo(response.body().getData(), Image.class);
                            dataInterface.get(albumImage);
                        } else {
                            dataInterface.get(null);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                        dataInterface.get(null);
                    }
                });
    }
}
