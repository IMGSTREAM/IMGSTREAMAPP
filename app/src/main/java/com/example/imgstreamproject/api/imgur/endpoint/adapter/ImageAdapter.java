package com.example.imgstreamproject.api.imgur.endpoint.adapter;

import com.example.imgstreamproject.api.imgur.endpoint.Config;
import com.example.imgstreamproject.api.imgur.endpoint.service.ImageService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImageAdapter {

    private final static String IMAGE_URL = Config.BASE_URL + "image/";

    private static ImageService imageService;

    public static ImageService getImageService() {

        if (imageService == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(IMAGE_URL).addConverterFactory(GsonConverterFactory.create()).build();
            imageService = retrofit.create(ImageService.class);
        }
        return imageService;
    }


}
