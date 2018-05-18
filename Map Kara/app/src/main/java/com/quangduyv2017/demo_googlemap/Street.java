package com.quangduyv2017.demo_googlemap;

/**
 * Created by a on 5/8/2017.
 */

public class Street {
    private String ten;
    private String diaChi;
    private byte[] hinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }

    public Street(String ten, String diaChi, byte[] hinh) {

        this.ten = ten;
        this.diaChi = diaChi;
        this.hinh = hinh;
    }
}