package com.example.imgstreamproject.api.imgur.endpoint.services;

import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;

/**
 * ImageService
 * <p>
 * More info: https://api.imgur.com/endpoints/image
 */
public interface ImageService {

    /**
     * Get information about an image
     *
     * @param id The reference of an image
     */
    void getImage(String id, DataInterface dataInterface);

}
