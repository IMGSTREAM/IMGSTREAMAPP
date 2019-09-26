package com.example.imgstreamproject.views.customs;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class VideoScreen extends VideoView implements MediaPlayer.OnCompletionListener, View.OnTouchListener {

    private Context context;

    private Uri uri;

    private Boolean fullScreen;
    private Boolean replay;

    private Boolean playing;
    private Boolean paused;

    public VideoScreen(Context context) {
        super(context);
        this.context = context;
    }

    public VideoScreen(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public VideoScreen(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    public void load(String url) {
        setOnTouchListener(this);
        setOnCompletionListener(this);

        uri = Uri.parse(url);

        setVideoURI(uri);

        playing = false;
        replay = false;
        paused = true;
    }

    public void load(String url, Boolean replay) {
        load(url);
        this.replay = replay;
    }

    public void setLayoutParams(Integer width, Integer height) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(width, height);
        super.setLayoutParams(layoutParams);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override
    public void start() {
        if (uri != null) {
            super.start();
            playing = true;
            paused = false;
        }
    }

    @Override
    public void pause() {
        if (uri != null) {
            if (paused) {
                super.start();
                playing = true;
                paused = false;
            } else {
                super.pause();
                playing = false;
                paused = true;
            }
        }
    }

    public void stop() {
        if (uri != null) {
            seekTo(0);
            playing = false;
            paused = true;
        }
    }

    public void restart() {
        stop();
        start();
    }

    public void onProgressChangeListener() {
        Log.i("Progress: ", String.valueOf(getDuration()));
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        // TO HERE
        if (!playing && !paused) {
            restart();
        } else {
            pause();
        }
        return false;
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        playing = false;
        paused = true;
        if (replay) {
            restart();
        }
    }

    public class ProgressInitializer {
        private List<onProgressListener> listeners = new ArrayList<onProgressListener>();


    }

    public interface onProgressListener {
        int setOnProgressListener();
    }

}
