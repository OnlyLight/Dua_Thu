package com.quangduyv2017.mp3_custom;

/**
 * Created by a on 6/22/2017.
 */

public class ThanhVien {
    private int id;
    private String tenTV;
    private String matKhau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTV() {
        return tenTV;
    }

    public void setTenTV(String tenTV) {
        this.tenTV = tenTV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public ThanhVien(int id, String tenTV, String matKhau) {

        this.id = id;
        this.tenTV = tenTV;
        this.matKhau = matKhau;
    }
}
