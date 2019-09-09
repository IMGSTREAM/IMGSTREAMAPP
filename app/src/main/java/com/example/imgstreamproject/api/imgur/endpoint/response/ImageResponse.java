package com.example.imgstreamproject.api.imgur.endpoint.response;

import com.example.imgstreamproject.api.imgur.data.DataInterface;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.model.ImgurDataModel;
import com.example.imgstreamproject.api.imgur.data.util.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.ImageAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.request.ImageRequest;
import com.example.imgstreamproject.api.imgur.endpoint.service.ImageService;
import com.example.imgstreamproject.util.OperationTask;
import com.example.imgstreamproject.util.ToastUtil;

import java.io.IOException;

public class ImageResponse implements ImageService {

    private ImageRequest imageRequest = ImageAdapter.getImageRequest();

    public void getImage(String id, DataInterface dataInterface) {
        Image image = null;
        try {
            image = (Image) TransformUtils.transformTo(imageRequest.getImage(id).execute().body().getData(), Image.class);
        } catch (IOException e) {
        } finally {
            dataInterface.get(image);
        }
    }
}
