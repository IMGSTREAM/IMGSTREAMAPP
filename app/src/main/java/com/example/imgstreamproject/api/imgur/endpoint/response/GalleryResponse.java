package com.example.imgstreamproject.api.imgur.endpoint.response;

import com.example.imgstreamproject.api.imgur.data.DataInterface;
import com.example.imgstreamproject.api.imgur.data.model.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.model.GalleryImage;
import com.example.imgstreamproject.api.imgur.data.model.GalleryItem;
import com.example.imgstreamproject.api.imgur.data.util.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.GalleryAdapter;
import com.example.imgstreamproject.api.imgur.endpoint.request.GalleryRequest;
import com.example.imgstreamproject.api.imgur.endpoint.service.GalleryService;

import java.io.IOException;
import java.util.List;

public class GalleryResponse implements GalleryService {

    private GalleryRequest galleryRequest = GalleryAdapter.getGalleryRequest();

    public void getGallery(DataInterface dataInterface) {
        List<GalleryItem> data = null;
        try {
            data = TransformUtils.transformGalleryItemToList(galleryRequest.getGallery().execute().body().getData());
        } catch (IOException e) {
        } finally {
            dataInterface.get(data);
        }
    }


    public void getGallery(Section section, Sort sort, Integer page, Boolean showViral, DataInterface dataInterface) {
        List<GalleryItem> data = null;
        try {
            data = TransformUtils.transformGalleryItemToList(galleryRequest.getGallery(section, sort, page, showViral).execute().body().getData());
        } catch (IOException e) {
        } finally {
            dataInterface.get(data);
        }
    }


    public void getGallery(Section section, Sort sort, String window, Integer page, Boolean showViral, DataInterface dataInterface) {
        List<GalleryItem> data = null;
        try {
            data = TransformUtils.transformGalleryItemToList(galleryRequest.getGallery(section, sort, window, page, showViral).execute().body().getData());
        } catch (IOException e) {
        } finally {
            dataInterface.get(data);
        }
    }


    public void getAlbum(String id, DataInterface dataInterface) {
        GalleryAlbum data = null;
        try {
            data = (GalleryAlbum) TransformUtils.transformTo(galleryRequest.getAlbum(id).execute().body().getData(), GalleryAlbum.class);
        } catch (IOException e) {
        } finally {
            dataInterface.get(data);
        }
    }


    public void getImage(String id, DataInterface dataInterface) {
        GalleryImage data = null;
        try {
            data = (GalleryImage) TransformUtils.transformTo(galleryRequest.getImage(id).execute().body().getData(), GalleryImage.class);
        } catch (IOException e) {
        } finally {
            dataInterface.get(data);
        }
    }


    public void getAlbumVotes(String id, DataInterface dataInterface) {
//        TODO implement getAlbumVotes()
        dataInterface.get(null);
    }


    public void getImageVotes(String id, DataInterface dataInterface) {
//        TODO implement getImageVotes()
        dataInterface.get(null);
    }


    public void getVotes(String id, DataInterface dataInterface) {
//        TODO implement getVotes()
        dataInterface.get(null);
    }


    public void getAlbumComments(String id, Sort sort, DataInterface dataInterface) {
//        TODO implement getAlbumComments()
        dataInterface.get(null);
    }


    public void getImageComments(String id, Sort sort, DataInterface dataInterface) {
//        TODO implement getImageComments()
        dataInterface.get(null);
    }


    public void getComments(String id, Sort sort, DataInterface dataInterface) {
//        TODO implement getComments()
        dataInterface.get(null);
    }


    public void getAlbumComment(String id_gallery, String id_comment, DataInterface dataInterface) {
//        TODO implement getAlbumComment()
        dataInterface.get(null);
    }


    public void getImageComment(String id_gallery, String id_comment, DataInterface dataInterface) {
//        TODO implement getImageComment()
        dataInterface.get(null);
    }


    public void getComment(String id_gallery, String id_comment, DataInterface dataInterface) {
//        TODO implement getComment()
        dataInterface.get(null);
    }


    public void getAlbumCommentCount(String id, DataInterface dataInterface) {
//        TODO implement getAlbumCommentCount()
        dataInterface.get(null);
    }


    public void getImageCommentCount(String id, DataInterface dataInterface) {
//        TODO implement getImageCommentCount()
        dataInterface.get(null);
    }


    public void getCommentCount(String id, DataInterface dataInterface) {
//        TODO implement getCommentCount()
        dataInterface.get(null);
    }
}
