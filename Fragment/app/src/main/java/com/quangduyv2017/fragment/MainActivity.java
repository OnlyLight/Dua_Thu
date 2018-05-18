package com.quangduyv2017.fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements GetDataStudent{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getData(SinhVien sinhVien) {
        FragmentSinhVienInfo sinhVienInfo = (FragmentSinhVienInfo) getFragmentManager().findFragmentById(R.id.fragmentStudentInfo);

        Configuration configuration = getResources().getConfiguration();

        if (sinhVienInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            sinhVienInfo.setData(sinhVien);
        } else {
            Intent intent = new Intent(MainActivity.this, StudentInfomation.class);
            intent.putExtra("Thong tin sinh vien", sinhVien);
            startActivity(intent);
        }
    }
}
