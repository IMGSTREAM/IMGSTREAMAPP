package com.example.imgstreamproject.api.imgur.endpoint.requests;

import com.example.imgstreamproject.api.imgur.ConfigValues;
import com.example.imgstreamproject.api.imgur.data.models.ResponseDataModel;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GalleryRequest {

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("hot/viral/0.json")
    Call<ResponseDataModel> getGallery();

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{section}/{sort}/{page}")
    Call<ResponseDataModel> getGallery(@Path("section") String section,
                                       @Path("sort") String sort,
                                       @Path("page") Integer page,
                                       @Query("showViral") Boolean showViral);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{section}/{sort}/{window}/{page}")
    Call<ResponseDataModel> getGallery(@Path("section") String section,
                                       @Path("sort") String sort,
                                       @Path("window") String window,
                                       @Path("page") Integer page,
                                       @Query("showViral") Boolean showViral);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("album/{id}")
    Call<ResponseDataModel> getAlbum(@Path("id") String id);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("image/{id}")
    Call<ResponseDataModel> getImage(@Path("id") String id);


    //VOTES
    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("album/{id}/votes")
    Call<ResponseDataModel> getAlbumVotes(@Path("id") String id);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("image/{id}/votes")
    Call<ResponseDataModel> getImageVotes(@Path("id") String id);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id}/votes")
    Call<ResponseDataModel> getVotes(@Path("id") String id);


    //COMMENTS
    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("album/{id}/comments/{sort}")
    Call<ResponseDataModel> getAlbumComments(@Path("id") String id,
                                             @Path("sort") Sort sort);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("image/{id}/comments/{sort}")
    Call<ResponseDataModel> getImageComments(@Path("id") String id,
                                             @Path("sort") Sort sort);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id}/comments/{sort}")
    Call<ResponseDataModel> getComments(@Path("id") String id,
                                        @Path("sort") Sort sort);

    //COMMENT
    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("album/{id_gallery}/comment/{id_comment}")
    Call<ResponseDataModel> getAlbumComment(@Path("id_gallery") String id_gallery,
                                            @Path("id_comment") String id_comment);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("image/{id_gallery}/comment/{id_comment}")
    Call<ResponseDataModel> getImageComment(@Path("id_gallery") String id_gallery,
                                            @Path("id_comment") String id_comment);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id_gallery}/comment/{id_comment}")
    Call<ResponseDataModel> getComment(@Path("id_gallery") String id_gallery,
                                       @Path("id_comment") String id_comment);

    //COMMENT COUNT
    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("album/{id}/comments/count")
    Call<ResponseDataModel> getAlbumCommentCount(@Path("id") String id);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("image/{id}/comments/count")
    Call<ResponseDataModel> getImageCommentCount(@Path("id") String id);

    @Headers(ConfigValues.AUTH_CLIENT_HEADER)
    @GET("{id}/comments/count")
    Call<ResponseDataModel> getCommentCount(@Path("id") String id);


}
