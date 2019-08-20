package com.example.imgstreamproject.ApiEndpoint;

import com.example.imgstreamproject.Dto.Account;
import com.example.imgstreamproject.Dto.AccountSettings;
import com.example.imgstreamproject.Dto.Album;
import com.example.imgstreamproject.Dto.Basic;
import com.example.imgstreamproject.Dto.Comment;
import com.example.imgstreamproject.Dto.GalleryItem;
import com.example.imgstreamproject.Dto.GalleryProfile;
import com.example.imgstreamproject.Dto.Image;
import com.example.imgstreamproject.Dto.Notification;

public class AccountEndpoint {

    private String route = "https://api.imgur.com/3/account/";

    public Account accountBase(String username) {

        return null;
    }

    public GalleryItem accountGalleryFavorites(String username, String page, String sort) {

        return null;
    }

    public GalleryItem accountFavorites(String username, String page, String sort) {

        return null;
    }

    public GalleryItem accountSubmissions(String username, String page) {

        return null;
    }

    public AccountSettings accountSettings(String username) {

        return null;
    }

    public Basic changeAccountSettings(String username) {

        return null;
    }

    public GalleryProfile accountGalleryProfile(String username) {

        return null;
    }

    public Basic verifyUserEmail(String username) {

        return null;
    }

    public Basic sendVerificationEmail(String username) {

        return null;
    }

    public Album albums(String username) {

        return null;
    }

    public Album album(String username) {

        return null;
    }

    public Basic albumIds(String username) {

        return null;
    }

    public Basic albumCount(String username) {

        return null;
    }

    public Basic albumDeletion(String username) {

        return null;
    }

    public Comment comments(String username) {

        return null;
    }

    public Comment comment(String username) {

        return null;
    }

    public Basic commentIds(String username) {

        return null;
    }

    public Basic commentCount(String username) {

        return null;
    }

    public Basic commentDeletion(String username) {

        return null;
    }

    public Image images(String username) {

        return null;
    }

    public Image image(String username) {

        return null;
    }

    public Basic imageIds(String username) {

        return null;
    }

    public Basic imageCount(String username) {

        return null;
    }

    public Basic imagedeletion(String username) {

        return null;
    }

    public Notification replies(String username) {

        return null;
    }


}
