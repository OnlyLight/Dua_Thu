package com.example.a.recyclerviewdemo;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLan1;
    private ArrayList<DataShop> arrShop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addShow();
        addEven();
    }

    public void addShow() {
        rvLan1 = (RecyclerView) findViewById(R.id.rvLan1);
        rvLan1.setHasFixedSize(true);
    }

    public void addEven() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        rvLan1.setLayoutManager(layoutManager);

//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(MainActivity.this, layoutManager.getOrientation());
//        rvLan1.addItemDecoration(dividerItemDecoration);

//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rvLan1.getContext(), DividerItemDecoration.VERTICAL);
//        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.custom_divider);
//        dividerItemDecoration.setDrawable(drawable);
//        rvLan1.addItemDecoration(dividerItemDecoration);
//        rvLan1.setItemAnimator(new DefaultItemAnimator());

        arrShop = new ArrayList<>();
        arrShop.add(new DataShop("Áo Thun", "160000"));
        arrShop.add(new DataShop("Quần Đùi", "150000"));
        arrShop.add(new DataShop("Áo Sơ Mi", "300000"));
        arrShop.add(new DataShop("Áo Bomber", "350000"));
        arrShop.add(new DataShop("Quần Què", "400000"));
        arrShop.add(new DataShop("Quần Dài", "450000"));
        arrShop.add(new DataShop("Áo 3 lỗ", "500000"));
        arrShop.add(new DataShop("Áo Khoác", "550000"));
        arrShop.add(new DataShop("Áo Mưa", "560000"));


        ShopAdapter adapter = new ShopAdapter(MainActivity.this, arrShop);
        rvLan1.setAdapter(adapter);
    }
}
