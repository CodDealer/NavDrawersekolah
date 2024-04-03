package com.example.navdrawerexample;

public class model {
    public model(String name, String kelas,int img) {
        this.name = name;
        this.img = img;
        this.kelas = kelas;
    }

    String name;

    public String getName() {
        return name;
    }

    String kelas;

    public String getkelas() {
        return kelas;
    }


    public int getImg() {
        return img;
    }

    int img;
}