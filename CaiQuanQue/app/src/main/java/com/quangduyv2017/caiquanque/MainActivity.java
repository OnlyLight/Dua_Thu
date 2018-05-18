package com.quangduyv2017.caiquanque;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private TextView txtvHello;
//    private Spinner spnTest;
//    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();
    }

//    public void addEven() {
//        final String[] arr = {"teo", "ty"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arr);
//        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
//        spnTest.setAdapter(adapter);
//        spnTest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                txtvHello.setText(arr[position]);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//    }

    public void addShow() {
//        txtvHello = (TextView) findViewById(R.id.txtvHello);
//        spnTest = (Spinner) findViewById(R.id.spnTest);
//        btnClick = (Button) findViewById(R.id.btnClick);
    }

    public void thu() {

    }
}
