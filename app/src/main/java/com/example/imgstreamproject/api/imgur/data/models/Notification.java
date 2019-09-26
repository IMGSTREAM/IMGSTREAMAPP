package com.example.imgstreamproject.api.imgur.data.models;

/**
 * Notification
 * The base model for a notification.
 * Example URL: https://api.imgur.com/3/account/{username}/notifications
 *
 * More info: https://api.imgur.com/models/notification
 */
public class Notification extends BaseDataModel {

    private Integer id;
    private Integer account_id;
    private Boolean viewed;
    //    TODO Check content. Exact format is Mixed. See: https://api.imgur.com/models/notification
    private BaseDataModel content;

    /**
     * @return id - The ID for the notification.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The ID for the notification.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return account_id - The Account ID for the notification.
     */
    public Integer getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id The Account ID for the notification.
     */
    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    /**
     * @return viewed - Has the user viewed the image yet?
     */
    public Boolean getViewed() {
        return viewed;
    }

    /**
     * @param viewed Has the user viewed the image yet?
     */
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return content - This can be any other model, currently only using comments and conversation metadata.
     */
    public BaseDataModel getContent() {
        return content;
    }

    /**
     * @param content This can be any other model, currently only using comments and conversation metadata.
     */
    public void setContent(BaseDataModel content) {
        this.content = content;
    }
}
