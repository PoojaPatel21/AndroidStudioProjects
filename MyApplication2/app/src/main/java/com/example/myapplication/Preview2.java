package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Preview2 extends AppCompatActivity {
    TextView nm,em,ph,ad,snm,sper,syop,jnm,jper,jyop,cnm,cper,cyop,inm,idur,irole,det;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview2);
        nm= findViewById(R.id.tvnm1);
        em= findViewById(R.id.tvem1);
        ph= findViewById(R.id.tvph1);
        ad= findViewById(R.id.tvad1);
        snm= findViewById(R.id.tvscnm);
        syop= findViewById(R.id.tvscyop);
        sper= findViewById(R.id.tvscper);
        jnm= findViewById(R.id.tvjrnm);
        jper= findViewById(R.id.tvjrper);
        jyop= findViewById(R.id.tvjryop);

        cnm= findViewById(R.id.tvclnm);

        cper= findViewById(R.id.tvclper);
        cyop= findViewById(R.id.tvclyop);
        inm= findViewById(R.id.tvintnm);
        idur= findViewById(R.id.tvintdur);
        irole= findViewById(R.id.tvintrole);
        det= findViewById(R.id.tvdetails);
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
        cnm.setText(getIntent().getStringExtra("namecl"));
        cyop.setText(getIntent().getStringExtra("yopcl"));
        cper.setText(getIntent().getStringExtra("gradecl"));
        inm.setText(getIntent().getStringExtra("company"));
        idur.setText(getIntent().getStringExtra("duration"));
        irole.setText(getIntent().getStringExtra("role"));
        det.setText(getIntent().getStringExtra("details"));
    }
}
