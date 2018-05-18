package com.quangduyv2017.fragment_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a on 6/24/2017.
 */

public class SinhVienAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SinhVien> arrSinhVien;

    public SinhVienAdapter(Context context, int layout, List<SinhVien> arrSinhVien) {
        this.context = context;
        this.layout = layout;
        this.arrSinhVien = arrSinhVien;
    }

    @Override
    public int getCount() {
        return arrSinhVien.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder {
        ImageView imgStudent;
        TextView txtvHoTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.imgStudent = view.findViewById(R.id.imgStudent);
            holder.txtvHoTen = view.findViewById(R.id.txtvHoTen);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        SinhVien sv = arrSinhVien.get(i);
        holder.txtvHoTen.setText(sv.getTen());
        holder.imgStudent.setImageResource(R.drawable.student_icon);

        return view;
    }
}
