package com.quangduyv2017.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by a on 5/5/2017.
 */

public class NhanVienAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<NhanVien> arrayList;

    public NhanVienAdapter(Context context, ArrayList<NhanVien> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
        View converView = inflater.inflate(R.layout.custom_nhanvien, null);

        TextView txtvID = (TextView) convertView.findViewById(R.id.txtvID);
        TextView txtvTen = (TextView) convertView.findViewById(R.id.txtvTen);
        TextView txtvSDT = (TextView) convertView.findViewById(R.id.txtvSDT);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imgHinh);
        Button btnUpdate = (Button) convertView.findViewById(R.id.btnUpdate);
        Button btnDelete = (Button) convertView.findViewById(R.id.btnDelete);

        NhanVien nv = arrayList.get(position);

        txtvID.setText(nv.getId() + "");
        txtvTen.setText(nv.getTen());
        txtvSDT.setText(nv.getSDT());

        Bitmap bitmap = BitmapFactory.decodeByteArray(nv.getAnh(), 0, nv.getAnh().length);
        imgHinh.setImageBitmap(bitmap);
        return converView;
    }
}
