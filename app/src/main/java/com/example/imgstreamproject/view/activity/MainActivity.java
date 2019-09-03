package com.example.imgstreamproject.view.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.model.GalleryItem;
import com.example.imgstreamproject.api.imgur.data.model.ImgurDataModel;
import com.example.imgstreamproject.api.imgur.data.model.ImgurResponseModel;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;
import com.example.imgstreamproject.api.imgur.endpoint.adapter.GalleryAdapter;
import com.example.imgstreamproject.util.PicassoUtil;
import com.example.imgstreamproject.util.ToastUtil;
import com.example.imgstreamproject.view.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends BaseActivity {

    //VIEWS
    private ConstraintLayout cLayoutMain;
    private ImageView ivPrueba;
    private Button btnPrueba;
    private Button btnGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //VIEWS
        cLayoutMain = findViewById(R.id.c_layout_activity_main);
        cLayoutMain.setOnClickListener(this);

        ivPrueba = findViewById(R.id.iv_prueba);

        btnPrueba = findViewById(R.id.btn_prueba);
        btnPrueba.setOnClickListener(v -> btnPruebaClickListener());

        btnGallery = findViewById(R.id.btn_gallery);
        btnGallery.setOnClickListener(v -> btnGalleryClickListener());


        SharedPreferences layoutPreferences = getSharedPreferences("LayoutPreferences", Context.MODE_PRIVATE);

    }

    private void btnPruebaClickListener() {
        Log.i("btnPruebaClickListener", "Clicked");
        pruebaLlamadaEndpoint();
    }

    private void btnGalleryClickListener() {
        Log.i("btnGalleryClickListener", "Clicked");
        Intent intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
    }

    public void pruebaLlamadaEndpoint() {
        try {
            //GalleryAdapter.getGalleryRequest().getGallery(Section.TOP, Sort.VIRAL,0, Viral.TRUE).enqueue(new Callback<ImgurResponseModel>() {
            GalleryAdapter.getGalleryRequest().getGallery(Section.top, Sort.viral, 0, true).enqueue(new Callback<ImgurResponseModel>() {
                @Override
                public void onResponse(Call<ImgurResponseModel> call, Response<ImgurResponseModel> response) {
                    if (response.isSuccessful()) {

                        GalleryItem galleryItem = (GalleryItem) ImgurDataModel.transform(response.body().getData().get(0), GalleryItem.class);

                    } else {
                        ToastUtil.toast(MainActivity.this, "federico mercurio");
                    }
                }

                @Override
                public void onFailure(Call<ImgurResponseModel> call, Throwable t) {
                    ToastUtil.toast(MainActivity.this, "madonarcurio");
                }
            });
        } catch (Exception e) {
            Log.i("madona gaga", e.toString());
        }
    }

}
