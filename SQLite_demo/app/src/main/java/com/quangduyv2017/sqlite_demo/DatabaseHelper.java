package com.quangduyv2017.sqlite_demo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a on 3/1/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String Database_Name = "Student.db";
    public static final String Table_Name = "student_table";
    public static final String Colum_1 = "ID";
    public static final String Colum_2 = "NAME";
    public static final String Colum_3 = "SURNAME";
    public static final String Colum_4 = "MARKS";

    public DatabaseHelper(Context context) {
        super(context, Database_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name + " (ID INTEGER PRIMARY KEY, NAME TEXT, SURNAME TEXT, MARKS INTEGER) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Name);
        onCreate(db);
    }

    public boolean insertData(String name, String surname, String marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Colum_2, name);
        contentValues.put(Colum_3, surname);
        contentValues.put(Colum_4, marks);
//        long result = db.insert(Table_Name, null, contentValues);
        if (db.insert(Table_Name, null, contentValues) == -1)
            return false;
        else
            return true;
    }
    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from " + Table_Name, null);
        return cursor;
    }
    public boolean updateData(String id, String name, String surname, String marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Colum_1, id);
        contentValues.put(Colum_2, name);
        contentValues.put(Colum_3, surname);
        contentValues.put(Colum_4, marks);
        db.update(Table_Name, contentValues, "ID = ?", new String[]{id});
        return true;
    }
    public Integer deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(Table_Name, "ID = ?", new String[] {id});
    }
}
