package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Preview3 extends AppCompatActivity {

    TextView nm,em,ph,ad,snm,sper,syop,jnm,jper,jyop,cnm,cper,cyop,inm,idur,irole,det;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview3);


        nm=(TextView) findViewById(R.id.name3);

        em=(TextView) findViewById(R.id.email3);

        ph=(TextView) findViewById(R.id.phone3);

        ad=(TextView) findViewById(R.id.addr3);

        snm=(TextView) findViewById(R.id.schoolnm3
        );

        syop=(TextView) findViewById(R.id.schoolyop3);

        sper=(TextView) findViewById(R.id.schoolgrade3);

        jnm=(TextView) findViewById(R.id.jrclgnm3);

        jper=(TextView) findViewById(R.id.jrclggrade3);

        jyop=(TextView) findViewById(R.id.jrclgyop3);

        //jmaj=(TextView) findViewById(R.id.tvclmaj);

        cnm=(TextView) findViewById(R.id.clgnm3);

        //cdeg=(TextView) findViewById(R.id.tvcldeg);

        cper=(TextView) findViewById(R.id.clggrade3);

        cyop=(TextView) findViewById(R.id.clgyop3);

        inm=(TextView) findViewById(R.id.companyname3);

        idur=(TextView) findViewById(R.id.internshipdur3);

        irole=(TextView) findViewById(R.id.internshiprole3);

        det=(TextView) findViewById(R.id.Details3);

        nm.setText(getIntent().getStringExtra("name"));

        em.setText(getIntent().getStringExtra("email"));

        ph.setText(getIntent().getStringExtra("phone"));

        ad.setText(getIntent().getStringExtra("address"));

        snm.setText(getIntent().getStringExtra("namesc"));

        syop.setText(getIntent().getStringExtra("yops"));

        sper.setText(getIntent().getStringExtra("gradesc"));

        jnm.setText(getIntent().getStringExtra("namejr"));

        jyop.setText(getIntent().getStringExtra("yopjr"));

        jper.setText(getIntent().getStringExtra("gradejr"));

       // jmaj.setText(getIntent().getStringExtra("majorjr"));

        cnm.setText(getIntent().getStringExtra("namecl"));

        cyop.setText(getIntent().getStringExtra("yopcl"));

        cper.setText(getIntent().getStringExtra("gradecl"));

        //cdeg.setText(getIntent().getStringExtra("degreecl"));

        inm.setText(getIntent().getStringExtra("company"));

        idur.setText(getIntent().getStringExtra("duration"));

        irole.setText(getIntent().getStringExtra("role"));

        det.setText(getIntent().getStringExtra("details"));


    }
}
