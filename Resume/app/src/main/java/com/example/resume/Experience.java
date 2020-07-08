package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Experience extends AppCompatActivity {

    EditText ex1,ex2,ex3,ex4,ex5;
    Button exdone;
    public String exp1,exp2,exp3,exp4,exp5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);
        ex1=(EditText)findViewById(R.id.editText11);
        ex2=(EditText)findViewById(R.id.editText12);
        ex3=(EditText)findViewById(R.id.editText13);
        ex4=(EditText)findViewById(R.id.editText14);
        ex5=(EditText)findViewById(R.id.editText15);
        exdone=(Button)findViewById(R.id.button8);
        exp1=ex1.getText().toString();
        exp2=ex2.getText().toString();
        exp3=ex3.getText().toString();
        exp4=ex4.getText().toString();
        exp5=ex5.getText().toString();
        exdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("company",ex4.getText().toString());
                intent.putExtra("duration",ex2.getText().toString());
                intent.putExtra("role",ex3.getText().toString());
                intent.putExtra("tech",ex5.getText().toString());
                startActivity(intent);
            }
        });
    }
}
