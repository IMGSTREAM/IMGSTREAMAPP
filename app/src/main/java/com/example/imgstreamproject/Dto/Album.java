package com.example.imgstreamproject.Dto;

import java.util.List;

/**
 * Album
 * This model represents the data for albums
 * Example URL: https://api.imgur.com/3/album/{id}
 *
 * More info: https://api.imgur.com/models/album
 */
public class Album extends ImgurDataModel {

    private String id;
    private String title;
    private String description;
    private Integer datetime;
    private String cover;
    private Integer cover_with;
    private Integer cover_height;
    private String account_url;
    private int account_id;
    private String privacy;
    private String layout;
    private Integer views;
    private String link;
    private Boolean favourite;
    private Boolean nsfw;
    private String section;
    private Integer order;
    private String deletehash;
    private Integer images_count;
    private List<Image> images;
    private Boolean in_gallery;

    /**
     * @return id - The ID for the album
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The ID for the album
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return title - The title of the album in the gallery
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title of the album in the gallery
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return description - The description of the album in the gallery
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description of the album in the gallery
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return datetime - Time inserted into the gallery, epoch time
     */
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * @param datetime Time inserted into the gallery, epoch time
     */
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    /**
     * @return cover - The ID of the album cover image
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover The ID of the album cover image
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return cover_with - The width, in pixels, of the album cover image
     */
    public Integer getCover_with() {
        return cover_with;
    }

    /**
     * @param cover_with The width, in pixels, of the album cover image
     */
    public void setCover_with(Integer cover_with) {
        this.cover_with = cover_with;
    }

    /**
     * @return cover_height - The height, in pixels, of the album cover image
     */
    public Integer getCover_height() {
        return cover_height;
    }

    /**
     * @param cover_height The height, in pixels, of the album cover image
     */
    public void setCover_height(Integer cover_height) {
        this.cover_height = cover_height;
    }

    /**
     * @return account_url - The account username or null if it's anonymous.
     */
    public String getAccount_url() {
        return account_url;
    }

    /**
     * @param account_url The account username or null if it's anonymous.
     */
    public void setAccount_url(String account_url) {
        this.account_url = account_url;
    }

    /**
     * @return account_id - The account ID or null if it's anonymous.
     */
    public int getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id The account ID or null if it's anonymous.
     */
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    /**
     * @return privacy - The privacy level of the album, you can only view public if not logged in as album owner
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * @param privacy The privacy level of the album, you can only view public if not logged in as album owner
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
     * @return views - The number of album views
     */
    public Integer getViews() {
        return views;
    }

    /**
     * @param views The number of album views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * @return link - The URL link to the album
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The URL link to the album
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return favourite - Indicates if the current user favorited the image. Defaults to false if not signed in.
     */
    public Boolean getFavourite() {
        return favourite;
    }

    /**
     * @param favourite Indicates if the current user favorited the image. Defaults to false if not signed in.
     */
    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    /**
     * @return nsfw - Indicates if the image has been marked as nsfw or not. Defaults to null if information is not available.
     */
    public Boolean getNsfw() {
        return nsfw;
    }

    /**
     * @param nsfw Indicates if the image has been marked as nsfw or not. Defaults to null if information is not available.
     */
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    /**
     * @return section - If the image has been categorized by our backend then this will contain the section the image belongs in. (funny, cats, adviceanimals, wtf, etc)
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section If the image has been categorized by our backend then this will contain the section the image belongs in. (funny, cats, adviceanimals, wtf, etc)
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return order - Order number of the album on the user's album page (defaults to 0 if their albums haven't been reordered)
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * @param order Order number of the album on the user's album page (defaults to 0 if their albums haven't been reordered)
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * @return deletehash - OPTIONAL, the deletehash, if you're logged in as the album owner
     */
    public String getDeletehash() {
        return deletehash;
    }

    /**
     * @param deletehash OPTIONAL, the deletehash, if you're logged in as the album owner
     */
    public void setDeletehash(String deletehash) {
        this.deletehash = deletehash;
    }

    /**
     * @return images_count - The total number of images in the album
     */
    public Integer getImages_count() {
        return images_count;
    }

    /**
     * @param images_count The total number of images in the album
     */
    public void setImages_count(Integer images_count) {
        this.images_count = images_count;
    }

    /**
     * @return images - An array of all the images in the album (only available when requesting the direct album)
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

    /**
     * @return in_gallery - True if the image has been submitted to the gallery, false if otherwise.
     */
    public Boolean getIn_gallery() {
        return in_gallery;
    }

    /**
     * @param in_gallery True if the image has been submitted to the gallery, false if otherwise.
     */
    public void setIn_gallery(Boolean in_gallery) {
        this.in_gallery = in_gallery;
    }
}
