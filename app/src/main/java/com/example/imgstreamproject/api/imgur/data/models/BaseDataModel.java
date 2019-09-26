package com.example.imgstreamproject.api.imgur.data.models;

import java.io.Serializable;

/**
 * BaseDataModel
 * Superclass that others Data Models will extend.
 * <p>
 * More info: https://api.imgur.com/models
 */
public class BaseDataModel implements Serializable {

    /**
     * Transform a object to the class given.
     * <p>
     * Example: GalleryItem galleryItem = (GalleryItem) BaseDataModel.transform(response.body().getData().get(0), GalleryItem.class);
     *
     * @param1 obj Object to transform
     * @param2 tClass Class want to transform
     */

}
