package com.quangduyv2017.manager;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {
    public static final String DATABASE_NAME = "EmployeeDB.sqlite";
    private SQLiteDatabase sqLiteDatabase;
    private ListView lvNhanVien;
    private ArrayList<NhanVien> arrayList;
    private NhanVienAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sqLiteDatabase = Database.initDatabase(MainActivity.this, DATABASE_NAME);
//        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM NhanVien", null);
//        cursor.moveToLast();
//        Toast.makeText(this, cursor.getString(1), Toast.LENGTH_SHORT).show();

        addShow();
        addEven();
        readData();
    }

    public void addShow() {
        lvNhanVien = (ListView) findViewById(R.id.lvNhanVien);
    }

    public void addEven() {
        arrayList = new ArrayList<>();
        adapter = new NhanVienAdapter(MainActivity.this, arrayList);
        lvNhanVien.setAdapter(adapter);
    }

    private void readData() {
        sqLiteDatabase = Database.initDatabase(MainActivity.this, DATABASE_NAME);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM NhanVien", null);
        arrayList.clear();

        for(int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            String sdt = cursor.getString(2);
            byte[] hinh = cursor.getBlob(3);
            arrayList.add(new NhanVien(id, ten, sdt, hinh));
        }
        adapter.notifyDataSetChanged();
    }
}