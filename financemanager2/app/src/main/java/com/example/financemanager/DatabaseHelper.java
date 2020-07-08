package com.example.financemanager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//import android.support.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Records.db";
    public static final String TABLE_NAME = "DAILY_LOG";
    public static final String COL1 = "ID";
    public static final String COL2 = "DATE";
    public static final String COL3 = "AMT";
    public static final String COL4 = "DESCRIPTION";
//    public static final String COL4 = "MARKS";

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " ( ID INTEGER PRIMARY KEY AUTOINCREMENT , DATE TEXT, AMT INTEGER, DESCRIPTION TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME );
        onCreate(db);
    }

    public boolean insertData(Integer id,String date,int amt,String descp){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL1,id);
        cv.put(COL2,date);
        cv.put(COL3, amt);
        cv.put(COL4, descp);
//        cv.put(COL4, marks);
        long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor viewAll()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public boolean updateData(double id, String date, Integer amt, String descp)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL1, id);
        cv.put(COL2, date);
        cv.put(COL3, amt);
        cv.put(COL4, descp);

//        db.update(TABLE_NAME,cv,"ID = ?",new String[]{id});
        return true;
    }


    public Integer deletedata(String date)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Integer i=db.delete(TABLE_NAME,"Date=?",new String[]{date});

        return i;
    }

}