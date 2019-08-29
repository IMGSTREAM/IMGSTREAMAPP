package com.example.imgstreamproject.api.imgur.global.parameter;

public enum Type {

    JPEG("image/jpeg"), PNG("image/png"), GIF("image/gif"), MP4("video/mp4");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}
