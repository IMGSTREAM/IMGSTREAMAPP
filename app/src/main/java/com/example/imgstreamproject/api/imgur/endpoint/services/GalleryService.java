package com.example.imgstreamproject.api.imgur.endpoint.services;

import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;
import com.example.imgstreamproject.api.imgur.endpoint.Window;

public interface GalleryService {

    /**
     * Returns the images in the gallery. For example the main gallery is https://api.imgur.com/3/gallery/hot/viral/0.json
     */
    void getGallery(DataInterface dataInterface);

    /**
     * Returns the images in the gallery. For example the main gallery is https://api.imgur.com/3/gallery/hot/viral/0.json
     *
     * @param1 section   hot | top | user - defaults to hot
     * @param2 sort      viral | top | time | rising (only available with user section) - defaults to viral
     * @param3 page      integer - the data paging number
     * @param4 showViral true | false - Show or hide viral images from the 'user' section. Defaults to true
     */
    void getGallery(Section section, Sort sort, Integer page, Boolean showViral, DataInterface dataInterface);

    /**
     * Returns the images in the gallery. For example the main gallery is https://api.imgur.com/3/gallery/hot/viral/0.json
     *
     * @param1 section hot | top | user - defaults to hot
     * @param2 sort    viral | top | time | rising (only available with user section) - defaults to viral
     * @param3 window  Change the date range of the request if the section is "top", day | week | month | year | all, defaults to day
     * @param4 page    integer - the data paging number
     * @param5 showViral   true | false - Show or hide viral images from the 'user' section. Defaults to true
     */
    void getGallery(Section section, Sort sort, Window window, Integer page, Boolean showViral, DataInterface dataInterface);

    void getAlbum(String id, DataInterface dataInterface);

    void getImage(String id, DataInterface dataInterface);

    void getAlbumVotes(String id, DataInterface dataInterface);

    void getImageVotes(String id, DataInterface dataInterface);

    void getVotes(String id, DataInterface dataInterface);

    void getAlbumComments(String id, Sort sort, DataInterface dataInterface);

    void getImageComments(String id, Sort sort, DataInterface dataInterface);

    void getComments(String id, Sort sort, DataInterface dataInterface);

    void getAlbumComment(String id_gallery, String id_comment, DataInterface dataInterface);

    void getImageComment(String id_gallery, String id_comment, DataInterface dataInterface);

    void getComment(String id_gallery, String id_comment, DataInterface dataInterface);

    void getAlbumCommentCount(String id, DataInterface dataInterface);

    void getImageCommentCount(String id, DataInterface dataInterface);

    void getCommentCount(String id, DataInterface dataInterface);

}
