package com.example.imgstreamproject.api.imgur.endpoint.clients;

import com.example.imgstreamproject.api.imgur.ConfigValues;
import com.example.imgstreamproject.api.imgur.endpoint.requests.AlbumRequest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AlbumClient {

    private static final String ALBUM_URL = ConfigValues.BASE_URL + "album/";

    private static AlbumRequest albumRequest;

    private AlbumClient() {
    }

    public static AlbumRequest getAlbumRequest() {
        if (albumRequest == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(ALBUM_URL).addConverterFactory(GsonConverterFactory.create()).build();
            albumRequest = retrofit.create(AlbumRequest.class);
        }
        return albumRequest;
    }

}
