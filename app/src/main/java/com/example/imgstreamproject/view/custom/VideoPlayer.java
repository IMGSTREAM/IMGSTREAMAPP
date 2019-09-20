package com.example.imgstreamproject.view.custom;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends VideoView {

    private Context context;

    private MediaController mediacontroller;
    private Uri uri;

    public VideoPlayer(Context context) {
        super(context);
        this.context = context;
    }

    public VideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public VideoPlayer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    public void load(String url){
        uri = Uri.parse(url);
        mediacontroller = new MediaController(context);
        mediacontroller.setAnchorView(this);
    }



}
