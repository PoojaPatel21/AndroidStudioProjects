package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Preview extends AppCompatActivity {


    Button b;
    public TextView nm1,phone,addr,email,inst,grade,degre,yog,interndur,com1,role,tech;
    public TextView name1,phone1,addr1,email1,inst_name,grade1,degree1,y_o_g,intern_dur,company1,tech1,role1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

      b=(Button)findViewById(R.id.button10);
      nm1=(TextView)findViewById(R.id.textView4);
        email=(TextView)findViewById(R.id.textView5);
        phone=(TextView)findViewById(R.id.textView6);
        addr=(TextView)findViewById(R.id.textView7);
        inst=(TextView)findViewById(R.id.textView9);
        yog=(TextView)findViewById(R.id.textView10);
        grade=(TextView)findViewById(R.id.textView11);
        degre=(TextView)findViewById(R.id.textView12);
        com1=(TextView)findViewById(R.id.textView14);
        interndur=(TextView)findViewById(R.id.textView15);
        role=(TextView)findViewById(R.id.textView16);
        tech=(TextView)findViewById(R.id.textView17);

        name1=(TextView)findViewById(R.id.textView3);

       email1=(TextView)findViewById(R.id.textView18);
       phone1=(TextView)findViewById(R.id.textView21);
       addr1=(TextView)findViewById(R.id.textView25);
       inst_name=(TextView)findViewById(R.id.textView24);
        y_o_g=(TextView)findViewById(R.id.textView26);
        grade1=(TextView)findViewById(R.id.textView27);
        degree1=(TextView)findViewById(R.id.textView22);
        company1=(TextView)findViewById(R.id.textView23);
        intern_dur=(TextView)findViewById(R.id.textView28);
        role1=(TextView)findViewById(R.id.textView29);
        tech1=(TextView)findViewById(R.id.textView30);
        //String n=p.name;
        //name1.setText(n);
        //email1.setText(p.email.toString());
        //phone1.setText(p.phone.toString());




        name1.setText(getIntent().getStringExtra("name"));
        email1.setText(getIntent().getStringExtra("email"));
        phone1.setText(getIntent().getStringExtra("phone"));
        addr1.setText(getIntent().getStringExtra("address"));
        inst_name.setText(getIntent().getStringExtra("nameofinst"));
        y_o_g.setText(getIntent().getStringExtra("yop"));
        degree1.setText(getIntent().getStringExtra("degree"));
        grade1.setText(getIntent().getStringExtra("grade"));
        company1.setText(getIntent().getStringExtra("company"));
        intern_dur.setText(getIntent().getStringExtra("duration"));
        role1.setText(getIntent().getStringExtra("role"));
        tech1.setText(getIntent().getStringExtra("tech"));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });






    }
}
