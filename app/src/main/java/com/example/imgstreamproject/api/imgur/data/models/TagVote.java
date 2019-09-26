package com.example.imgstreamproject.api.imgur.data.models;

/**
 * TagVote
 * The base model for a tag vote.
 * Example URL: https://api.imgur.com/3/gallery/image/{id}/tags
 * <p>
 * More info: https://api.imgur.com/models/tag_vote
 */
public class TagVote extends BaseDataModel {

    private Integer ups;
    private Integer downs;
    private String name;
    private String author;

    /**
     * @return ups - Number of upvotes.
     */
    public Integer getUps() {
        return ups;
    }

    /**
     * @param ups Number of upvotes.
     */
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    /**
     * @return downs - Number of downvotes.
     */
    public Integer getDowns() {
        return downs;
    }

    /**
     * @param downs Number of downvotes.
     */
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

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
     * @return author - Author of the tag.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author Author of the tag.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
