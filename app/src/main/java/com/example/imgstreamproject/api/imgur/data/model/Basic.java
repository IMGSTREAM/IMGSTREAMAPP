package com.example.imgstreamproject.api.imgur.data.model;

import java.io.Serializable;

/**
 * Account
 * This is the basic response for requests that do not return data. If the POST request has a Basic model it will return the id.
 * Example URL: https://api.imgur.com/3/account/{username}
 *
 * More info: https://api.imgur.com/models/account
 */
public class Basic extends ImgurDataModel {

    //    TODO Check data. Exact format is mixed. See: https://api.imgur.com/models/basic
    private Boolean data;
    private Boolean success;
    private Integer status;

    /**
     * @return data - Is null, boolean, or integer value. If it's a post then this will contain an object with the all generated values, such as an ID.
     */
    public Boolean getData() {
        return data;
    }

    /**
     * @param data Is null, boolean, or integer value. If it's a post then this will contain an object with the all generated values, such as an ID.
     */
    public void setData(Boolean data) {
        this.data = data;
    }

    /**
     * @return success - Was the request successful
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * @param success Was the request successful
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * @return status - HTTP Status Code
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status HTTP Status Code
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
