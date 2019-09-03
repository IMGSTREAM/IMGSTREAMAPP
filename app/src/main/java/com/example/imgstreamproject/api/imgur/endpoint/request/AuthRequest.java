package com.example.imgstreamproject.api.imgur.endpoint.request;

import com.example.imgstreamproject.api.imgur.Configuration;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthRequest {

    @Headers({"Authorization: Client-ID " + Configuration.CLIENT_ID})
    @POST("/authorize")
    Call<Object> getAuthoritation();

}
