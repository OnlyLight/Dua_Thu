package com.example.a.buoi2bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    EditText edtName;
    TextView txtvChao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addShow();
        addEven();
    }

    public void addShow() {
        btnDisplay = (Button) findViewById(R.id.btnDisplay);
        edtName = (EditText) findViewById(R.id.edtName);
        txtvChao = (TextView) findViewById(R.id.txtvChao);
    }

    public void addEven() {
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvChao.setText(edtName.getText().toString());
            }
        });
    }
}
