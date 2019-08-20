package com.example.imgstreamproject.Dto;

import java.util.List;

/**
 * CustomGallery
 * This model represents a user's custom or filtered gallery.
 * Example URL: https://api.imgur.com/3/g/custom
 * <p>
 * More info: https://api.imgur.com/models/custom_gallery
 */
public class CustomGallery extends ImgurDataModel {

    private String account_url;
    private String link;
    private List<Tag> tags;
    private Integer item_count;
    //    TODO Check items. Exact format is Array of Gallery Images and Gallery Albums. See: https://api.imgur.com/models/custom_gallery
    private List<GalleryItem> items;

    /**
     * @return account_url - Username of the account that created the custom gallery.
     */
    public String getAccount_url() {
        return account_url;
    }

    /**
     * @param account_url Username of the account that created the custom gallery.
     */
    public void setAccount_url(String account_url) {
        this.account_url = account_url;
    }

    /**
     * @return link - The URL link to the custom gallery.
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The URL link to the custom gallery.
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return tags - An array of all the tag names in the custom gallery.
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags An array of all the tag names in the custom gallery.
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * @return item_count - The total number of gallery items in the custom gallery.
     */
    public Integer getItem_count() {
        return item_count;
    }

    /**
     * @param item_count The total number of gallery items in the custom gallery.
     */
    public void setItem_count(Integer item_count) {
        this.item_count = item_count;
    }

    /**
     * @return items - An array of all the gallery items in the custom gallery.
     */
    public List<GalleryItem> getItems() {
        return items;
    }

    /**
     * @param items An array of all the gallery items in the custom gallery.
     */
    public void setItems(List<GalleryItem> items) {
        this.items = items;
    }
}
