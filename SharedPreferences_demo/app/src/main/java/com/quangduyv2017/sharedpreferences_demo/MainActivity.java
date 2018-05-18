package com.quangduyv2017.sharedpreferences_demo;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DatabaseHelper mydb;
    private Button btnLogin, btnSignIn;
    private EditText edtID, edtPass;
    private CheckBox cbRemember;
    private String ten, mk;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addShow();
        addEven();
    }

    public void addShow() {
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        edtID =(EditText) findViewById(R.id.edtID);
        edtPass = (EditText) findViewById(R.id.edtPass);
        cbRemember = (CheckBox) findViewById(R.id.cbRemember);
    }
    public void addEven() {
        sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        edtID.setText(sharedPreferences.getString("user", edtID.getText().toString()));
        edtPass.setText(sharedPreferences.getString("password", edtPass.getText().toString()));

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.custom_dialog);

                final EditText edtIDCustom =(EditText) dialog.findViewById(R.id.edtIDCustom);
                final EditText edtPassCustom = (EditText) dialog.findViewById(R.id.edtPassCustom);
                Button btnDangKyCustom = (Button) dialog.findViewById(R.id.btnDangKyCustom);
                Button btnThoatCustom = (Button) dialog.findViewById(R.id.btnThoatCustom);

                btnDangKyCustom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mydb.insertData(edtIDCustom.getText().toString(), edtPassCustom.getText().toString());
                        ten = edtIDCustom.getText().toString();
                        mk = edtPassCustom.getText().toString();
                        edtID.setText(ten);
                        dialog.cancel();
                    }
                });
                btnThoatCustom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtID.getText().toString().length() != 0 && edtPass.getText().toString().length() != 0) {
                    if(edtID.getText().toString().equals(ten) && edtPass.getText().toString().equals(mk)) {
                        Toast.makeText(MainActivity.this, "Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
                        if(cbRemember.isChecked()) {
                            editor = sharedPreferences.edit();
                            editor.putString("user", edtID.getText().toString());
                            editor.putString("password", edtPass.getText().toString());
                            editor.commit();
                        }
                    }
                    else
                        Toast.makeText(MainActivity.this, "Đăng Nhập Thất Bại", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Đăng Nhập Thất Bại", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
