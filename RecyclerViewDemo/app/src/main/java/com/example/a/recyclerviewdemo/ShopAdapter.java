package com.example.a.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by a on 2/15/2017.
 */

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder>{

    private Context context;
    private ArrayList<DataShop> arrShop;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setArrShop(ArrayList<DataShop> arrShop) {
        this.arrShop = arrShop;
    }

    public Context getContext() {

        return context;
    }

    public ArrayList<DataShop> getArrShop() {
        return arrShop;
    }

    public ShopAdapter(Context context, ArrayList<DataShop> arrShop) {
        this.context = context;
        this.arrShop = arrShop;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.dong_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Gán giá trị
        holder.txtvTen.setText(arrShop.get(position).getTen());
        holder.txtvGia.setText(arrShop.get(position).getGia());
    }

    @Override
    public int getItemCount() {
        // Trả về toàn bộ dữ liệu của ArrayList
        return arrShop.size();
    }

    public void RemoveItem(int position) {
        arrShop.remove(position);
        notifyItemRemoved(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Ánh xạ
        public TextView txtvTen;
        public TextView txtvGia;
        public ViewHolder(View itemView) {
            super(itemView);

            txtvTen = (TextView) itemView.findViewById(R.id.txtvTen);
            txtvGia = (TextView) itemView.findViewById(R.id.txtvGia);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    RemoveItem(getAdapterPosition());
//                }
//            });
        }
    }
}
