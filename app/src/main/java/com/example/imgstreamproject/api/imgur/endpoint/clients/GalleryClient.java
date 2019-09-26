package com.example.imgstreamproject.api.imgur.endpoint.clients;

import com.example.imgstreamproject.api.imgur.ConfigValues;
import com.example.imgstreamproject.api.imgur.endpoint.requests.GalleryRequest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GalleryClient {

    private final static String GALLERY_URL = ConfigValues.BASE_URL + "gallery/";

    private static GalleryRequest galleryRequest;

    public static GalleryRequest getGalleryRequest() {

        if (galleryRequest == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(GALLERY_URL).addConverterFactory(GsonConverterFactory.create()).build();
            galleryRequest = retrofit.create(GalleryRequest.class);
        }
        return galleryRequest;
    }
}
