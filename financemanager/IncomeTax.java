package com.example.financemanager;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class IncomeTax extends AppCompatActivity
{
    EditText e1,e2,e3,e4;
    Button b1,b3;
    double basic,gross,payable_tax=0,balance=0,cess,surcharge=0,monthlytax=0,inhand=0;
    int months;
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax);
        b1=(Button)findViewById(R.id.b1);
        b3=(Button)findViewById(R.id.b3);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        tv1=(TextView)findViewById(R.id.tv5);
        tv2=(TextView)findViewById(R.id.tv6);
        tv3=(TextView)findViewById(R.id.tv7);

        Intent i=getIntent();


//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent i3=new Intent(this, Calendar.class);
//                startActivity(i3);
//            }
//        });
    }



    public void taxcalculation(View view)
    {
        double dc,dd;
        basic=Double.parseDouble(e1.getText().toString());
        months=Integer.parseInt(e2.getText().toString());
        if(months>12)
        {
            Toast.makeText(IncomeTax.this,"Months should be less than or equal to 12. Enter months again!", Toast.LENGTH_LONG).show();
        }
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

            DecimalFormat df2 = new DecimalFormat("#.##");

            monthlytax=payable_tax/months;                                          // SALARY IN HAND PER MONTH
            inhand=basic-monthlytax;
            tv3.setText("Salary in hand per month : "  + df2.format(inhand));
            tv3.setTextSize(20);
            tv3.setTextColor(android.graphics.Color.parseColor("Blue"));

        }


    }

    public void home(View view)
    {
        Intent i2=new Intent(this,MainActivity.class);
        startActivity(i2);
        i2.putExtra("Salary in hand",inhand);
//        i2.putExtra(payable_tax);
    }

    public void calendar(View view)
    {
        Intent i3=new Intent(this, Calendar.class);
        startActivity(i3);
//        i3.putExtra("Salary in hand",inhand);
    }
}
