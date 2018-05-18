package com.quangduyv2017.realtimedemo;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by a on 6/17/2017.
 */

public class HinhAnhAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<HinhAnh> list;

    public HinhAnhAdapter(Context context, int layout, ArrayList<HinhAnh> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ViewHolder {
        TextView txtvTenHinh;
        ImageView imgHinh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = view;

        ViewHolder viewHolder = new ViewHolder();

        if (rowView != null) {
            rowView = inflater.inflate(R.layout.dong_hinh_anh, null);
            viewHolder.txtvTenHinh = (TextView) view.findViewById(R.id.txtvTenHinh);
            viewHolder.imgHinh = (ImageView) view.findViewById(R.id.imgHinh);

            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        viewHolder.txtvTenHinh.setText(list.get(i).getTenHinh());
        Picasso.with(context).load(list.get(i).getLinkHinh()).into(viewHolder.imgHinh);


        return rowView;
    }
}
