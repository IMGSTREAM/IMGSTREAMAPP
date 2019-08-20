package com.example.imgstreamproject.Dto;

/**
 * Thumbnails
 * There are 6 total thumbnails that an image can be resized to.
 * Each one is accessable by appending a single character suffix to the end of the image id, and before the file extension.
 * <p>
 * For example, the image located at http://i.imgur.com/12345.jpg has the Medium Thumbnail located at http://i.imgur.com/12345m.jpg
 * <p>
 * More info: https://api.imgur.com/models/image
 */
public enum Thumbnails {
    S('s', "Small Square", new ImageResolution(90, 90), false),
    B('b', "Big Square", new ImageResolution(160, 160), false),
    T('t', "Small Thumbnail", new ImageResolution(160, 160), true),
    M('m', "Medium Thumbnail", new ImageResolution(320, 320), true),
    L('l', "Large Thumbnail", new ImageResolution(640, 640), true),
    H('h', "Huge Thumbnail", new ImageResolution(1024, 1024), true);

    private char suffix;
    private String name;
    private ImageResolution size;
    private Boolean keeps_image_proportions;

    Thumbnails(char suffix, String name, ImageResolution size, Boolean keeps_image_proportions) {
        this.suffix = suffix;
        this.name = name;
        this.size = size;
        this.keeps_image_proportions = keeps_image_proportions;
    }

    /**
     * @return suffix - Indicate the thumbnail's suffix.
     */
    public char getSuffix() {
        return suffix;
    }

    /**
     * @return name - Indicate the thumbnail's name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return size - Indicate the thumbnail's size
     */
    public ImageResolution getSize() {
        return size;
    }

    /**
     * @return keeps_image_proportions - Indicate if the thumbnail keeps the image proportions.
     */
    public Boolean getKeeps_image_proportions() {
        return keeps_image_proportions;
    }
}
