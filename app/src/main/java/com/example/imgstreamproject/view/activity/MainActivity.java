package com.example.imgstreamproject.view.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.view.BaseActivity;


public class MainActivity extends BaseActivity {

    //VIEWS
    private ConstraintLayout cLayoutMain;
    private Button btnGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //VIEWS
        initView();

        SharedPreferences layoutPreferences = getSharedPreferences("LayoutPreferences", Context.MODE_PRIVATE);
    }

    private void initView() {
        cLayoutMain = findViewById(R.id.c_layout_activity_main);
        cLayoutMain.setOnClickListener(this);

        btnGallery = findViewById(R.id.btn_gallery);
        btnGallery.setOnClickListener(v -> btnGalleryClickListener());
    }

    private void btnGalleryClickListener() {
        Log.i("btnGalleryClickListener", "Clicked");
        Intent intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
    }

}
