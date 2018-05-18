package com.quangduyv2017.fragment_test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by a on 6/24/2017.
 */

public class FragmentStudentInfo extends Fragment {
    private View view;
    private TextView txtvTen, txtvNamSinh, txtvDiaChi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info, container, false);

        addShow();
        return view;
    }

    public void setData(SinhVien sv) {
        txtvTen.setText(sv.getTen());
        txtvNamSinh.setText("Nam sinh: " + sv.getNamSinh());
        txtvDiaChi.setText("Dia chi: " + sv.getDiaChi());
    }

    private void addShow() {
        txtvTen = (TextView) view.findViewById(R.id.txtvTen);
        txtvNamSinh = view.findViewById(R.id.txtvNamSinh);
        txtvDiaChi = view.findViewById(R.id.txtvDiaChi);
    }
}
