package com.example.a.buoi2;

public class CongViec {
    private int id;
    private String tenCongViec;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public CongViec() {

    }

    public CongViec(int id, String tenCongViec) {
        this.id = id;
        this.tenCongViec = tenCongViec;
    }
}
