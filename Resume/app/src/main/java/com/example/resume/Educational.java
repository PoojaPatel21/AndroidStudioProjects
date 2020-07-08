package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.MissingFormatArgumentException;

public class Educational extends AppCompatActivity {

    EditText t01,t02,t03,t04,t05;
    public String s1,s2,s3,s4,s5;
    Button b01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational);
        t01=(EditText)findViewById(R.id.editText4);
        t02=(EditText)findViewById(R.id.editText7);
        t03=(EditText)findViewById(R.id.editText8);
        t04=(EditText)findViewById(R.id.editText9);
        t05=(EditText)findViewById(R.id.editText10);
        b01=(Button)findViewById(R.id.button7);

        s1=t01.getText().toString();
        s2=t02.getText().toString();
        s3=t03.getText().toString();
        s4=t04.getText().toString();
        s5=t05.getText().toString();
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("degree",t01.getText().toString());
                intent.putExtra("grade",t02.getText().toString());
                intent.putExtra("yop",t04.getText().toString());
                intent.putExtra("nameofinst",t03.getText().toString());
                startActivity(intent);
            }
        });
    }
}
