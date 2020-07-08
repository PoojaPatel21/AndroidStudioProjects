package com.example.media1;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.song);

    }
    public void meth1(View view)
    { mp = MediaPlayer.create(this,R.raw.song);

        mp.start();
    }

    public void meth3(View view)
    {
        if (mp != null) {
            int seekForwardTime=5000;
            int currentPosition =mp.getCurrentPosition();
            if (currentPosition + seekForwardTime <= mp.getDuration()) {
                mp.seekTo(currentPosition + seekForwardTime);
            } else {
                mp.seekTo(mp.getDuration());
            }
        }
    }
    public void meth4(View view)
    {
        int seekBackwardTime=5000;
        if (mp != null) {
            int currentPosition = mp.getCurrentPosition();
            if (currentPosition - seekBackwardTime >= 0) {
                mp.seekTo(currentPosition - seekBackwardTime);
            } else {
                mp.seekTo(0);
            }
        }
    }
    public void meth2(View view)
    {
        mp.stop();
    }
}




