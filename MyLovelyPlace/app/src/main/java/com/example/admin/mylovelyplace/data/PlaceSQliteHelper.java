package com.example.admin.mylovelyplace.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.admin.mylovelyplace.data.model.DBUtitls;

/**
 * Created by admin on 7/17/2017.
 */

public class PlaceSQliteHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "PLACE";
    private static final int DB_VERSION = 1;

    private static final String CREATE_PLACE_TABLE_SQL =
            "CREATE TABLE "+ DBUtitls.PLACE_TABLE_NAME + " ("
                    + DBUtitls.COLUMN_PLACE_ID + " " + DBUtitls.TEXT_DATA_TYPE + " " + DBUtitls.PRIMARY_KEY + ","
                    + DBUtitls.COLUMN_PLACE_CATEGORY_ID + " " + DBUtitls.TEXT_DATA_TYPE + " " + DBUtitls.NOT_NULL + ","
                    + DBUtitls.COLUMN_PLACE_NAME + " " + DBUtitls.TEXT_DATA_TYPE + " " + DBUtitls.NOT_NULL + ","
                    + DBUtitls.COLUMN_PLACE_ADDRESS + " " + DBUtitls.TEXT_DATA_TYPE + " " + DBUtitls.NOT_NULL + ","
                    + DBUtitls.COLUMN_PLACE_DESCRIPTION + " " + DBUtitls.TEXT_DATA_TYPE + " " + DBUtitls.NOT_NULL + ","
                    + DBUtitls.COLUMN_PLACE_IMAGE + " " + DBUtitls.BLOB_DATA_TYPE + " " + DBUtitls.NOT_NULL + ","
                    + DBUtitls.COLUMN_PLACE_LAT + " " + DBUtitls.REAL_DATA_TYPE + " " + DBUtitls.NULL + ","
                    + DBUtitls.COLUMN_PLACE_LNG + " " + DBUtitls.REAL_DATA_TYPE + " " + DBUtitls.NULL
                    +")";

    private static final String CREATE_CATEGORY_TABLE_SQL =
            "CREATE TABLE "+ DBUtitls.CATEGORY_TABLE_NAME + " ("
                    + DBUtitls.COLUMN_CATEGORY_ID + " " + DBUtitls.TEXT_DATA_TYPE + " " + DBUtitls.PRIMARY_KEY + ","
                    + DBUtitls.COLUMN_CATEGORY_NAME + " " + DBUtitls.TEXT_DATA_TYPE + " " + DBUtitls.NOT_NULL
                    +")";

    private static final String INSERT_CATEGORY_TABLE_SQL =
            "INSERT INTO "+ DBUtitls.COLUMN_CATEGORY_NAME +" VALUES ('1', 'Restaurant'), ('2', 'Cinema'), ('3', 'Fashion'), ('4', 'ATM')";

    public PlaceSQliteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_PLACE_TABLE_SQL);
        sqLiteDatabase.execSQL(CREATE_CATEGORY_TABLE_SQL);
        sqLiteDatabase.execSQL(INSERT_CATEGORY_TABLE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
