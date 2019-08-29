package com.example.imgstreamproject.api.imgur.global.parameter;

/**
 * FakeStatus
 * The _fake_status parameter enables you to fake the HTTP status codes that the API returns.
 * Accepted values are: 200, 400, 401 403, 404, 500, This can be extremely useful for testing error handling code, or forcing errors to return an OK status.
 * Example: https://api.imgur.com/3/account/imgur/images/12345.json?_fake_status=500
 * <p>
 * More info: https://api.imgur.com/globalparams#fake_status
 */
public enum FakeStatus {

    FS200("200"), FS400("400"), FS401("401"), FS403("403"), FS404("404"), FS500("500");

    private String param_key;
    private String fakeStatus;

    FakeStatus(String fakeStatus) {
        this.param_key = "?_fake_status=";
        this.fakeStatus = fakeStatus;
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
    public String getFakeStatus() {
        return fakeStatus;
    }

    /**
     * @return Return the parameter key concatenated with the fake status
     * Example: ?_fake_status=500
     */
    @Override
    public String toString() {
        return param_key + fakeStatus;
    }
}
