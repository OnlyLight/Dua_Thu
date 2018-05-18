package com.quangduyv2017.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by a on 6/25/2017.
 */

public class FragmentStudentList extends ListFragment {
    private GetDataStudent dataStudent;
    private ArrayList<SinhVien> arrSinhVien;
    private SinhVienAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        arrSinhVien = new ArrayList<>();
        addArrSV();
        adapter = new SinhVienAdapter(getActivity(), R.layout.dong_sinh_vien, arrSinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        dataStudent.getData(arrSinhVien.get(position));
    }

    private void addArrSV() {
        arrSinhVien.add(new SinhVien("Duy", 1998, "Da Nang"));
        arrSinhVien.add(new SinhVien("Duyen", 1997, "Ha Noi"));
        arrSinhVien.add(new SinhVien("Dat", 2002, "HCM"));
        arrSinhVien.add(new SinhVien("Diep", 2000, "Quang Nam"));
        arrSinhVien.add(new SinhVien("Du", 1999, "Dong Nai"));
    }
}
