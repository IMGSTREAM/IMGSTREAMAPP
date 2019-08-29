package com.example.imgstreamproject.api.imgur.data.model;

/**
 * Vote
 * The base model for a vote.
 * Example URL: https://api.imgur.com/3/gallery/image/{id}/votes
 * <p>
 * More info: https://api.imgur.com/models/vote
 */
public class Vote extends ImgurDataModel {

    private Integer ups;
    private Integer downs;

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
}
