package com.example.financemanager;


import android.content.Intent;
import android.os.Bundle;
//import android.widget.CalendarView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    Double inhand;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CalendarView cv=(CalendarView)findViewById(R.id.CalendarView);
//        long selectedDate = cv.getDate();
        Intent i=getIntent();
        inhand=i.getDoubleExtra("inhand",0);
        Toast.makeText(this,"Inhand = "+inhand,Toast.LENGTH_LONG);
    }

    public void activity_tax(View view)
    {
        Intent i1=new Intent(this,IncomeTax.class);
        startActivity(i1);
    }

    public void calendarview(View view)
    {
        Intent i2=new Intent(this,Calendar.class);
        startActivity(i2);
        i2.putExtra("inhand",inhand);
    }
}


