package com.example.financemanager;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.Toast;

public class Calendar extends AppCompatActivity
{

    private  static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Intent i=getIntent();
        Double inhand=i.getDoubleExtra("inhand",0);
        Toast.makeText(this,"Inhand = "+inhand, Toast.LENGTH_LONG);
//        Intent i1=new Intent(this,IncomeTax.class);
//        i1=getIntent();
//        Intent i2=new Intent(this,MainActivity.class);
//        i2=getIntent();
//        final double inhand=i.getDoubleExtra("inhand",0);

        mCalendarView = (CalendarView) findViewById(R.id.CalendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
        {
            @Override
            public void onSelectedDayChange(CalendarView CalendarView, int year, int month, int dayOfMonth) {
                String date = year + "/" + month + "/"+ dayOfMonth ;
                Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:" + date);
                Intent intent = new Intent(Calendar.this,NextActivity.class);
                intent.putExtra("date",date);
//                intent.putExtra("inhand",inhand);
                startActivity(intent);

            }
        });
    }



}
