package com.example.financemanager;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class NextActivity extends AppCompatActivity
{

    DatabaseHelper myDB;
    EditText amt,descp,date;
    TextView sdate,enter_amt,enter_descp;
    Button addData, viewData, updateData;
    Integer id;
    Double inhand;
    int sum;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i=getIntent();
        String getdate=i.getStringExtra("date");
        inhand=i.getDoubleExtra("inhand",0);
        myDB = new DatabaseHelper(this);

        amt=(EditText)findViewById(R.id.e11);
        descp=(EditText)findViewById(R.id.e22);
        sdate=(TextView)findViewById(R.id.tv11);
        enter_amt=(TextView)findViewById(R.id.tv22);
        enter_descp=(TextView)findViewById(R.id.tv33);
        date=(EditText)findViewById(R.id.tv44);
        addData = (Button)findViewById(R.id.b1);
        viewData = (Button)findViewById(R.id.b2);
//        updateData = (Button)findViewById(R.id.button_update);

        date.setText(getdate);
        AddData();
        viewAllData();
//        updateAllData();
    }

    public void AddData()
    {
        addData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer amount=Integer.parseInt(amt.getText().toString());
                        sum=sum+amount;
                        boolean isInserted = myDB.insertData(id,date.getText().toString(),amount,
                                descp.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(NextActivity.this, "The data is inserted.\nTotal Expenses = "+sum, Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(NextActivity.this, "The data not inserted..", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

//    public void updateAllData(){
//        updateData.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        boolean res = myDB.updateData(id.getText().toString(),
//                                name.getText().toString(),
//                                surname.getText().toString(),
//                                marks.getText().toString());
//                        if(res == true)
//                            Toast.makeText(MainActivity.this,"Data Updated", Toast.LENGTH_LONG).show();
//                        else
//                            Toast.makeText(MainActivity.this,  "Data not updated.", Toast.LENGTH_LONG).show();
//                    }
//                }
//        );
//    }

    public void viewAllData(){
        viewData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDB.viewAll();
                        if(res.getCount() == 0){
                            // no data in database
                            showMessage("Error", "Database Empty");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext()){
                            buffer.append("ID "+res.getString(0)+"\n");
                            buffer.append("Date "+res.getString(1)+"\n");
                            buffer.append("Amount " +res.getInt(2)+"\n");
                            buffer.append("Description "+res.getString(3)+"\n");
//                            buffer.append("Marks "+res.getString(3)+"\n\n");
                        }
                        showMessage("Data", buffer.toString());
//                        Toast.makeText("Data",buffer.toString(),)
                    }
                }
        );
    }


    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public void deleteData(View view)
    {
        String deletedate=date.getText().toString();
        Integer valid= myDB.deletedata(deletedate);

        if(valid>0)
        {
            showMessage("Delete","Success!");
        }
        else
        {
            showMessage("Delete","Failure");
        }
    }
//
//    public void showMessage(String title, String message){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setCancelable(true);
//        builder.setTitle(title);
//        builder.setMessage(message);
//        builder.show();
//    }

}