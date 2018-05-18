package com.example.a.dialog_notification_tabhost;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtvDangNhap;
    private EditText edtID, edtPass;
    private Button btnDangKy, btnDangNhap, btnThoat;
    private String ten, mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();
        controlButton();
    }

    public void addShow() {
        txtvDangNhap = (TextView) findViewById(R.id.txtvDangNhap);
        edtID = (EditText) findViewById(R.id.edtID);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnDangKy = (Button) findViewById(R.id.btnDangKy);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        btnThoat =(Button) findViewById(R.id.btnThoat);
    }

    public void controlButton() {
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Thoát khỏi hệ thống hả con chó ????");
                builder.setMessage("Thoát cái quần què.. Muốn thoát thiệt hả ??");
                builder.setCancelable(true);
                builder.setNegativeButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
                builder.setPositiveButton("Không tới", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.custom_dailog);
                final EditText edtIDCustom = (EditText) dialog.findViewById(R.id.edtIDCustom);
                final EditText edtPassCustom = (EditText) dialog.findViewById(R.id.edtPassCustom);
                Button btnDangKyCustom = (Button) dialog.findViewById(R.id.btnDangkyCustom);
                Button btnThoatCustom = (Button) dialog.findViewById(R.id.btnThoatCustom);

                btnDangKyCustom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
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

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtID.getText().toString().length() != 0 && edtPass.getText().toString().length() != 0) {
                    if (edtID.getText().toString().equals(ten) && edtPass.getText().toString().equals(mk)) {
                        final ProgressDialog progressDialog = ProgressDialog.show(MainActivity.this, "", "Loading. Please wait...", true);
                        Toast.makeText(MainActivity.this, "Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        Bundle bundle = new Bundle();
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Đăng Nhập Thất Bại", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Xin Nhập Đầy Đủ Thông Tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
