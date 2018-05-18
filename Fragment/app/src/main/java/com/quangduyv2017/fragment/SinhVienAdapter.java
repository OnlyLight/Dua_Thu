package com.quangduyv2017.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a on 6/25/2017.
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
        ImageView imgHinh;
        TextView txtvTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.imgHinh = view.findViewById(R.id.imgHinh);
            holder.txtvTen = view.findViewById(R.id.txtvTen);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        SinhVien sv = arrSinhVien.get(i);
        holder.txtvTen.setText(sv.getTen());

        return view;
    }
}
