package com.example.imgstreamproject.api.imgur.endpoint.requests;

import com.example.imgstreamproject.api.imgur.ConfigValues;
import com.example.imgstreamproject.api.imgur.data.models.ResponseDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface AlbumRequest {

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id}")
    Call<ResponseDataModel> getAlbum(@Path("id") String id);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id}/images")
    Call<ResponseDataModel> getAlbumImages(@Path("id") String id);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id_album}/image/{id_image}")
    Call<ResponseDataModel> getAlbumImage(@Path("id_album") String id_album,
                                          @Path("id_image") String id_image);
}
