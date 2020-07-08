package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        final EditText text = (EditText)findViewById(R.id.editText);
        final EditText text2 = (EditText)findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dollars=Double.valueOf(text.getText().toString());
                double rupees =(Double)dollars*70;
                DecimalFormat dec=new DecimalFormat("##.##");
                text2.setText(dec.format(rupees));

            }
        });
        Button button2=(Button)findViewById(R.id.button2);
        final EditText text1 = (EditText)findViewById(R.id.editText);
        final EditText text3 = (EditText)findViewById(R.id.editText2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double rupees=Double.valueOf(text3.getText().toString());
                double dollars =(Double)rupees/70;
                DecimalFormat dec=new DecimalFormat("##.##");
                text1.setText(dec.format(dollars));

            }
        });

    }
}
