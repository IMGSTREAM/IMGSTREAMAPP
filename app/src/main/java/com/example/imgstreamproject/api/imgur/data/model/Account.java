package com.example.imgstreamproject.api.imgur.data.model;

/**
 * Account
 * This model is used to represent the basic account information.
 * You can request the account information about any user.
 * Example URL: https://api.imgur.com/3/account/{username}
 *
 * More info: https://api.imgur.com/models/account
 */
public class Account extends ImgurDataModel {

    private Integer id;
    private String url;
    private String bio;
    private Float reputation;
    private Integer created;
    private Boolean pro_expiration;

    /**
     * @return id - The account id for the username requested.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The account id for the username requested.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return url - The account username, will be the same as requested in the URL.
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The account username, will be the same as requested in the URL.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return bio - A basic description the user has filled out.
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio A basic description the user has filled out.
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return reputation - The reputation for the account, in it's numerical format.
     */
    public Float getReputation() {
        return reputation;
    }

    /**
     * @param reputation The reputation for the account, in it's numerical format.
     */
    public void setReputation(Float reputation) {
        this.reputation = reputation;
    }

    /**
     * @return created - The epoch time of account creation.
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * @param created The epoch time of account creation.
     */
    public void setCreated(Integer created) {
        this.created = created;
    }


    /**
     * @return pro_expiration - False if not a pro user, their expiration date if they are.
     */
    public Boolean getPro_expiration() {
        return pro_expiration;
    }


    /**
     * @param pro_expiration False if not a pro user, their expiration date if they are.
     */
    public void setPro_expiration(Boolean pro_expiration) {
        this.pro_expiration = pro_expiration;
    }
}
