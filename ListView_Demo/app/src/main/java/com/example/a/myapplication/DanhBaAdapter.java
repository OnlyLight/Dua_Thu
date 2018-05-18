package com.example.a.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a on 2/10/2017.
 */

public class DanhBaAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<DanhBa> arrDanhBa;

    public DanhBaAdapter(Context context, int layout, List<DanhBa> arrDanhBa) {
        this.context = context;
        this.layout = layout;
        this.arrDanhBa = arrDanhBa;
    }

    @Override
    public int getCount() {return arrDanhBa.size();}

    @Override
    public Object getItem(int position) {return null;}

    @Override
    public long getItemId(int position) {return 0;}

    private class ViewHolder {
        TextView txtvTen, txtvSdt;
        ImageView imgHinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.txtvTen = (TextView) convertView.findViewById(R.id.txtvTen);
            holder.txtvSdt = (TextView) convertView.findViewById(R.id.txtvSdt);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imgHinh);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        DanhBa danhBa = arrDanhBa.get(position);
        holder.txtvTen.setText(danhBa.getTen());

        holder.txtvSdt.setText(danhBa.getSdt());

        holder.imgHinh.setImageResource(danhBa.getHinh());

        return convertView;
    }
}
