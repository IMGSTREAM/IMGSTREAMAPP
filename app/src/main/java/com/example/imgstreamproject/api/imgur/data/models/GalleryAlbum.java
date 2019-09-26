package com.example.imgstreamproject.api.imgur.data.models;

import java.util.List;

/**
 * GalleryAlbum
 * The data model formatted for gallery albums.
 * Example URL: https://api.imgur.com/3/gallery/album/{id}
 * <p>
 * More info: https://api.imgur.com/models/gallery_album
 */
public class GalleryAlbum extends GalleryItem {

    private String cover;
    private Double cover_width;
    private Double cover_height;
    private String privacy;
    private String layout;
    private Double images_count;
    //    TODO Check images. Exact format is Array of Images. See: https://api.imgur.com/models/gallery_album
    private List<Image> images;

    public GalleryAlbum() {
        cover = "";
        cover_width = 0.0;
        cover_height = 0.0;
        privacy = "";
        layout = "";
        images_count = 0.0;
    }

    /**
     * @return cover - The ID of the album cover image.
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover The ID of the album cover image.
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return cover_width - The width, in pixels, of the album cover image.
     */
    public Double getCover_width() {
        return cover_width;
    }

    /**
     * @param cover_width The width, in pixels, of the album cover image.
     */
    public void setCover_width(Double cover_width) {
        this.cover_width = cover_width;
    }

    /**
     * @return cover_height - The height, in pixels, of the album cover image.
     */
    public Double getCover_height() {
        return cover_height;
    }

    /**
     * @param cover_height The height, in pixels, of the album cover image.
     */
    public void setCover_height(Double cover_height) {
        this.cover_height = cover_height;
    }

    /**
     * @return privacy - The privacy level of the album, you can only view public if not logged in as album owner.
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * @param privacy The privacy level of the album, you can only view public if not logged in as album owner.
     */
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    /**
     * @return layout - The view layout of the album.
     */
    public String getLayout() {
        return layout;
    }

    /**
     * @param layout The view layout of the album.
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    /**
     * @return images_count - The total number of images in the album.
     */
    public Double getImages_count() {
        return images_count;
    }

    /**
     * @param images_count The total number of images in the album.
     */
    public void setImages_count(Double images_count) {
        this.images_count = images_count;
    }

    /**
     * @return images - An array of all the images in the album (only available when requesting the direct album).
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * @param images An array of all the images in the album (only available when requesting the direct album)
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }
}
