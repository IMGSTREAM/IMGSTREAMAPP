package com.example.imgstreamproject.api.imgur.global.parameters;

/**
 * Format
 * The _format parameter enables you to force a specific return format.
 * This parameter will override the file extension of the request.
 * Accepted values are: xml and json.
 * Example: https://api.imgur.com/3/account/imgur/images/12345.xml?_format=json
 * <p>
 * More info: https://api.imgur.com/globalparams#format
 */
public enum Format {

    XML("xml"), JSON("json");

    private String param_key;
    private String format;

    Format(String format) {
        this.param_key = "?_format=";
        this.format = format;
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
    public String getFormat() {
        return format;
    }

    /**
     * @return Return the parameter key concatenated with the format
     * Example: ?_format=json
     */
    @Override
    public String toString() {
        return param_key + format;
    }
}
