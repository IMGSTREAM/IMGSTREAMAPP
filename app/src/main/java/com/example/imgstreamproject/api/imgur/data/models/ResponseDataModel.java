package com.example.imgstreamproject.api.imgur.data.models;

import java.io.Serializable;
import java.util.List;

public class ResponseDataModel implements Serializable {

    private List data;

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
