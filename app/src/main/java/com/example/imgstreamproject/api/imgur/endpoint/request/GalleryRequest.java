package com.example.imgstreamproject.api.imgur.endpoint.request;

import com.example.imgstreamproject.api.imgur.Configuration;
import com.example.imgstreamproject.api.imgur.data.model.Basic;
import com.example.imgstreamproject.api.imgur.data.model.Comment;
import com.example.imgstreamproject.api.imgur.data.model.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.model.GalleryImage;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;
import com.example.imgstreamproject.api.imgur.data.model.Vote;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GalleryRequest {

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("hot/viral/0.json")
    Call<ImgurResponseModel> getGallery();

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{section}/{sort}/{page}")
    Call<ImgurResponseModel> getGallery(@Path("section") Section section,
                                        @Path("sort") Sort sort,
                                        @Path("page") Integer page,
                                        @Query("showViral") Boolean showViral);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{section}/{sort}/{window}/{page}")
    Call<ImgurResponseModel> getGallery(@Path("section") Section section,
                                        @Path("sort") Sort sort,
                                        @Path("window") String window,
                                        @Path("page") Integer page,
                                        @Query("showViral") Boolean showViral);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}")
    Call<ImgurResponseModel> getAlbum(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}")
    Call<ImgurResponseModel> getImage(@Path("id") String id);


    //VOTES
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}/votes")
    Call<ImgurResponseModel> getAlbumVotes(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}/votes")
    Call<ImgurResponseModel> getImageVotes(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}/votes")
    Call<ImgurResponseModel> getVotes(@Path("id") String id);


    //COMMENTS
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}/comments/{sort}")
    Call<ImgurResponseModel> getAlbumComments(@Path("id") String id,
                                 @Path("sort") Sort sort);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}/comments/{sort}")
    Call<ImgurResponseModel> getImageComments(@Path("id") String id,
                                 @Path("sort") Sort sort);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}/comments/{sort}")
    Call<ImgurResponseModel> getComments(@Path("id") String id,
                            @Path("sort") Sort sort);

    //COMMENT
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id_gallery}/comment/{id_comment}")
    Call<ImgurResponseModel> getAlbumComment(@Path("id_gallery") String id_gallery,
                                @Path("id_comment") String id_comment);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id_gallery}/comment/{id_comment}")
    Call<ImgurResponseModel> getImageComment(@Path("id_gallery") String id_gallery,
                                @Path("id_comment") String id_comment);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id_gallery}/comment/{id_comment}")
    Call<ImgurResponseModel> getComment(@Path("id_gallery") String id_gallery,
                             @Path("id_comment") String id_comment);

    //COMMENT COUNT
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}/comments/count")
    Call<ImgurResponseModel> getAlbumCommentCount(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}/comments/count")
    Call<ImgurResponseModel> getImageCommentCount(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}/comments/count")
    Call<ImgurResponseModel> getCommentCount(@Path("id") String id);


}
