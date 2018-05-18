package com.quangduyv2017.manager;

/**
 * Created by a on 5/5/2017.
 */

public class NhanVien {
    private int id;
    private String ten;
    private String SDT;
    private byte[] anh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }

    public NhanVien(int id, String ten, String SDT, byte[] anh) {

        this.id = id;
        this.ten = ten;
        this.SDT = SDT;
        this.anh = anh;
    }
}