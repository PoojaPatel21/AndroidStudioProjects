package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Personal extends AppCompatActivity {

    EditText t1,t2,t3,t4,t5;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        t1=(EditText) findViewById(R.id.editText);
        t2=(EditText) findViewById(R.id.editText2);
        t3=(EditText) findViewById(R.id.editText3);
        t4=(EditText) findViewById(R.id.editText5);
        t5=(EditText) findViewById(R.id.editText6);
        done=(Button)findViewById(R.id.button6);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("name",t1.getText().toString());
                intent.putExtra("email",t2.getText().toString());
                intent.putExtra("address",t5.getText().toString());
                intent.putExtra("phone",t4.getText().toString());
                startActivity(intent);
            }
        });




    }
}
