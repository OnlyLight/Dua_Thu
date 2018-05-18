package com.example.a.buoi3android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent i = new Intent(MainActivity.this, Main2Activity.class);
    Button btn;
    EditText edt1;
    EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addShow();
        addEven();
    }

    public void addShow(){
        btn = (Button) findViewById(R.id.btnIntent);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
    }
    public void addEven() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent();
                goiThu();
            }
        });
    }

    public void intent() {
        String name1 = edt1.getText().toString();
        i.putExtra("App 1", name1);
        i.putExtra("App 2", edt2.getText().toString());
        startActivity(i);
    }

    public void goiThu() {
        Bundle n = new Bundle();
        n.putString("add 1", edt1.getText().toString());
        n.putString("add 2", edt2.getText().toString());
        i.putExtras(n);
        startActivity(i);
    }

}
