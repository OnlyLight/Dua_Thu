package com.quangduyv2017.caiquanque;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView txtvChao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addShow();

        String bundle = getIntent().getExtras().getString("1");

        txtvChao.setText(bundle);
    }

    public void addShow() {
        txtvChao = (TextView) findViewById(R.id.txtvChao);
    }
}
