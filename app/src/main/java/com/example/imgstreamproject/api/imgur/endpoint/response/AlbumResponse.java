package com.example.imgstreamproject.api.imgur.endpoint.response;

import com.example.imgstreamproject.api.imgur.data.model.Album;
import com.example.imgstreamproject.api.imgur.data.model.Image;
import com.example.imgstreamproject.api.imgur.data.util.TransformUtils;
import com.example.imgstreamproject.api.imgur.data.DataInterface;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.AlbumAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.request.AlbumRequest;
import com.example.imgstreamproject.api.imgur.endpoint.service.AlbumService;

import java.io.IOException;
import java.util.List;

public class AlbumResponse implements AlbumService {

    private AlbumRequest albumRequest = AlbumAdapter.getAlbumRequest();

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
