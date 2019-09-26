package com.example.imgstreamproject.api.imgur.endpoint.responses;

import com.example.imgstreamproject.api.imgur.endpoint.DataInterface;
import com.example.imgstreamproject.api.imgur.data.models.GalleryAlbum;
import com.example.imgstreamproject.api.imgur.data.models.GalleryImage;
import com.example.imgstreamproject.api.imgur.data.models.GalleryItem;
import com.example.imgstreamproject.api.imgur.data.models.ResponseDataModel;
import com.example.imgstreamproject.api.imgur.endpoint.Window;
import com.example.imgstreamproject.api.imgur.data.utils.TransformUtils;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;
import com.example.imgstreamproject.api.imgur.endpoint.clients.GalleryClient;
import com.example.imgstreamproject.api.imgur.endpoint.requests.GalleryRequest;
import com.example.imgstreamproject.api.imgur.endpoint.services.GalleryService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GalleryResponseAsync implements GalleryService {

    private GalleryRequest galleryRequest = GalleryClient.getGalleryRequest();

    public void getGallery(DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    List<GalleryItem> data = TransformUtils.transformGalleryItemToList(response.body().getData());
                    dataInterface.get(data);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getGallery(Section section, Sort sort, Integer page, Boolean showViral, DataInterface dataInterface) {
        galleryRequest.getGallery(section.toLowerCase(), sort.toLowerCase(), page, showViral).enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    List<GalleryItem> data = TransformUtils.transformGalleryItemToList(response.body().getData());
                    dataInterface.get(data);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getGallery(Section section, Sort sort, Window window, Integer page, Boolean showViral, DataInterface dataInterface) {
        galleryRequest.getGallery(section.toLowerCase(), sort.toLowerCase(), window.toLowerCase(), page, showViral).enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    List<GalleryItem> data = TransformUtils.transformGalleryItemToList(response.body().getData());
                    dataInterface.get(data);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbum(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    GalleryAlbum data = (GalleryAlbum) TransformUtils.transformTo(response.body().getData(), GalleryAlbum.class);
                    dataInterface.get(data);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getImage(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
                    GalleryImage data = (GalleryImage) TransformUtils.transformTo(response.body().getData(), GalleryImage.class);
                    dataInterface.get(data);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumVotes(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getAlbumVotes()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getImageVotes(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getImageVotes()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getVotes(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getVotes()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumComments(String id, Sort sort, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getAlbumComments()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getImageComments(String id, Sort sort, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getImageComments()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getComments(String id, Sort sort, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getComments()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumComment(String id_gallery, String id_comment, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getAlbumComment()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getImageComment(String id_gallery, String id_comment, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getImageComment()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getComment(String id_gallery, String id_comment, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getComment()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getAlbumCommentCount(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getAlbumCommentCount()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getImageCommentCount(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getImageCommentCount()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }


    public void getCommentCount(String id, DataInterface dataInterface) {
        galleryRequest.getGallery().enqueue(new Callback<ResponseDataModel>() {
            @Override
            public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                if (response.isSuccessful()) {
//                  TODO implement getCommentCount()
                    dataInterface.get(null);
                } else {
                    dataInterface.get(null);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                dataInterface.get(null);
            }
        });
    }
}
