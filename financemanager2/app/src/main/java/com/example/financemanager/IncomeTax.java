package com.example.financemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import java.util.Calendar;

public class IncomeTax extends AppCompatActivity
{
    EditText e1,e2,e3,e4;
    Button b1;
    double basic,gross,payable_tax=0,balance=0,cess,surcharge=0,monthlytax=0,inhand=0;
    int months;
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax);
        b1=(Button)findViewById(R.id.b1);
        e1=(EditText)findViewById(R.id.e11);
        e2=(EditText)findViewById(R.id.e22);
        e3=(EditText)findViewById(R.id.e33);
        e4=(EditText)findViewById(R.id.e44);
        tv1=(TextView)findViewById(R.id.tv55);
        tv2=(TextView)findViewById(R.id.tv66);
        tv3=(TextView)findViewById(R.id.tv77);

        Intent i=getIntent();
    }


    public void taxcalculation(View view)
    {
        double dc,dd;
        basic=Double.parseDouble(e1.getText().toString());
        months=Integer.parseInt(e2.getText().toString());
        dc=Double.parseDouble(e3.getText().toString());             // CANT'T BE MORE THAN 1,50,000
        dd=Double.parseDouble(e4.getText().toString());             // CAN'T BE MORE THAN 25000

        gross=basic*months;
//        gross=gross-2500;                                   // PROFFESSION TAX
        gross=gross-dc-dd;

        if(gross>40000)
        {
            gross=gross-40000;                              // STANDARD DEDUCTION;
        }
        tv1.setText("Net Taxable Salary : "+gross);
        tv1.setTextSize(20);
        tv1.setTextColor(android.graphics.Color.parseColor("Blue"));
        balance=gross;

        //CREATE INCOME TAX SLABS
//        if(gross<250000)
//        {
//            payable_tax=0;
////            balance=gross-250000;
//        }
//        if(balance<500000 && balance>250000)
//        {
//            payable_tax=12500;                              // 5% of 250000
//            balance=gross-250000;
//            balance=balance-250000;
//        }
//        if(balance<100000 && balance>500000)
//        {
//            payable_tax=payable_tax+100000;                 // 20% of 500000
//            balance=balance-500000;
//        }
//        if(balance>100000)
//        {
//            payable_tax=payable_tax + 0.3*balance;          // 30% of remaining balance
//        }

        if(gross<250000)
        {
            payable_tax=0;
        }
        else
        {
            balance=gross-250000;
            payable_tax=12500;                              // 5% of 250000
            balance=balance-250000;
            if(balance > 500000)
            {
                payable_tax=payable_tax+100000;                 // 20% of 500000
                balance=balance-500000;
                if(gross > 1000000)
                {
                    payable_tax=payable_tax + 0.3*balance;          // 30% of remaining balance
                }
            }
            else
            {
                payable_tax=payable_tax+0.2*balance;
            }
        }

        if(gross<500000)
        {
            payable_tax=0;                                  // TAX REBATE
            tv2.setText("Payable Tax = "+payable_tax+". Tax Rebate!");
            tv2.setTextSize(20);
            tv2.setTextColor(android.graphics.Color.parseColor("Red"));
            inhand=basic;
            tv3.setText("Salary in hand per month : " + inhand);
            tv3.setTextSize(20);
            tv3.setTextColor(android.graphics.Color.parseColor("Blue"));
        }
        else
        {
            cess=payable_tax*0.04;
            if(gross>10000000)
            {
                surcharge = 0.15 * payable_tax;
            }
            else if(gross>5000000)
            {
                surcharge=0.1*payable_tax;
            }
            payable_tax=payable_tax+cess+surcharge;
            tv2.setText("Payable Tax = "+payable_tax);
            tv2.setTextSize(20);
            tv2.setTextColor(android.graphics.Color.parseColor("Red"));

            monthlytax=payable_tax/months;                                          // SALARY IN HAND PER MONTH
            inhand=basic-monthlytax;
            tv3.setText("Salary in hand per month : %.2f " + inhand);
            tv3.setTextSize(20);
            tv3.setTextColor(android.graphics.Color.parseColor("Blue"));

        }


    }

    public void home(View view)
    {
        Intent i2=new Intent(this,MainActivity.class);
        startActivity(i2);
//        i2.putExtra(payable_tax);
    }

    public void calendar(View view)
    {
        Intent i3=new Intent(IncomeTax.this, Calendar.class);
        startActivity(i3);
//        i3.putExtra("Salary in hand",inhand);
    }
}
