package com.example.imgstreamproject.api.imgur.endpoint.request;

import com.example.imgstreamproject.api.imgur.Configuration;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ImageRequest {

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}")
    Call<ImgurResponseModel> getImage(@Path("id") String id);


}
