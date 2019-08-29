package com.example.imgstreamproject.api.imgur.endpoint.adapter;

import com.example.imgstreamproject.api.imgur.endpoint.Config;
import com.example.imgstreamproject.api.imgur.endpoint.service.GalleryService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GalleryAdapter {

    private final static String GALLERY_URL = Config.BASE_URL + "gallery/";

    private static GalleryService galleryService;

    public static GalleryService getGalleryService() {

        if (galleryService == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(GALLERY_URL).addConverterFactory(GsonConverterFactory.create()).build();
            galleryService = retrofit.create(GalleryService.class);
        }
        return galleryService;
    }
}
