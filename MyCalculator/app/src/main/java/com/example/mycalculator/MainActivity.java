package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpoint,badd,bsub,bdiv,bmult,bequal,bclear;
    private TextView answer;
    double var1,var2;
    boolean add,sub,mult,div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bclear=(Button)findViewById(R.id.buttonclr);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        badd = (Button) findViewById(R.id.buttonadd);
        bsub = (Button) findViewById(R.id.buttonsub);
        bdiv = (Button) findViewById(R.id.buttondiv);
        bmult = (Button) findViewById(R.id.buttonmult);
        b0 = (Button) findViewById(R.id.button0);
        bequal = (Button) findViewById(R.id.buttonequal);
        bpoint = (Button) findViewById(R.id.buttonpoint);
        answer = (TextView) findViewById(R.id.Answer);

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(" ");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+"0");
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(answer.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             var1=Double.parseDouble(answer.getText()+" ");
             add=true;
             answer.setText(null);

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(answer.getText()+" ");
                sub=true;
                answer.setText(null);

            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(answer.getText()+" ");
                mult=true;
                answer.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(answer.getText()+" ");
                div=true;
                answer.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Double.parseDouble(answer.getText()+" ");
                if(add==true)
                {
                    answer.setText(var1+"+"+var2+"="+(var1+var2));
                    add=false;
                }
                else if(sub==true)
                {
                    answer.setText(var1+"-"+var2+"="+(var1-var2));
                    sub=false;
                }
                if(mult==true)
                {
                    answer.setText(var1+"*"+var2+"="+(var1*var2));
                    mult=false;
                }
                if(div==true)
                {
                    if(var2!=0) {
                        answer.setText(var1 + "/" + var2 + "=" + (var1 / var2));

                    }
                    else
                    {
                        answer.setText(var1 + "/" + var2 + "= 0");
                    }
                    div=false;
                }
            }
        });

    }
}
