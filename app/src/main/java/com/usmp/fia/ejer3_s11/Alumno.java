package com.usmp.fia.ejer3_s11;


import java.io.Serializable;

public class Alumno implements Serializable {
    private int idFoto;
    private String apePat,apeMat,nom,cur,gen;
    private double prom;

    public Alumno(int idFoto, String apePat, String apeMat, String nom, String cur, String gen, double prom) {
        this.idFoto = idFoto;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.nom = nom;
        this.cur = cur;
        this.gen = gen;
        this.prom = prom;
    }

    public Alumno() {
        super();
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
}
