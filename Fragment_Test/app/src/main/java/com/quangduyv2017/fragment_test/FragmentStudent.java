package com.quangduyv2017.fragment_test;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by a on 6/24/2017.
 */

public class FragmentStudent extends ListFragment {
    private ThongTin thongTin;
    private ArrayList<SinhVien> arrSinhVien;
    private SinhVienAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        thongTin = (ThongTin) getActivity();
        arrSinhVien = new ArrayList<>();
        addArray();
        adapter = new SinhVienAdapter(getActivity(), R.layout.dong_sinh_vien, arrSinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        thongTin.getData(arrSinhVien.get(position));
    }

    public void addArray() {
        arrSinhVien.add(new SinhVien("Duy", 1998, "Da Nang"));
        arrSinhVien.add(new SinhVien("Duyen", 1998, "Thai Binh"));
        arrSinhVien.add(new SinhVien("Dat", 1998, "Quang Nam"));
        arrSinhVien.add(new SinhVien("Dung", 1998, "Hai Phong"));
        arrSinhVien.add(new SinhVien("Diep", 1998, "Quang Ngai"));
        arrSinhVien.add(new SinhVien("Hoa", 1998, "Quang Binh"));
        arrSinhVien.add(new SinhVien("Hao", 1998, "Quang Tri"));
    }
}
