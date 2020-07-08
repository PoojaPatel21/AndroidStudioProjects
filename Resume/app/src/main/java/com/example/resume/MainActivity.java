package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static String TAG_ACTIVITY_FROM="Personal.java";
    Button b1,b2,b3,b4,b5;
    String n,p,e,a;
    String inst,yog,degree,grade;
    String comp,intdur,tech,role;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Personal.class);


                               startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Educational.class);

                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Experience.class);

                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ExtraCurricular.class);
                startActivity(intent);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getIntent().getExtras()!=null) {
                    n = getIntent().getStringExtra("name");
                    p = getIntent().getStringExtra("phone");
                    e = getIntent().getStringExtra("email");
                    a = getIntent().getStringExtra("address");
                    inst = getIntent().getStringExtra("nameinst");
                    grade = getIntent().getStringExtra("grade");
                    degree = getIntent().getStringExtra("degree");
                    yog = getIntent().getStringExtra("yop");
                    comp = getIntent().getStringExtra("company");
                    intdur = getIntent().getStringExtra("duration");
                    role = getIntent().getStringExtra("role");
                    tech = getIntent().getStringExtra("tech");
                }
                Intent intent = new Intent(getApplicationContext(),Preview.class);
                intent.putExtra("name",n);
                intent.putExtra("email",e);
                intent.putExtra("address",a);
                intent.putExtra("phone",p);
                intent.putExtra("nameinst",inst);
                intent.putExtra("grade",grade);
                intent.putExtra("degree",degree);
                intent.putExtra("yop",yog);
                intent.putExtra("company",comp);
                intent.putExtra("duration",intdur);
                intent.putExtra("role",role);
                intent.putExtra("tech",tech);
                startActivity(intent);


            }
        });
    }
}
