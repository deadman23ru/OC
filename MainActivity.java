package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    MediaController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoViewid); // получаем объект videoView

        mController = new MediaController(this);

        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video); // указываем источник воспроизведения

        mController.setAnchorView(videoView); // привязывем медиа контроллер к videoView

        videoView.setMediaController(mController); // устанавливаем медиа контроллер

        videoView.start();
    }
}