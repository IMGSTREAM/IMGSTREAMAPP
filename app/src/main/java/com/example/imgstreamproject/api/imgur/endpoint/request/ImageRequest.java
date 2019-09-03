package com.example.imgstreamproject.api.imgur.endpoint.request;

import com.example.imgstreamproject.api.imgur.Configuration;
import com.example.imgstreamproject.api.imgur.data.model.Image;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * ImageRequest
 * <p>
 * More info: https://api.imgur.com/endpoints/image
 */
public interface ImageRequest {

    /**
     * Get information about an image
     *
     * @param id The reference of an image
     */
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}")
    Call<Image> getImage(@Path("id") String id);


}
