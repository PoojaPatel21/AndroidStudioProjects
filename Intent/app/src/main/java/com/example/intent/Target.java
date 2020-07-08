package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Target extends AppCompatActivity {
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        t3=(TextView) findViewById(R.id.editText);
        Bundle extras=getIntent().getExtras();
        String in1=extras.getString("key1");
        String in2=extras.getString("key2");

        t3.setText(in1+in2);

    }
}

