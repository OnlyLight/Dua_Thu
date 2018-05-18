package com.example.a.gridview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gv;
    private ArrayList<MonAn> arrGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addShow();
        addEven();
    }

    public void addShow() {
        gv = (GridView) findViewById(R.id.gv);
    }

    public void addEven() {
        arrGv = new ArrayList<MonAn>();
        arrGv.add(new MonAn("Bún Riêu", 20000));
        arrGv.add(new MonAn("Bún Bò", 25000));
        arrGv.add(new MonAn("Bún Chả Cá", 30000));
        arrGv.add(new MonAn("Bún Bò Huế", 35000));
        arrGv.add(new MonAn("Bánh Xèo", 35000));
        arrGv.add(new MonAn("Bánh Canh", 35000));
        arrGv.add(new MonAn("Cơm Trộn", 35000));
        arrGv.add(new MonAn("Mì Cay", 35000));
        arrGv.add(new MonAn("Mì Quảng", 35000));
        MonAnAdapter adapter = new MonAnAdapter(MainActivity.this, R.layout.dong_mon_an, arrGv);
        gv.setAdapter(adapter);
    }
}
