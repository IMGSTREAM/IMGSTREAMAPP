package com.example.imgstreamproject.api.imgur.data.model;

import java.io.Serializable;
import java.util.List;

public class ImgurResponseModel implements Serializable {

    private List data;

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
