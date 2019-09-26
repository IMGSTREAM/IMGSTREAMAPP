package com.example.imgstreamproject.api.imgur.endpoint.responses;

import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;
import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.api.imgur.data.models.ResponseDataModel;
import com.example.imgstreamproject.api.imgur.data.utils.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.clients.ImageClient;
import com.example.imgstreamproject.api.imgur.endpoint.requests.ImageRequest;
import com.example.imgstreamproject.api.imgur.endpoint.services.ImageService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageResponseAsync implements ImageService {

    private ImageRequest imageRequest = ImageClient.getImageRequest();

    public void getImage(String id, DataInterface dataInterface) {
        imageRequest.getImage(id).enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    Image data = (Image) TransformUtils.transformTo(response.body().getData(), Image.class);
                    dataInterface.get(data);
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

