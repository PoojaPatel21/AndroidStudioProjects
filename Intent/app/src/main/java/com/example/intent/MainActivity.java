package com.example.intent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void click1(View v)
    {
        Intent in=new Intent(this,Target.class);
        in.putExtra("key1","ABC");
        in.putExtra("key2","123");
        startActivity(in);
    }
    public void click2(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
        startActivity(i);
    }
}
