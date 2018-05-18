package com.quangduyv2017.fragment_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ThongTin {
    private FragmentStudentInfo fragmentStudentInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getData(SinhVien sinhVien) {
        fragmentStudentInfo = (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragmentStudentInfo);
        fragmentStudentInfo.setData(sinhVien);
    }
}