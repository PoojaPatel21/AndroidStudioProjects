package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;

import android.os.Bundle;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;





public class Preview extends AppCompatActivity {

    TextView nm,em,ph,ad,snm,sper,syop,jnm,jper,jyop,jmaj,cnm,cdeg,cper,cyop,inm,idur,irole,det;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preview);

        nm=(TextView) findViewById(R.id.tvnm1);

        em=(TextView) findViewById(R.id.tvem1);

        ph=(TextView) findViewById(R.id.tvph1);

        ad=(TextView) findViewById(R.id.tvad1);

        snm=(TextView) findViewById(R.id.tvscnm);

        syop=(TextView) findViewById(R.id.tvscyop);

        sper=(TextView) findViewById(R.id.tvscper);

        jnm=(TextView) findViewById(R.id.tvjrnm);

        jper=(TextView) findViewById(R.id.tvjrper);

        jyop=(TextView) findViewById(R.id.tvjryop);

        jmaj=(TextView) findViewById(R.id.tvclmaj);

        cnm=(TextView) findViewById(R.id.tvclnm);

        cdeg=(TextView) findViewById(R.id.tvcldeg);

        cper=(TextView) findViewById(R.id.tvclper);

        cyop=(TextView) findViewById(R.id.tvclyop);

        inm=(TextView) findViewById(R.id.tvintnm);

        idur=(TextView) findViewById(R.id.tvintdur);

        irole=(TextView) findViewById(R.id.tvintrole);

        det=(TextView) findViewById(R.id.tvdetails);

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

        jmaj.setText(getIntent().getStringExtra("majorjr"));

        cnm.setText(getIntent().getStringExtra("namecl"));

        cyop.setText(getIntent().getStringExtra("yopcl"));

        cper.setText(getIntent().getStringExtra("gradecl"));

        cdeg.setText(getIntent().getStringExtra("degreecl"));

        inm.setText(getIntent().getStringExtra("company"));

        idur.setText(getIntent().getStringExtra("duration"));

        irole.setText(getIntent().getStringExtra("role"));

        det.setText(getIntent().getStringExtra("details"));



    }

}

