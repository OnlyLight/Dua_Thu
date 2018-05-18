package com.quangduyv2017.mp3_custom;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private Database data;
    private ArrayList<ThanhVien> arrThanhVien;
    private EditText edtName, edtPass;
    private Button btnDangNhap, btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addShow();
        addEvent();
    }

    private void addShow() {
        edtName = (EditText) findViewById(R.id.edtName);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        btnDangKy = (Button)findViewById(R.id.btnDangKy);
    }

    private void addEvent() {
        data = new Database(Main2Activity.this, "tv.sqlite", null, 1);

        data.queryData("CREATE TABLE thanhvien (Id INTEGER PRIMARY KEY AUTOINCREMENT, TenDN VARCHAR(200), Matkhau VARCHAR(20))");

        data.queryData("INSERT INTO thanhvien VALUES(null, 'Duy', '291998')");

        getData();

        control();
    }

    private void getData() {
        Cursor dataThanhVien = data.getData("SELECT * FROM thanhvien");
        arrThanhVien.clear();
        while (dataThanhVien.moveToNext()) {
            int id = dataThanhVien.getInt(0);
            String tenTV = dataThanhVien.getString(1);
            String matKhau = dataThanhVien.getString(2);
            arrThanhVien.add(new ThanhVien(id, tenTV, matKhau));
        }
    }

    private void control() {
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenDN = edtName.getText().toString().trim();
                String mk = edtPass.getText().toString().trim();

                for (int i = 0; i < arrThanhVien.size(); i++) {
                    ThanhVien tv = arrThanhVien.get(i);
                    if (!tenDN.equals(tv.getTenTV()) || !mk.equals(tv.getMatKhau())) {
                        Toast.makeText(Main2Activity.this, "Tên đăng nhập hoặc mật khẩu sai !!", Toast.LENGTH_SHORT).show();
                    } else {
                        startActivity(new Intent(Main2Activity.this, NewsActivity.class));
                        Toast.makeText(Main2Activity.this, "Đăng nhập thành công !!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
