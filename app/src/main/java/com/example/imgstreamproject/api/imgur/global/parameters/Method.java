package com.example.imgstreamproject.api.imgur.global.parameters;

/**
 * Method
 * The _method parameter enables you to change the method of the HTTP request.
 * Accepted values are: get, post, delete, and put.
 * This can be useful if your HTTP library doesn't support the DELETE method, which is required for deleting certain resources.
 * Example: https://api.imgur.com/3/account/imgur/images/12345.json?_method=delete
 * <p>
 * More info: https://api.imgur.com/globalparams#method
 */
public enum Method {

    GET("get"), POST("post"), DELETE("delete"), PUT("put");

    private String param_key;
    private String method;

    Method(String method) {
        this.param_key = "?_method=";
        this.method = method;
    }

    /**
     * @return Return the parameter key
     */
    public String getParam_key() {
        return param_key;
    }

    /**
     * @return Return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @return Return the parameter key concatenated with the method
     * Example: ?_method=delete
     */
    @Override
    public String toString() {
        return param_key + method;
    }
}
