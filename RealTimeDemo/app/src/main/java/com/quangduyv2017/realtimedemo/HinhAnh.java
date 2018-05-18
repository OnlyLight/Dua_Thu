package com.quangduyv2017.realtimedemo;

/**
 * Created by a on 6/17/2017.
 */

public class HinhAnh {
    private String tenHinh;
    private String linkHinh;

    public String getTenHinh() {

        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getLinkHinh() {
        return linkHinh;
    }

    public void setLinkHinh(String linkHinh) {
        this.linkHinh = linkHinh;
    }

    public HinhAnh() {
    }

    public HinhAnh(String tenHinh, String linkHinh) {
        this.tenHinh = tenHinh;
        this.linkHinh = linkHinh;
    }
}
