package com.example.a.myapplication;

/**
 * Created by a on 2/10/2017.
 */

public class DanhBa {
    private String ten;
    private String sdt;
    private int hinh;

    public String getTen() {return this.ten;}
    public void setTen() {this.ten = ten;}

    public String getSdt() {return this.sdt;}
    public void setSdt() {this.sdt = sdt;}

    public int getHinh() {return this.hinh;}
    public void setHinh() {this.hinh = hinh;}

    public DanhBa(String ten, String sdt, int hinh) {
        this.ten = ten;
        this.sdt = sdt;
        this.hinh = hinh;
    }

}
