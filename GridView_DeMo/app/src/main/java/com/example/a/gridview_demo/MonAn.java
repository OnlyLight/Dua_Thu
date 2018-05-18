package com.example.a.gridview_demo;

/**
 * Created by a on 2/12/2017.
 */

public class MonAn {
    private String ten;
    private int gia;
//    private int hinh;

    public String getTen() {
        return this.ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getGia() {
        return this.gia;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }
//    public int getHinh() {
//        return this.hinh;
//    }
//    public void setHinh(int hinh) {
//        this.hinh = hinh;
//    }

    public MonAn(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
//        this.hinh = hinh;
    }
}
