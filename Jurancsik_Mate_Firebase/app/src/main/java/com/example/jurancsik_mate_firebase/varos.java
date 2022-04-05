package com.example.jurancsik_mate_firebase;

public class varos {

    private long varos;
    private String nev;
    private String orszag;
    private int lakossag;

    public long getVaros() {
        return varos;
    }

    public void setVaros(long varos) {
        this.varos = varos;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getOrszag() {
        return orszag;
    }

    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }

    public int getLakossag() {
        return lakossag;
    }

    public void setLakossag(int lakossag) {
        this.lakossag = lakossag;
    }

    public varos(long varos, String nev, String orszag, int lakossag) {
        this.varos = varos;
        this.nev = nev;
        this.orszag = orszag;
        this.lakossag = lakossag;
    }
}
