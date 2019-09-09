package com.example.imgstreamproject.api.imgur.data.util;

import com.example.imgstreamproject.api.imgur.data.model.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.model.GalleryImage;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.stream.Collectors;

public class TransformUtils {


    public static Object transformTo(Object obj, Class tClass) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return gson.fromJson(json, tClass);
    }

    public static Object transformTo(Object obj, Boolean bool, Class aClass, Class bClass) throws JSONException {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        JSONObject jsonOb = new JSONObject(json);
        if (bool) {
            return gson.fromJson(json, aClass);
        } else {
            return gson.fromJson(json, bClass);
        }
    }

    public static List<Object> transformToList(List<Object> objs, Class tClass) {
        return objs.stream().map(obj -> transformTo(obj, tClass)).collect(Collectors.toList());
    }

    public static List<Object> transformToList(List<Object> objs, Boolean bool, Class aClass, Class bClass) {
        return objs.stream().map(obj -> {
            try {
                return transformTo(obj, bool, aClass, bClass);
            } catch (JSONException e) {
                return null;
            }
        }).collect(Collectors.toList());
    }

    public static Object transformGalleryItemTo(Object obj) throws JSONException {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        JSONObject jsonOb = new JSONObject(json);
        if (jsonOb.getBoolean("is_album")) {
            return gson.fromJson(json, GalleryAlbum.class);
        } else {
            return gson.fromJson(json, GalleryImage.class);
        }
    }

    public static List<Object> transformGalleryItemToList(List<Object> objs) {
        return objs.stream().map(obj -> {
            try {
                return transformGalleryItemTo(obj);
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }).collect(Collectors.toList());
    }

}
