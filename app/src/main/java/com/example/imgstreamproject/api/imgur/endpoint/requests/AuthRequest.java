package com.example.imgstreamproject.api.imgur.endpoint.requests;

import com.example.imgstreamproject.api.imgur.ConfigValues;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthRequest {

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @POST("/authorize")
    Call<Object> getAuthoritation();

}
