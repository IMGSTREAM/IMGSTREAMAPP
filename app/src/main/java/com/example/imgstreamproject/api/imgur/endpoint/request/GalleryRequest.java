package com.example.imgstreamproject.api.imgur.endpoint.request;

import com.example.imgstreamproject.api.imgur.Configuration;
import com.example.imgstreamproject.api.imgur.data.model.Basic;
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

    /**
     * Returns the images in the gallery. For example the main gallery is https://api.imgur.com/3/gallery/hot/viral/0.json
     */
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("hot/viral/0.json")
    Call<ImgurResponseModel> getGallery();

    /**
     * Returns the images in the gallery. For example the main gallery is https://api.imgur.com/3/gallery/hot/viral/0.json
     *
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
     * Returns the images in the gallery. For example the main gallery is https://api.imgur.com/3/gallery/hot/viral/0.json
     *
     * @param1 section hot | top | user - defaults to hot
     * @param2 sort    viral | top | time | rising (only available with user section) - defaults to viral
     * @param3 window  Change the date range of the request if the section is "top", day | week | month | year | all, defaults to day
     * @param4 page    integer - the data paging number
     * @param5 showViral   true | false - Show or hide viral images from the 'user' section. Defaults to true
     */
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{section}/{sort}/{window}/{page}")
    Call<ImgurResponseModel> getGallery(@Path("section") String section,
                                        @Path("sort") String sort,
                                        @Path("window") String window,
                                        @Path("page") String page,
                                        @Query("showViral") Boolean showViral);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}")
    Call<GalleryAlbum> getAlbum(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}")
    Call<GalleryImage> getImage(@Path("id") String id);


    //VOTES
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}/votes")
    Call<Vote> getAlbumVotes(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}/votes")
    Call<Vote> getImageVotes(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}/votes")
    Call<Vote> getVotes(@Path("id") String id);


    //COMMENTS
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}/comments/{sort}")
    Call<Basic> getAlbumComments(@Path("id") String id,
                                 @Path("sort") Sort sort);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}/comments/{sort}")
    Call<Basic> getImageComments(@Path("id") String id,
                                 @Path("sort") Sort sort);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}/comments/{sort}")
    Call<Basic> getComments(@Path("id") String id,
                            @Path("sort") Sort sort);

    //COMMENT
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id_gallery}/comment/{id_comment}")
    Call<Basic> getAlbumComment(@Path("id_gallery") String id_gallery,
                                @Path("id_comment") String id_comment);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id_gallery}/comment/{id_comment}")
    Call<Basic> getImageComment(@Path("id_gallery") String id_gallery,
                                @Path("id_comment") String id_comment);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id_gallery}/comment/{id_comment}")
    Call<Basic> getComment(@Path("id_gallery") String id_gallery,
                           @Path("id_comment") String id_comment);

    //COMMENT COUNT
    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("album/{id}/comments/count")
    Call<Basic> getAlbumCommentCount(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("image/{id}/comments/count")
    Call<Basic> getImageCommentCount(@Path("id") String id);

    @Headers(Configuration.READ_ONLY_HEADER)
    @GET("{id}/comments/count")
    Call<Basic> getCommentCount(@Path("id") String id);


}
