package com.example.imgstreamproject.Dto;

import java.util.List;

/**
 * AccountSettings
 * The account settings, only accessible if you're logged in as the user.
 * Example URL: https://api.imgur.com/3/account/{username}/settings
 *
 * More info: https://api.imgur.com/models/account_settings
 */
public class AccountSettings extends ImgurDataModel {

    private String account_url;
    private String email;
    private Boolean public_images;
    private String album_privacy;
    private Boolean pro_expiration;
    private Boolean accepted_gallery_terms;
    //    TODO Check active_emails. Exact format is Array of Strings. See: https://api.imgur.com/models/account_settings
    private List<String> active_emails;
    private Boolean messaging_enabled;
    //    TODO Check blocked_users. Create Object with blocked_id and blocked_url attributes. See: https://api.imgur.com/models/account_settings
    private Object blocked_users;
    private Boolean show_mature;
    private Boolean first_party;

    /**
     * @retun account_url - The account username.
     */
    public String getAccount_url() {
        return account_url;
    }

    /**
     * @param account_url The account username.
     */
    public void setAccount_url(String account_url) {
        this.account_url = account_url;
    }

    /**
     * @retun email - The users email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The users email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @retun public_images - Automatically allow all images to be publicly accessible.
     */
    public Boolean getPublic_images() {
        return public_images;
    }

    /**
     * @param public_images Automatically allow all images to be publicly accessible.
     */
    public void setPublic_images(Boolean public_images) {
        this.public_images = public_images;
    }

    /**
     * @retun album_privacy - Set the album privacy to this privacy setting on creation.
     */
    public String getAlbum_privacy() {
        return album_privacy;
    }

    /**
     * @param album_privacy Set the album privacy to this privacy setting on creation.
     */
    public void setAlbum_privacy(String album_privacy) {
        this.album_privacy = album_privacy;
    }

    /**
     * @retun pro_expiration - False if not a pro user, their expiration date if they are.
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

    /**
     * @retun accepted_gallery_terms - True if the user has accepted the terms of uploading to the Imgur gallery.
     */
    public Boolean getAccepted_gallery_terms() {
        return accepted_gallery_terms;
    }

    /**
     * @param accepted_gallery_terms True if the user has accepted the terms of uploading to the Imgur gallery.
     */
    public void setAccepted_gallery_terms(Boolean accepted_gallery_terms) {
        this.accepted_gallery_terms = accepted_gallery_terms;
    }

    /**
     * @retun active_emails - The email addresses that have been activated to allow uploading.
     */
    public List<String> getActive_emails() {
        return active_emails;
    }

    /**
     * @param active_emails The email addresses that have been activated to allow uploading.
     */
    public void setActive_emails(List<String> active_emails) {
        this.active_emails = active_emails;
    }

    /**
     * @retun messaging_enabled - If the user is accepting incoming messages or not.
     */
    public Boolean getMessaging_enabled() {
        return messaging_enabled;
    }

    /**
     * @param messaging_enabled If the user is accepting incoming messages or not.
     */
    public void setMessaging_enabled(Boolean messaging_enabled) {
        this.messaging_enabled = messaging_enabled;
    }

    /**
     * @retun blocked_users - An array of users that have been blocked from messaging, the object is blocked_id and blocked_url.
     */
    public Object getBlocked_users() {
        return blocked_users;
    }

    /**
     * @param blocked_users An array of users that have been blocked from messaging, the object is blocked_id and blocked_url.
     */
    public void setBlocked_users(Object blocked_users) {
        this.blocked_users = blocked_users;
    }

    /**
     * @retun show_mature - True if the user has opted to have mature images displayed in gallery list endpoints.
     */
    public Boolean getShow_mature() {
        return show_mature;
    }

    /**
     * @param show_mature True if the user has opted to have mature images displayed in gallery list endpoints.
     */
    public void setShow_mature(Boolean show_mature) {
        this.show_mature = show_mature;
    }

    /**
     * @retun first_party - True unless the user created their account via a third party service such as Google Plus.
     */
    public Boolean getFirst_party() {
        return first_party;
    }

    /**
     * @param first_party True unless the user created their account via a third party service such as Google Plus.
     */
    public void setFirst_party(Boolean first_party) {
        this.first_party = first_party;
    }
}
