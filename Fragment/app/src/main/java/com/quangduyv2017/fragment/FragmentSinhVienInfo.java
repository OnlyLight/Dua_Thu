package com.quangduyv2017.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by a on 6/25/2017.
 */

public class FragmentSinhVienInfo extends Fragment {
    private View view;
    private TextView txtvHoTen, txtvNamSinh, txtvDiaChi;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sinh_vien_info, container, false);
        addShow();

        return view;
    }

    public void setData(SinhVien sinhVien) {
        txtvHoTen.setText(sinhVien.getTen());
        txtvNamSinh.setText(sinhVien.getNamSinh());
        txtvDiaChi.setText(sinhVien.getDiaChi());
    }

    private void addShow() {
        txtvHoTen = view.findViewById(R.id.txtvHoTen);
        txtvNamSinh = view.findViewById(R.id.txtvNamSinh);
        txtvDiaChi = view.findViewById(R.id.txtvDiaChi);
    }
}
