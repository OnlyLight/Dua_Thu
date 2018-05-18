package com.quangduyv2017.fragment;

import java.io.Serializable;

/**
 * Created by a on 6/25/2017.
 */

public class SinhVien implements Serializable{
    private String ten;
    private int namSinh;
    private String diaChi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public SinhVien(String ten, int namSinh, String diaChi) {

        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public SinhVien() {

    }
}
