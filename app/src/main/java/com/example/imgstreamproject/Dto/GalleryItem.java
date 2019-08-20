package com.example.imgstreamproject.Dto;

/**
 * GalleryItem
 * Abstract class that GalleryAlbum and GalleryImage will extends.
 */
public abstract class GalleryItem extends ImgurDataModel {

    private String id;
    private String title;
    private String description;
    private Integer datetime;
    private Integer views;
    private String link;
    private Integer account_id;
    private String account_url;
    private Integer ups;
    private Integer downs;
    private Integer points;
    private Integer score;
    private String vote;
    private Integer topic_id;
    private String topic;
    private int comment_count;
    private Boolean is_album;
    private Boolean is_most_viral;
    private Boolean nsfw;

    /**
     * @return id - The ID for the image
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The ID for the image
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return title - The title in the gallery.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title in the gallery.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return description - The description in the gallery.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description in the gallery.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return datetime - Time inserted into the gallery, epoch time.
     */
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * @param datetime Time inserted into the gallery, epoch time.
     */
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    /**
     * @return views - The number of image views.
     */
    public Integer getViews() {
        return views;
    }

    /**
     * @param views The number of image views.
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * @return link - The URL link to...
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The URL link to...
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return account_id - The account ID of the account that uploaded it, or null.
     */
    public Integer getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id The account ID of the account that uploaded it, or null.
     */
    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
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
     * @return ups - Upvotes for the image.
     */
    public Integer getUps() {
        return ups;
    }

    /**
     * @param ups Upvotes for the image.
     */
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    /**
     * @return downs - Downvotes for the image.
     */
    public Integer getDowns() {
        return downs;
    }

    /**
     * @param downs Downvotes for the image.
     */
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    /**
     * @return points - Upvotes minus downvotes.
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * @param points Upvotes minus downvotes.
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * @return score - Imgur popularity score.
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score Imgur popularity score.
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return vote - The current user's vote on the album. null if not signed in or if the user hasn't voted on it.
     */
    public String getVote() {
        return vote;
    }

    /**
     * @param vote The current user's vote on the album. null if not signed in or if the user hasn't voted on it.
     */
    public void setVote(String vote) {
        this.vote = vote;
    }

    /**
     * @return topic_id - Topic ID of the gallery.
     */
    public Integer getTopic_id() {
        return topic_id;
    }

    /**
     * @param topic_id Topic ID of the gallery.
     */
    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    /**
     * @return topic - Topic of the gallery.
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic Topic of the gallery.
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return comment_count - Number of comments on the gallery.
     */
    public int getComment_count() {
        return comment_count;
    }

    /**
     * @param comment_count Number of comments on the gallery.
     */
    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    /**
     * @return is_album - if it's an album or not.
     */
    public Boolean getIs_album() {
        return is_album;
    }

    /**
     * @param is_album if it's an album or not.
     */
    public void setIs_album(Boolean is_album) {
        this.is_album = is_album;
    }

    /**
     * @return is_most_viral - Indicates if is in the most viral gallery or not.
     */
    public Boolean getIs_most_viral() {
        return is_most_viral;
    }

    /**
     * @param is_most_viral Indicates if is in the most viral gallery or not.
     */
    public void setIs_most_viral(Boolean is_most_viral) {
        this.is_most_viral = is_most_viral;
    }

    /**
     * @return nsfw - Indicates if the album has been marked as nsfw or not. Defaults to null if information is not available.
     */
    public Boolean getNsfw() {
        return nsfw;
    }

    /**
     * @param nsfw Indicates if the album has been marked as nsfw or not. Defaults to null if information is not available.
     */
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }
}
