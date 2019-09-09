package com.example.imgstreamproject.api.imgur.data.model;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ImgurDataModel
 * Superclass that others Data Models will extend.
 * <p>
 * More info: https://api.imgur.com/models
 */
public class ImgurDataModel implements Serializable {

    /**
     * Transform a object to the class given.
     * <p>
     * Example: GalleryItem galleryItem = (GalleryItem) ImgurDataModel.transform(response.body().getData().get(0), GalleryItem.class);
     *
     * @param1 obj Object to transform
     * @param2 tClass Class want to transform
     */

}
