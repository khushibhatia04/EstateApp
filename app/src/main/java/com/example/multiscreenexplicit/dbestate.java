package com.example.multiscreenexplicit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class dbestate extends SQLiteOpenHelper {
    public dbestate(Context context) {
        super(context, "Realestate.db",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table Register(name Text PRIMARY KEY, address Text,phone Text UNIQUE,username Text UNIQUE, password Text )");

    }
    public boolean  checklogin(String name,String pw) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c=db.rawQuery("select * from Register where username=? and password =?",new String[]{name,pw});
        if(c.getCount()>0)
        {
            return true;
        }
        return false;

    }

    public Boolean estate(String name, String address, String phone, String username, String password){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        values.put("address",address);
        values.put("phone", phone);
        values.put("username",username);
        values.put("password",password);
        Log.d("khushi",name);
        Log.d("khushi",address);
        Log.d("khushi",phone);
        Log.d("khushi",username);
        Log.d("khushi",password);
        long result=db.insert("Register",null,values);
        if(result==-1)
        {
            return false;
        }
        else{
            Log.d("khushi","insert hua");
            return  true;
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
