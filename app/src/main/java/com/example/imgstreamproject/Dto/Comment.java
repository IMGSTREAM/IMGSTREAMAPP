package com.example.imgstreamproject.Dto;

import java.util.List;

/**
 * Account
 * This data model represents an images comment.
 * Example URL: https://api.imgur.com/3/comment/{id}
 * <p>
 * More info: https://api.imgur.com/models/comment
 */
public class Comment extends ImgurDataModel {

    private Integer id;
    private String image_id;
    private String comment;
    private String author;
    private Integer author_id;
    private Boolean on_album;
    private String album_cover;
    private Integer ups;
    private Integer downs;
    private Float points;
    private Integer datetime;
    private Integer parent_id;
    private Boolean deleted;
    private String vote;
    //    TODO Check children. Exact format is Array of comments. See: https://api.imgur.com/models/comment
    private List<Comment> children;


    /**
     * @return id - The ID for the comment
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The ID for the comment
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return image_id - The ID of the image that the comment is for
     */
    public String getImage_id() {
        return image_id;
    }

    /**
     * @param image_id The ID of the image that the comment is for
     */
    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    /**
     * @return comment - The comment itself.
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment The comment itself.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return author - Username of the author of the comment
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author Username of the author of the comment
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return author_id - The account ID for the author
     */
    public Integer getAuthor_id() {
        return author_id;
    }

    /**
     * @param author_id The account ID for the author
     */
    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    /**
     * @return on_album - If this comment was done to an album
     */
    public Boolean getOn_album() {
        return on_album;
    }

    /**
     * @param on_album If this comment was done to an album
     */
    public void setOn_album(Boolean on_album) {
        this.on_album = on_album;
    }

    /**
     * @return album_cover - The ID of the album cover image, this is what should be displayed for album comments
     */
    public String getAlbum_cover() {
        return album_cover;
    }

    /**
     * @param album_cover The ID of the album cover image, this is what should be displayed for album comments
     */
    public void setAlbum_cover(String album_cover) {
        this.album_cover = album_cover;
    }

    /**
     * @return ups - Number of upvotes for the comment
     */
    public Integer getUps() {
        return ups;
    }

    /**
     * @param ups Number of upvotes for the comment
     */
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    /**
     * @return downs - The number of downvotes for the comment
     */
    public Integer getDowns() {
        return downs;
    }

    /**
     * @param downs The number of downvotes for the comment
     */
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    /**
     * @return points - the number of upvotes - downvotes
     */
    public Float getPoints() {
        return points;
    }

    /**
     * @param points the number of upvotes - downvotes
     */
    public void setPoints(Float points) {
        this.points = points;
    }

    /**
     * @return datetime - Timestamp of creation, epoch time
     */
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * @param datetime Timestamp of creation, epoch time
     */
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    /**
     * @return parent_id - If this is a reply, this will be the value of the comment_id for the caption this a reply for.
     */
    public Integer getParent_id() {
        return parent_id;
    }

    /**
     * @param parent_id If this is a reply, this will be the value of the comment_id for the caption this a reply for.
     */
    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * @return deleted - Marked true if this caption has been deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted Marked true if this caption has been deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return vote - The current user's vote on the comment. null if not signed in or if the user hasn't voted on it.
     */
    public String getVote() {
        return vote;
    }

    /**
     * @param vote The current user's vote on the comment. null if not signed in or if the user hasn't voted on it.
     */
    public void setVote(String vote) {
        this.vote = vote;
    }

    /**
     * @return children - All of the replies for this comment. If there are no replies to the comment then this is an empty set.
     */
    public List<Comment> getChildren() {
        return children;
    }

    /**
     * @param children All of the replies for this comment. If there are no replies to the comment then this is an empty set.
     */
    public void setChildren(List<Comment> children) {
        this.children = children;
    }
}
