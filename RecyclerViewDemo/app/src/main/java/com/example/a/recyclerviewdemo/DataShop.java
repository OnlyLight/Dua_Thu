package com.example.a.recyclerviewdemo;

/**
 * Created by a on 2/15/2017.
 */

public class DataShop {
    private String ten;
    private String gia;

    public DataShop(String ten, String gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public String getGia() {
        return gia;
    }
}
