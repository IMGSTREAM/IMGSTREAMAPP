package com.example.imgstreamproject.api.imgur.endpoint.clients;

import com.example.imgstreamproject.api.imgur.ConfigValues;
import com.example.imgstreamproject.api.imgur.endpoint.requests.ImageRequest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImageClient {

    private static final String IMAGE_URL = ConfigValues.BASE_URL + "image/";

    private static ImageRequest imageRequest;

    private ImageClient() {
    }

    public static ImageRequest getImageRequest() {

        if (imageRequest == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(IMAGE_URL).addConverterFactory(GsonConverterFactory.create()).build();
            imageRequest = retrofit.create(ImageRequest.class);
        }
        return imageRequest;
    }


}
