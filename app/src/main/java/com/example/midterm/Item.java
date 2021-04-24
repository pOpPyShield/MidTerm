package com.example.midterm;

public class Item {
    private String maSp;
    private String giaTien;
    private String moTa;
    public Item(String maSp, String mota, String giaTien) {
        this.maSp = maSp;
        this.giaTien = giaTien;
        this.moTa = mota;

    }

    public String getMaSp() {
        return maSp;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getGiaTien() {
        return giaTien;
    }

}
