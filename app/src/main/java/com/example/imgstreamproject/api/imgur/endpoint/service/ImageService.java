package com.example.imgstreamproject.api.imgur.endpoint.service;

import com.example.imgstreamproject.api.imgur.data.DataInterface;
import com.example.imgstreamproject.api.imgur.data.model.Image;

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
