package com.example.a.gridview_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a on 2/12/2017.
 */

public class MonAnAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<MonAn> arrMonAn;

    public MonAnAdapter(Context context, int layout, List<MonAn> arrMonAn) {
        this.context = context;
        this.layout = layout;
        this.arrMonAn = arrMonAn;
    }

    @Override
    public int getCount() {
        return arrMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView txtvTen = (TextView) convertView.findViewById(R.id.txtvTen);
        txtvTen.setText(arrMonAn.get(position).getTen());

        TextView txtvGia= (TextView) convertView.findViewById(R.id.txtvGia);
        txtvGia.setText(String.valueOf(arrMonAn.get(position).getGia()));

//        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imgHinh);
//        imgHinh.setImageResource(arrMonAn.get(position).getHinh());
        return convertView;
    }
}
