package com.example.imgstreamproject.api.imgur.endpoint.adapter;

import com.example.imgstreamproject.api.imgur.endpoint.Config;
import com.example.imgstreamproject.api.imgur.endpoint.request.GalleryRequest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GalleryAdapter {

    private final static String GALLERY_URL = Config.BASE_URL + "gallery/";

    private static GalleryRequest galleryRequest;

    public static GalleryRequest getGalleryRequest() {

        if (galleryRequest == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(GALLERY_URL).addConverterFactory(GsonConverterFactory.create()).build();
            galleryRequest = retrofit.create(GalleryRequest.class);
        }
        return galleryRequest;
    }
}
