package com.example.imgstreamproject.Dto;

/**
 * ImageResolution
 * Define the amount of details of an image.
 */
public class ImageResolution {

    private Integer width;
    private Integer height;

    public ImageResolution(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return width - Number of pixel columns.
     * How many pixels is the image of width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @return height - Number of pixel rows.
     * How many pixels is the image of height
     */
    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.valueOf(width).concat("x").concat(String.valueOf(height));
    }
}
