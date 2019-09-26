package com.example.imgstreamproject.api.imgur.endpoint.services;

import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;

public interface AlbumService {

    /**
     * Get information about a specific album.
     *
     * @param id reference to a specific Album
     */
    void getAlbum(String id, DataInterface dataInterface);

    /**
     * Return all of the images in the album
     *
     * @param id reference to a specific Album
     */
    void getAlbumImages(String id, DataInterface dataInterface);

    /**
     * Get information about an image in an album, any additional actions found in Image Endpoint will also work.
     *
     * @param idAlbum reference to a specific Album
     * @param idImage reference to a specific Image
     */
    void getAlbumImage(String idAlbum, String idImage, DataInterface dataInterface);
}
