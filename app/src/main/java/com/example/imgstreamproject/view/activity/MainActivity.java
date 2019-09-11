package com.example.imgstreamproject.view.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.view.BaseActivity;


public class MainActivity extends BaseActivity {

    //VIEWS
    private ConstraintLayout cLayoutMain;
    private ImageButton imgBtnInfo;
    private Button btnImgur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //VIEWS
        initView();
    }

    private void initView() {
        cLayoutMain = findViewById(R.id.activity_main_root);
        cLayoutMain.setOnClickListener(this);

        imgBtnInfo = findViewById(R.id.activity_main_btn_info);
        imgBtnInfo.setOnClickListener(this);

        btnImgur = findViewById(R.id.btn_activity_main_imgur);
        btnImgur.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.btn_activity_main_imgur:
                Log.i("onClick", "btn_activity_main_imgur");
                launchActivity(GalleryActivity.class);
                break;
            case R.id.activity_main_btn_info:
                Log.i("onClick", "img_btn_activity_main_info");
                launchActivity(InfoActivity.class);
                break;
        }
    }
}
