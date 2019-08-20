package com.example.imgstreamproject.Dto;

import java.util.List;

/**
 * Tag
 * The base model for a tag.
 * Example URL: https://api.imgur.com/3/gallery/t/{tag_name}
 * <p>
 * More info: https://api.imgur.com/models/tag
 */
public class Tag extends ImgurDataModel {

    private String name;
    private Integer followers;
    private Integer total_items;
    private Boolean following;
    //    TODO Check items. Exact format is Array of Gallery Images and Gallery Albums. See: https://api.imgur.com/models/tag
    private List<GalleryItem> items;

    /**
     * @return name - Name of the tag.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Name of the tag.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return followers - Number of followers for the tag.
     */
    public Integer getFollowers() {
        return followers;
    }

    /**
     * @param followers Number of followers for the tag.
     */
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    /**
     * @return total_items - Total number of gallery items for the tag.
     */
    public Integer getTotal_items() {
        return total_items;
    }

    /**
     * @param total_items Total number of gallery items for the tag.
     */
    public void setTotal_items(Integer total_items) {
        this.total_items = total_items;
    }

    /**
     * @return following - OPTIONAL, boolean representing whether or not the user is following the tag in their custom gallery.
     */
    public Boolean getFollowing() {
        return following;
    }

    /**
     * @param following OPTIONAL, boolean representing whether or not the user is following the tag in their custom gallery.
     */
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    /**
     * @return items - Gallery items with current tag.
     */
    public List<GalleryItem> getItems() {
        return items;
    }

    /**
     * @param items Gallery items with current tag.
     */
    public void setItems(List<GalleryItem> items) {
        this.items = items;
    }
}
