package com.example.imgstreamproject.api.imgur.endpoint.requests;

import com.example.imgstreamproject.api.imgur.ConfigValues;
import com.example.imgstreamproject.api.imgur.data.models.ResponseDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ImageRequest {

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id}")
    Call<ResponseDataModel> getImage(@Path("id") String id);


}
