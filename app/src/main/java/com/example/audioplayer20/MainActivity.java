package com.example.audioplayer20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // создание полей
    private MediaPlayer mediaPlayer = new MediaPlayer(); // создание поля медиа-плеера
    private SeekBar seekBar; // создание поля SeekBar
    private boolean wasPlaying = false; // поле проигрывания аудио-файла
    private FloatingActionButton fabPlayPause; // поле кнопки проигрывания и постановки на паузу аудиофайла
    private TextView seekBarHint; // поле информации у SeekBar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}