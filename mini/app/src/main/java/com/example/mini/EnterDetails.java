package com.example.mini;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterDetails extends AppCompatActivity {

    String name,email,phone,address,sc_nm,sc_yop,sc_per,jr_nm,jr_yop,jr_per,jr_major,cl_nm,cl_yop,cl_per,cl_deg,int_nm,int_dur,role,details;
    EditText nm,em,ph,ad,snm,syop,sper,jnm,jyop,jper,jmaj,cnm,cyop,cdeg,cper,inm,idur,irole,det;
    Button layou1,layout2,layout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);
        nm= findViewById(R.id.name1);
        em= findViewById(R.id.email1);
        ph= findViewById(R.id.contact1);
        ad= findViewById(R.id.addr1);
        snm= findViewById(R.id.scname);
        syop= findViewById(R.id.scyop);
        sper= findViewById(R.id.scper);
        jnm= findViewById(R.id.jrname);
        jper= findViewById(R.id.jrper);
        jyop= findViewById(R.id.jryop);
        jmaj= findViewById(R.id.major);
        cnm= findViewById(R.id.clname);
        cdeg= findViewById(R.id.cldeg);
        cper= findViewById(R.id.clper);
        cyop= findViewById(R.id.clyop);
        inm= findViewById(R.id.intname);
        idur= findViewById(R.id.intdur);
        irole= findViewById(R.id.introle);
        det= findViewById(R.id.details);
        layou1= findViewById(R.id.create);
        layout2= findViewById(R.id.layout1);
        layou1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Preview.class);
                intent.putExtra("name",nm.getText().toString());
                intent.putExtra("email",em.getText().toString());
                intent.putExtra("address",ad.getText().toString());
                intent.putExtra("phone",ph.getText().toString());
                intent.putExtra("namesc",snm.getText().toString());
                intent.putExtra("gradesc",sper.getText().toString());
                intent.putExtra("yops",syop.getText().toString());
                intent.putExtra("namejr",jnm.getText().toString());
                intent.putExtra("gradejr",jper.getText().toString());
                intent.putExtra("majorjr",jmaj.getText().toString());
                intent.putExtra("yopjr",jyop.getText().toString());
                intent.putExtra("namecl",cnm.getText().toString());
                intent.putExtra("gradecl",cper.getText().toString());
                intent.putExtra("degreecl",cdeg.getText().toString());
                intent.putExtra("yopcl",cyop.getText().toString());
                intent.putExtra("company",inm.getText().toString());
                intent.putExtra("duration",idur.getText().toString());
                intent.putExtra("role",irole.getText().toString());
                intent.putExtra("details",det.getText().toString());
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Preview2.class);
                intent.putExtra("name",nm.getText().toString());
                intent.putExtra("email",em.getText().toString());
                intent.putExtra("address",ad.getText().toString());
                intent.putExtra("phone",ph.getText().toString());
                intent.putExtra("namesc",snm.getText().toString());
                intent.putExtra("gradesc",sper.getText().toString());
                intent.putExtra("yops",syop.getText().toString());
                intent.putExtra("namejr",jnm.getText().toString());
                intent.putExtra("gradejr",jper.getText().toString());
                intent.putExtra("yopjr",jyop.getText().toString());
                intent.putExtra("namecl",cnm.getText().toString());
                intent.putExtra("gradecl",cper.getText().toString());
                intent.putExtra("yopcl",cyop.getText().toString());
                intent.putExtra("company",inm.getText().toString());
                intent.putExtra("duration",idur.getText().toString());
                intent.putExtra("role",irole.getText().toString());
                intent.putExtra("details",det.getText().toString());
                startActivity(intent);
            }
        });




    }
}
