package com.example.a.buoi3android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView txtv1, txtv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addShow();
        addBien();
    }

    public void addShow() {
        txtv1 = (TextView) findViewById(R.id.txtv1);
        txtv2 = (TextView) findViewById(R.id.txtv2);
    }

    public void addBien() {
//        String a = getIntent().getExtras().getString("App 1");
//        String b = getIntent().getExtras().getString("App 2");
        Bundle n = this.getIntent().getExtras();
        String a = n.getString("add 1");
        String b = n.getString("add 2");
        txtv1.setText(a);
        txtv2.setText(b);
    }
}
