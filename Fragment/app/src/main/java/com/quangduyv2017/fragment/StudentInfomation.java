package com.quangduyv2017.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentInfomation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation);

        Intent intent = getIntent();
        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("Thong tin sinh vien");
        FragmentSinhVienInfo sinhVienInfo = (FragmentSinhVienInfo) getFragmentManager().findFragmentById(R.id.fragmentChiTiet);
        sinhVienInfo.setData(sinhVien);
    }
}
