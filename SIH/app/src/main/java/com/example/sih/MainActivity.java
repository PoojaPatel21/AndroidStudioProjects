package com.example.sih;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class B99 extends AppCompatActivity {
    int score=0, turn=1, rand, correctans;
    String uname;
    MediaPlayer techi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double random=10*Math.random();
        rand=(int)random;
        setqanda(turn, rand);
        Bundle extras=getIntent().getExtras();
        uname=extras.getString("Username");
        techi2= MediaPlayer.create(this,R.raw.techi2 );
        techi2.seekTo(7000);
        techi2.start();


    }

    public void setqanda(int t, int r)
    {
        CheckBox c1=(CheckBox)findViewById(R.id.checkBox1);
        CheckBox c2=(CheckBox)findViewById(R.id.checkBox2);
        CheckBox c3=(CheckBox)findViewById(R.id.checkBox3);
        CheckBox c4=(CheckBox)findViewById(R.id.checkBox4);
        TextView q=(TextView)findViewById(R.id.question);
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);
        if(r<5) {
            switch (t) {
                case 1:
                    q.setText("Which class can access all public and protected methods and fields of its super class?");
                    c1.setText("Inner class");
                    c2.setText("outer class");
                    c3.setText("sub-class");
                    c4.setText("Super class");
                    correctans = 3;
                    break;
                case 2:
                    q.setText("Method,Field can be accessed from the same class to which they belong.");
                    c1.setText("Public");
                    c2.setText("Protected");
                    c3.setText("Default");
                    c4.setText("Private");
                    correctans = 4;
                    break;
                case 3:
                    q.setText("In java, float takes _________ bytes in memory.");
                    c1.setText("8");
                    c2.setText("4");
                    c3.setText("2");
                    c4.setText("16");
                    correctans =2;
                    break;
                case 4:
                    q.setText("What will be the output of following piece of code? ? public class operatorExample { public static void main(String args[]) { int x=4; System.out.println(x++); } }");
                    c1.setText("output=0");
                    c2.setText("output=6");
                    c3.setText("output=5");
                    c4.setText("output=4");
                    correctans = 4;
                    break;
                case 5:
                    q.setText("What will be the output of Round(3.7).");
                    c1.setText("4");
                    c2.setText("3.7");
                    c3.setText("3");
                    c4.setText("0");
                    correctans = 1;
                    break;
                case 6:
                    Intent intent = new Intent(this, Result.class);
                    intent.putExtra("Score", score);
                    intent.putExtra("Fandom", "B99");
                    intent.putExtra("Username", uname);
                    techi2.stop();
                    startActivity(intent);
            }
        }

        else
        {                switch(t)
        {
            case 1: q.setText("Which tool is required on each machine to run a Java program??");
                c1.setText("JDK");
                c2.setText("SDK");
                c3.setText("JRE");
                c4.setText("CVS");
                correctans=3;
                break;
            case 2: q.setText("Which method of the Runnable interface that must be implemented by all threads?");
                c1.setText("Run()");
                c2.setText("Start()");
                c3.setText("Sleep()");
                c4.setText("Wait()");
                correctans=1;
                break;
            case 3:    q.setText("Which Keyword is used If a class has multiple constructors defined,it's possible to call a constructor from another constructor’s body?");
                c1.setText("super()");
                c2.setText("this()");
                c3.setText("constant()");
                c4.setText("None of the above");
                correctans=2;
                break;
            case 4: q.setText("Base class for all exceptions?");
                c1.setText("Java.throwable");
                c2.setText("Java.Lang.throwable");
                c3.setText("Java.Lang.Exception");
                c4.setText("Java.Lang.throwables");
                correctans=2;
                break;
            case 5: q.setText("Environment variable that stores the location of bin folder?");
                c1.setText("Path");
                c2.setText("ClassPaths");
                c3.setText("Paths");
                c4.setText("Bin");
                correctans=1;
                break;
            case 6: Intent intent=new Intent(this, Result.class);
                intent.putExtra("Score",score);
                intent.putExtra("Fandom","B((");
                intent.putExtra("Username",uname);
                techi2.stop();
                startActivity(intent);
        }

        }

    }

    public void answer1(View view) {
        if(correctans==1)
        {
            score=score+1;

        }
        turn=turn+1;
        setqanda(turn,rand);
    }

    public void answer2(View view) {
        if(correctans==2) {
            score = score + 1;

        }
        turn=turn+1;
        setqanda(turn,rand);
    }

    public void answer3(View view) {
        if(correctans==3)
        {
            score = score + 1;

        }
        turn=turn+1;
        setqanda(turn,rand);
    }

    public void answer4(View view) {
        if(correctans==4)
        {
            score = score + 1;
            /*CheckBox c4=(CheckBox)findViewById(R.id.checkBox1);
            c4.toggle();*/
        }
        turn=turn+1;
        setqanda(turn,rand);
    }
}
