package com.example.imgstreamproject.api.imgur.endpoint.adapter;

import com.example.imgstreamproject.api.imgur.endpoint.Config;
import com.example.imgstreamproject.api.imgur.endpoint.request.ImageRequest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImageAdapter {

    private static final String IMAGE_URL = Config.BASE_URL + "image/";

    private static ImageRequest imageRequest;

    private ImageAdapter() {
    }

    public static ImageRequest getImageRequest() {

        if (imageRequest == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(IMAGE_URL).addConverterFactory(GsonConverterFactory.create()).build();
            imageRequest = retrofit.create(ImageRequest.class);
        }
        return imageRequest;
    }


}
