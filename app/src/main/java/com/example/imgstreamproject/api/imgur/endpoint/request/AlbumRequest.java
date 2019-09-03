package com.example.imgstreamproject.api.imgur.endpoint.request;

import com.example.imgstreamproject.api.imgur.Configuration;
import com.example.imgstreamproject.api.imgur.data.model.Album;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface AlbumRequest {

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}")
    Call<ImgurResponseModel> getAlbum(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}/images")
    Call<ImgurResponseModel> getAlbumImages(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id_album}/image/{id_image}")
    Call<ImgurResponseModel> getAlbumImage(@Path("id_album") String id_album,
                              @Path("id_image") String id_image);
}
