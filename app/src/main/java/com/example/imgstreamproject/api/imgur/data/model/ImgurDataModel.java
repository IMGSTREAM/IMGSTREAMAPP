package com.example.imgstreamproject.api.imgur.data.model;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ImgurDataModel
 * Superclass that others Data Models will extend.
 * <p>
 * More info: https://api.imgur.com/models
 */
public class ImgurDataModel {

    /**
     * Transform a object to the class given.
     * <p>
     * Example: GalleryItem galleryItem = (GalleryItem) ImgurDataModel.transform(response.body().getData().get(0), GalleryItem.class);
     *
     * @param1 obj Object to transform
     * @param2 tClass Class want to transform
     */
    public static Object transform(Object obj, Class tClass) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return gson.fromJson(json, tClass);
    }

    public static Object transform(Object obj, Class aClass, Class bClass) throws JSONException {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        JSONObject jsonOb = new JSONObject(json);
        if (jsonOb.getBoolean("is_album")) {
            return gson.fromJson(json, aClass);
        } else {
            return gson.fromJson(json, bClass);
        }
    }

    public static List<Object> transformList(List<Object> objs, Class tClass) {
        return objs.stream().map(obj -> transform(obj, tClass)).collect(Collectors.toList());
    }

    public static List<Object> transformList(List<Object> objs, Class aClass, Class bClass) {
        return objs.stream().map(obj -> {
            try {
                return transform(obj, aClass, bClass);
            } catch (JSONException e) {
                return null;
            }
        }).collect(Collectors.toList());
    }
}
