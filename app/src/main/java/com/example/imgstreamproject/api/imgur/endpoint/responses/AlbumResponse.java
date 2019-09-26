package com.example.imgstreamproject.api.imgur.endpoint.responses;

import com.example.imgstreamproject.api.imgur.data.models.Album;
import com.example.imgstreamproject.api.imgur.data.models.Image;
import com.example.imgstreamproject.api.imgur.data.utils.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;
import com.example.imgstreamproject.api.imgur.endpoint.clients.AlbumClient;
import com.example.imgstreamproject.api.imgur.endpoint.requests.AlbumRequest;
import com.example.imgstreamproject.api.imgur.endpoint.services.AlbumService;

import java.io.IOException;
import java.util.List;

public class AlbumResponse implements AlbumService {

    private AlbumRequest albumRequest = AlbumClient.getAlbumRequest();

    public void getAlbum(String id, DataInterface dataInterface) {
        Album album = null;
        try {
            album = (Album) TransformUtils.transformTo(albumRequest.getAlbum(id).execute().body().getData(), Album.class);
            dataInterface.get(album);
        } catch (IOException e) {
            dataInterface.get(album);
        }
    }

    public void getAlbumImages(String id, DataInterface dataInterface) {
        List<Image> albumImages = null;
        try {
            albumImages = TransformUtils.transformToList(albumRequest.getAlbumImages(id).execute().body().getData(), Image.class);
            dataInterface.get(albumImages);
        } catch (IOException e) {
            dataInterface.get(albumImages);
        }
    }

    public void getAlbumImage(String idAlbum, String idImage, DataInterface dataInterface) {
        Image image = null;
        try {
            image = (Image) TransformUtils.transformTo(albumRequest.getAlbumImage(idAlbum, idImage).execute().body().getData(), Image.class);
            dataInterface.get(image);
        } catch (IOException e) {
            dataInterface.get(image);
        }
    }
}
