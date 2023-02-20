package com.wail.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class base_donne extends SQLiteOpenHelper {
    public base_donne(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

            db.execSQL("create table if not exists utilisateur (ID INTEGER PRIMARY KEY AUTOINCREMENT,login text,password text)");
        db.execSQL("insert  into utilisateur(login , password)  values('wail@','1111')");

        }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public String mainlogin(String login, String password)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        String[] userinfo = new String[]{login,password};
        Cursor c=db.rawQuery("select * from utilisateur where login = ? and password = ? ",userinfo);
        int count = c.getCount();
        c.moveToFirst();
        if (c!=null && count>0)
        {
            c.close();
            return "yes";
        }
        else{
            return "no";}}
}

