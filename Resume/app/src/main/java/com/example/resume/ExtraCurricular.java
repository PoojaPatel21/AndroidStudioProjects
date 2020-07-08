package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ExtraCurricular extends AppCompatActivity {
    public String ec1,ec2;

    Button ecdone;
    EditText ecc1,ecc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_curricular);
        ecc1=(EditText)findViewById(R.id.editText16);
        ecc2=(EditText)findViewById(R.id.editText17);
        ecdone=(Button)findViewById(R.id.button9);
        ec1=ecc1.getText().toString();
        ec2=ecc2.getText().toString();
        ecdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExtraCurricular.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
