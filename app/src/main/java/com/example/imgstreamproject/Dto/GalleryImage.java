package com.example.imgstreamproject.Dto;

/**
 * GalleryImage
 * The data model formatted for gallery images.
 * Example URL: https://api.imgur.com/3/gallery/image/{id}
 * <p>
 * More info: https://api.imgur.com/models/gallery_image
 */
public class GalleryImage extends GalleryItem {

    private String type;
    private Boolean animated;
    private Integer width;
    private Integer height;
    private Integer size;
    private Integer bandwidth;
    private String deletedhash;
    private String gifv;
    private String mp4;
    private Integer mp4_size;
    private Boolean looping;
    private Boolean favourite;
    private String section;

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
    public Integer getWidth() {
        return width;
    }

    /**
     * @param width The width of the image in pixels.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * @return height - The height of the image in pixels.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height The height of the image in pixels.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * @return size - The size of the image in bytes.
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size The size of the image in bytes.
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * @return bandwidth - Bandwidth consumed by the image in bytes.
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * @param bandwidth Bandwidth consumed by the image in bytes.
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * @return deletedhash - OPTIONAL, the deletehash, if you're logged in as the image owner.
     */
    public String getDeletedhash() {
        return deletedhash;
    }

    /**
     * @param deletedhash OPTIONAL, the deletehash, if you're logged in as the image owner.
     */
    public void setDeletedhash(String deletedhash) {
        this.deletedhash = deletedhash;
    }

    /**
     * @return link - The direct link to the the image. (Note: if fetching an animated GIF that was over 20MB in original size, a .gif thumbnail will be returned).
     */
    @Override
    public String getLink() {
        return super.getLink();
    }

    /**
     * @param link The direct link to the the image. (Note: if fetching an animated GIF that was over 20MB in original size, a .gif thumbnail will be returned).
     */
    @Override
    public void setLink(String link) {
        super.setLink(link);
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
    public Integer getMp4_size() {
        return mp4_size;
    }

    /**
     * @param mp4_size OPTIONAL, The Content-Length of the .mp4. Only available if the image is animated and type is 'image/gif'. Note that a zero value (0) is possible if the video has not yet been generated.
     */
    public void setMp4_size(Integer mp4_size) {
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
}
