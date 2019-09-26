package com.example.imgstreamproject.views.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.views.BaseActivity;
import com.example.imgstreamproject.views.customs.VideoScreen;

public class FullScreenActivity extends BaseActivity {

    private LinearLayout imageContainer;
    private LinearLayout videoContainer;
    private ImageView ivImage;
    private ProgressBar pbVideo;
    private VideoScreen vsVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        initView();
        vsVideo.load("https://www.demonuts.com/Demonuts/smallvideo.mp4", true);
        videoContainer.setVisibility(View.VISIBLE);

    }


    private void initView(){

        imageContainer = findViewById(R.id.activity_full_screen_image_container);
        videoContainer = findViewById(R.id.activity_full_screen_video_container);
        ivImage = findViewById(R.id.activity_full_screen_iv_image);
        pbVideo = findViewById(R.id.activity_full_screen_pb_video);
        vsVideo = findViewById(R.id.activity_full_screen_vs_video);
    }

    private void initVideo(){

    }

    private void initImage(){

    }
}
