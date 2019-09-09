package com.example.imgstreamproject.api.imgur.endpoint.adapter;

import com.example.imgstreamproject.api.imgur.endpoint.Config;
import com.example.imgstreamproject.api.imgur.endpoint.request.AlbumRequest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AlbumAdapter {

    private static final String ALBUM_URL = Config.BASE_URL + "album/";

    private static AlbumRequest albumRequest;

    private AlbumAdapter() {
    }

    public static AlbumRequest getAlbumRequest() {
        if (albumRequest == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(ALBUM_URL).addConverterFactory(GsonConverterFactory.create()).build();
            albumRequest = retrofit.create(AlbumRequest.class);
        }
        return albumRequest;
    }

}
