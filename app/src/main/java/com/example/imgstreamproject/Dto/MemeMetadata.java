package com.example.imgstreamproject.Dto;

/**
 * MemeMetadata
 * This model is used to represent the basic meme metadata.
 * You can request meme metadata for images uploaded via our Meme Generator(https://imgur.com/memegen).
 * Example URL: https://api.imgur.com/3/g/memes/jFLlwhY
 * Note: the Meme Metadata model will be associated with a 'meme_metadata' key/tag in response.
 * <p>
 * More info: https://api.imgur.com/models/meme_metadata
 */
public class MemeMetadata extends ImgurDataModel {

    private String meme_name;
    private String top_text;
    private String bottom_text;
    private String bg_image;

    /**
     * @return meme_name - The name of the meme used.
     */
    public String getMeme_name() {
        return meme_name;
    }

    /**
     * @param meme_name The name of the meme used.
     */
    public void setMeme_name(String meme_name) {
        this.meme_name = meme_name;
    }

    /**
     * @return top_text - The top text of the meme.
     */
    public String getTop_text() {
        return top_text;
    }

    /**
     * @param top_text The top text of the meme.
     */
    public void setTop_text(String top_text) {
        this.top_text = top_text;
    }

    /**
     * @return bottom_text - The bottom text of the meme.
     */
    public String getBottom_text() {
        return bottom_text;
    }

    /**
     * @param bottom_text The bottom text of the meme.
     */
    public void setBottom_text(String bottom_text) {
        this.bottom_text = bottom_text;
    }

    /**
     * @return bg_image - The image id of the background image of the meme.
     */
    public String getBg_image() {
        return bg_image;
    }

    /**
     * @param bg_image The image id of the background image of the meme.
     */
    public void setBg_image(String bg_image) {
        this.bg_image = bg_image;
    }
}
