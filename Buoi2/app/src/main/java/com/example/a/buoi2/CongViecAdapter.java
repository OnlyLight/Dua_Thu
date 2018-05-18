package com.example.a.buoi2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a on 6/18/2017.
 */

public class CongViecAdapter extends BaseAdapter {
    private MainActivity context;
    private int layout;
    private List<CongViec> arrCongViec;

    public CongViecAdapter(MainActivity context, int layout, List<CongViec> arrCongViec) {
        this.context = context;
        this.layout = layout;
        this.arrCongViec = arrCongViec;
    }

    @Override
    public int getCount() {
        return arrCongViec.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView txtvTen, txtvId;
        ImageView imgDelete, imgEdit;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.txtvTen = (TextView) convertView.findViewById(R.id.txtvTen);
            holder.imgDelete =(ImageView) convertView.findViewById(R.id.imgDelete);
            holder.imgEdit =(ImageView) convertView.findViewById(R.id.imgEdit);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final CongViec congViec = arrCongViec.get(position);
        holder.txtvTen.setText(congViec.getTenCongViec());

        holder.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.dialogEdit(congViec.getId(), congViec.getTenCongViec());
            }
        });

        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.dialogDelete(congViec.getId(), congViec.getTenCongViec());
            }
        });
        return convertView;
    }
}
