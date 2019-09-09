package com.example.imgstreamproject.api.imgur.endpoint.response;

import com.example.imgstreamproject.api.imgur.data.DataInterface;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;
import com.example.imgstreamproject.api.imgur.data.util.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.ImageAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.request.ImageRequest;
import com.example.imgstreamproject.api.imgur.endpoint.service.ImageService;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageResponseAsync implements ImageService {

    private ImageRequest imageRequest = ImageAdapter.getImageRequest();

    public void getImage(String id, DataInterface dataInterface) {
        imageRequest.getImage(id).enqueue(new Callback<ImgurResponseModel>() {
            @Override
            public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                if (response.isSuccessful()) {
                    Image data = (Image) TransformUtils.transformTo(response.body().getData(), Image.class);
                    dataInterface.get(data);
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

