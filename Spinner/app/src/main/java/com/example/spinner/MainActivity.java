package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Spinner col,size1,sty,ft;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        e = (EditText) findViewById((R.id.editText));
        col = (Spinner) findViewById(R.id.spinnerCol);
        size1 = (Spinner) findViewById(R.id.spinneSize);
        sty = (Spinner) findViewById(R.id.spinnerStyle);
        ft=(Spinner)findViewById(R.id.spinnerFont);
        b.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view)
            {
                String s1=(String.valueOf(ft.getSelectedItemId()));
                if(s1.equalsIgnoreCase("SANS_SERIF"))
                {
                    e.setTypeface(Typeface.SANS_SERIF,Typeface.NORMAL);
                }
                else  if(s1.equalsIgnoreCase("MONOSPACE"))
                {
                    e.setTypeface(Typeface.MONOSPACE);
                }
                else if(s1.equalsIgnoreCase("Serif"))
                {
                    e.setTypeface(Typeface.SERIF,Typeface.NORMAL);
                }
                e.setTextColor(android.graphics.Color.parseColor(String.valueOf(col.getSelectedItem())));
                e.setTextSize(Integer.parseInt(String.valueOf(size1.getSelectedItem())));
                String s=(String.valueOf(sty.getSelectedItem()));
                if(s.equalsIgnoreCase("bold"))
                {
                    e.setTypeface(Typeface.MONOSPACE,Typeface.BOLD);
                }
                else if(s.equalsIgnoreCase("Italic"))
                {
                    e.setTypeface(Typeface.MONOSPACE,Typeface.ITALIC);
                }
                else if(s.equalsIgnoreCase(("bold-italic")))
                {
                    e.setTypeface(Typeface.MONOSPACE,Typeface.BOLD_ITALIC);
                }
                else
                {
                    e.setTypeface(Typeface.MONOSPACE,Typeface.NORMAL);
                }
            }
        });
    }
}






