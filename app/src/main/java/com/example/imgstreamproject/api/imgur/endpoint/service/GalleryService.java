package com.example.imgstreamproject.api.imgur.endpoint.service;

import com.example.imgstreamproject.api.imgur.Configuration;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GalleryService {

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("hot/viral/0.json")
    Call<ImgurResponseModel> getGallery();

    /**
     * @param1 section   hot | top | user - defaults to hot
     * @param2 sort      viral | top | time | rising (only available with user section) - defaults to viral
     * @param3 page      integer - the data paging number
     * @param4 showViral true | false - Show or hide viral images from the 'user' section. Defaults to true
     */
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{section}/{sort}/{page}")
    Call<ImgurResponseModel> getGallery(@Path("section") Section section,
                                        @Path("sort") Sort sort,
                                        @Path("page") Integer page,
                                        @Query("showViral") Boolean showViral);

    /**
     * @param1 section hot | top | user - defaults to hot
     * @param2 sort    viral | top | time | rising (only available with user section) - defaults to viral
     * @param3 window  Change the date range of the request if the section is "top", day | week | month | year | all, defaults to day
     * @param4 page    integer - the data paging number
     * @param5 showViral   true | false - Show or hide viral images from the 'user' section. Defaults to true
     */
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{section}/{sort}/{window}/{page}.json")
    Call<ImgurResponseModel> getGallery(@Path("section") String section,
                                        @Path("sort") String sort,
                                        @Path("window") String window,
                                        @Path("page") String page,
                                        @Query("showViral") Boolean showViral);
}
