package com.example.imgstreamproject.views.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.views.BaseActivity;
import com.example.imgstreamproject.views.customs.VideoScreen;


public class MainActivity extends BaseActivity {

    private ConstraintLayout cLayoutMain;
    private ImageButton imgBtnInfo;
    private Button btnImgur;
    private VideoScreen vsVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        cLayoutMain = findViewById(R.id.root_activity_main);
        cLayoutMain.setOnClickListener(this);

        imgBtnInfo = findViewById(R.id.activity_main_btn_info);
        imgBtnInfo.setOnClickListener(this);

        btnImgur = findViewById(R.id.activity_main_btn_imgur);
        btnImgur.setOnClickListener(this);

        vsVideo = findViewById(R.id.activity_main_vs_video);
        vsVideo.load("https://www.demonuts.com/Demonuts/smallvideo.mp4", false);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        Log.i("MainActivity onClick", "ok");
        switch (view.getId()) {
            case R.id.activity_main_btn_imgur:
                Log.i("MainActivity onClick", "btn_activity_main_imgur");
                launchActivity(GalleryActivity.class);
                break;
            case R.id.activity_main_btn_info:
                Log.i("MainActivity onClick", "activity_main_btn_info");
                launchActivity(InfoActivity.class);
                break;
        }
    }
}
