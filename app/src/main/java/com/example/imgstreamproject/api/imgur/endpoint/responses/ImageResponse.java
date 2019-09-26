package com.example.imgstreamproject.api.imgur.endpoint.responses;

import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;
import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.api.imgur.data.utils.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.clients.ImageClient;
import com.example.imgstreamproject.api.imgur.endpoint.requests.ImageRequest;
import com.example.imgstreamproject.api.imgur.endpoint.services.ImageService;

import java.io.IOException;

public class ImageResponse implements ImageService {

    private ImageRequest imageRequest = ImageClient.getImageRequest();

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
