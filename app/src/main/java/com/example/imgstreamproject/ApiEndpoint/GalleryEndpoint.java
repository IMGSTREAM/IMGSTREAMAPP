package com.example.imgstreamproject.ApiEndpoint;

import com.example.imgstreamproject.Dto.GalleryItem;

public class GalleryEndpoint {

    private String route = "https://api.imgur.com/3/gallery/";

    /**
     * Returns the images in the gallery.
     * For example the main gallery is https://api.imgur.com/3/gallery/hot/viral/0.json
     */
    public GalleryItem gallery() {
        String route = "https://api.imgur.com/3/gallery/hot/viral/0.json";
        return null;
    }

    public GalleryItem gallery(String section, String sort, Integer page, String windows, Boolean showViral) {
        return null;
    }

}
