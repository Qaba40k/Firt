package com.example.firt;

public class Salats {

    private String name;
    private int Salat;
    private String descript;

    private String rez;

    public Salats(String name,int Salat,String descript, String rez){
        this.descript = descript;
        this.name = name;
        this.Salat = Salat;
        this.rez = rez;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalat() {
        return Salat;
    }

    public void setSalat(int salat) {
        Salat = salat;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getRez() {
        return rez;
    }

    public void setRez(String rez) {
        this.rez = rez;
    }
}
