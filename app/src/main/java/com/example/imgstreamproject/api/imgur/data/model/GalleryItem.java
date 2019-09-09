package com.example.imgstreamproject.api.imgur.data.model;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * GalleryItem
 * Abstract class that GalleryAlbum and GalleryImage will extends.
 */
public class GalleryItem extends ImgurDataModel {

    private String id;
    private String title;
    private String description;
    private Double datetime;
    private Double views;
    private String link;
    private Double account_id;
    private String account_url;
    private Double ups;
    private Double downs;
    private Double points;
    private Double score;
    private String vote;
    private Double topic_id;
    private String topic;
    private Double comment_count;
    private Boolean is_album;
    private Boolean is_most_viral;
    private Boolean nsfw;

    public GalleryItem() {
        id = "";
        title = "";
        description = "";
        datetime = 0.0;
        views = 0.0;
        link = "";
        account_id = 0.0;
        account_url = "";
        ups = 0.0;
        downs = 0.0;
        points = 0.0;
        score = 0.0;
        vote = "";
        topic_id = 0.0;
        topic = "";
        comment_count = 0.0;
        is_album = false;
        is_most_viral = false;
        nsfw = false;
    }


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
    public Double getDatetime() {
        return datetime;
    }

    /**
     * @param datetime Time inserted into the gallery, epoch time.
     */
    public void setDatetime(Double datetime) {
        this.datetime = datetime;
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
    public Double getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id The account ID of the account that uploaded it, or null.
     */
    public void setAccount_id(Double account_id) {
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
    public Double getUps() {
        return ups;
    }

    /**
     * @param ups Upvotes for the image.
     */
    public void setUps(Double ups) {
        this.ups = ups;
    }

    /**
     * @return downs - Downvotes for the image.
     */
    public Double getDowns() {
        return downs;
    }

    /**
     * @param downs Downvotes for the image.
     */
    public void setDowns(Double downs) {
        this.downs = downs;
    }

    /**
     * @return points - Upvotes minus downvotes.
     */
    public Double getPoints() {
        return points;
    }

    /**
     * @param points Upvotes minus downvotes.
     */
    public void setPoints(Double points) {
        this.points = points;
    }

    /**
     * @return score - Imgur popularity score.
     */
    public Double getScore() {
        return score;
    }

    /**
     * @param score Imgur popularity score.
     */
    public void setScore(Double score) {
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
    public Double getTopic_id() {
        return topic_id;
    }

    /**
     * @param topic_id Topic ID of the gallery.
     */
    public void setTopic_id(Double topic_id) {
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
    public Double getComment_count() {
        return comment_count;
    }

    /**
     * @param comment_count Number of comments on the gallery.
     */
    public void setComment_count(Double comment_count) {
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
