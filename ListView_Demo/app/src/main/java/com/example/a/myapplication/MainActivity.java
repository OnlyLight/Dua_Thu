package com.example.a.myapplication;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvDanhBa;
    private ArrayList<DanhBa> arrDanhBa = new ArrayList<DanhBa>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();
        addEven();
    }

    public void addShow() {
        lvDanhBa = (ListView) findViewById(R.id.lvDanhBa);
    }

    public void addEven() {
        arrDanhBa.add(new DanhBa("Truong Dinh Chien", "0988933xxx", R.drawable.so1));
        arrDanhBa.add(new DanhBa("Lai The Quang", "01667222822", R.drawable.so2));
        arrDanhBa.add(new DanhBa("Le Tan Dung", "01667377222", R.drawable.so4));
        arrDanhBa.add(new DanhBa("Vo Van Ta", "01821838828", R.drawable.so5));

        DanhBaAdapter adapter = new DanhBaAdapter(MainActivity.this, R.layout.custom_list_view, arrDanhBa);
        lvDanhBa.setAdapter(adapter);
    }
}
