package com.example.imgstreamproject.api.imgur.endpoint.service;

import com.example.imgstreamproject.api.imgur.data.model.Album;
import com.example.imgstreamproject.api.imgur.data.model.Image;

import java.util.List;

public interface AlbumService {

    /**
     * Get information about a specific album.
     *
     * @param id reference to a specific Album
     */
    Album getAlbum(String id);

    /**
     * Return all of the images in the album
     *
     * @param id reference to a specific Album
     */
    List<Image> getAlbumImages(String id);

    /**
     * Get information about an image in an album, any additional actions found in Image Endpoint will also work.
     *
     * @param id_album reference to a specific Album
     * @param id_image reference to a specific Image
     */
    Image getAlbumImage(String id_album, String id_image);
}
