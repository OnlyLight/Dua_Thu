package com.quangduyv2017.sharedpreferences_demo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a on 3/13/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String Database_Name = "User.db";
    public static final String Table_Name = "User_Table";
    public static final String Colum_1 = "ID";
    public static final String Colum_2 = "PASS";

    public DatabaseHelper(Context context) {
        super(context, Table_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name + "(ID TEXT PRIMARY KEY, PASS TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean insertData(String id, String pass) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Colum_1, id);
        contentValues.put(Colum_2, pass);
        if (db.insert(Table_Name, null, contentValues) == -1)
            return false;
        else
            return true;
    }
}
