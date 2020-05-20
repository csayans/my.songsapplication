package com.example.songapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    MediaPlayer piano2Music, piano3Music, piano1Music;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        piano2Music = MediaPlayer.create(this, R.raw.piano2);
        piano3Music = MediaPlayer.create(this, R.raw.piano3);
        piano1Music = MediaPlayer.create(this, R.raw.piano1);
    }
    public void playMusic (View v)
    {
        piano2Music.start();

    }

    public void pauseMusic (View v)
    {
        if (piano2Music.isPlaying())
        {
            piano2Music.pause();
        }

    }
    public void playMusic2 (View v)
    {
        piano3Music.start();

    }

    public void pauseMusic2 (View v)
    {
        if (piano3Music.isPlaying())
        {
            piano3Music.pause();
        }

    }
    public void playMusic3 (View v)
    {
        piano1Music.start();

    }

    public void pauseMusic3 (View v)
    {
        if (piano1Music.isPlaying())
        {
            piano1Music.pause();
        }

    }

}
