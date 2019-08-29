package com.example.imgstreamproject.api.imgur.data.model;

/**
 * Image
 * The base model for an image.
 * Example URL: https://api.imgur.com/3/image/{id}
 * <p>
 * More info: https://api.imgur.com/models/image
 */
public class Image extends ImgurDataModel {

    private String id;
    private String title;
    private String description;
    private Double datetime;
    private String type;
    private Boolean animated;
    private Double width;
    private Double height;
    private Double size;
    private Double views;
    private Double bandwidth;
    private String deletehash;
    private String name;
    private String section;
    private String link;
    private String gifv;
    private String mp4;
    private Double mp4_size;
    private Boolean looping;
    private Boolean favorite;
    private Boolean nsfw;
    private String vote;
    private Boolean in_gallery;

    /**
     * @return id - The ID for the image.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The ID for the image.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return title - The title of the image.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title of the image.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return description - Description of the image.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description Description of the image.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return datetime - Time uploaded, epoch time.
     */
    public Double getDatetime() {
        return datetime;
    }

    /**
     * @param datetime Time uploaded, epoch time.
     */
    public void setDatetime(Double datetime) {
        this.datetime = datetime;
    }

    /**
     * @return type - Image MIME type.
     */
    public String getType() {
        return type;
    }

    /**
     * @param type Image MIME type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return animated - is the image animated.
     */
    public Boolean getAnimated() {
        return animated;
    }

    /**
     * @param animated is the image animated.
     */
    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    /**
     * @return width - The width of the image in pixels.
     */
    public Double getWidth() {
        return width;
    }

    /**
     * @param width The width of the image in pixels.
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * @return height - The height of the image in pixels.
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height The height of the image in pixels.
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return size - The size of the image in bytes.
     */
    public Double getSize() {
        return size;
    }

    /**
     * @param size The size of the image in bytes.
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * @return views - The number of image views.
     */
    public Double getViews() {
        return views;
    }

    /**
     * @param views The number of image views.
     */
    public void setViews(Double views) {
        this.views = views;
    }

    /**
     * @return bandwidth - Bandwidth consumed by the image in bytes.
     */
    public Double getBandwidth() {
        return bandwidth;
    }

    /**
     * @param bandwidth Bandwidth consumed by the image in bytes.
     */
    public void setBandwidth(Double bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * @return deletehash - OPTIONAL, the deletehash, if you're logged in as the image owner.
     */
    public String getDeletehash() {
        return deletehash;
    }

    /**
     * @param deletehash OPTIONAL, the deletehash, if you're logged in as the image owner.
     */
    public void setDeletehash(String deletehash) {
        this.deletehash = deletehash;
    }

    /**
     * @return name - OPTIONAL, the original filename, if you're logged in as the image owner.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name OPTIONAL, the original filename, if you're logged in as the image owner.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return section - If the image has been categorized by our backend then this will contain the section the image belongs in. (funny, cats, adviceanimals, wtf, etc).
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section If the image has been categorized by our backend then this will contain the section the image belongs in. (funny, cats, adviceanimals, wtf, etc).
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return link - The direct link to the the image. (Note: if fetching an animated GIF that was over 20MB in original size, a .gif thumbnail will be returned).
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The direct link to the the image. (Note: if fetching an animated GIF that was over 20MB in original size, a .gif thumbnail will be returned).
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return gifv - OPTIONAL, The .gifv link. Only available if the image is animated and type is 'image/gif'.
     */
    public String getGifv() {
        return gifv;
    }

    /**
     * @param gifv OPTIONAL, The .gifv link. Only available if the image is animated and type is 'image/gif'.
     */
    public void setGifv(String gifv) {
        this.gifv = gifv;
    }

    /**
     * @return mp4 - OPTIONAL, The direct link to the .mp4. Only available if the image is animated and type is 'image/gif'.
     */
    public String getMp4() {
        return mp4;
    }

    /**
     * @param mp4 OPTIONAL, The direct link to the .mp4. Only available if the image is animated and type is 'image/gif'.
     */
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    /**
     * @return mp4_size - OPTIONAL, The Content-Length of the .mp4. Only available if the image is animated and type is 'image/gif'. Note that a zero value (0) is possible if the video has not yet been generated.
     */
    public Double getMp4_size() {
        return mp4_size;
    }

    /**
     * @param mp4_size OPTIONAL, The Content-Length of the .mp4. Only available if the image is animated and type is 'image/gif'. Note that a zero value (0) is possible if the video has not yet been generated.
     */
    public void setMp4_size(Double mp4_size) {
        this.mp4_size = mp4_size;
    }

    /**
     * @return looping - OPTIONAL, Whether the image has a looping animation. Only available if the image is animated and type is 'image/gif'.
     */
    public Boolean getLooping() {
        return looping;
    }

    /**
     * @param looping OPTIONAL, Whether the image has a looping animation. Only available if the image is animated and type is 'image/gif'.
     */
    public void setLooping(Boolean looping) {
        this.looping = looping;
    }

    /**
     * @return favorite - Indicates if the current user favorited the image. Defaults to false if not signed in.
     */
    public Boolean getFavorite() {
        return favorite;
    }

    /**
     * @param favorite Indicates if the current user favorited the image. Defaults to false if not signed in.
     */
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
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
     * @return vote - The current user's vote on the album. null if not signed in, if the user hasn't voted on it, or if not submitted to the gallery.
     */
    public String getVote() {
        return vote;
    }

    /**
     * @param vote The current user's vote on the album. null if not signed in, if the user hasn't voted on it, or if not submitted to the gallery.
     */
    public void setVote(String vote) {
        this.vote = vote;
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
