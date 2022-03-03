package com.example.springukesopgkundenedtrekk;

public class Kunde {
    private String fornavn;
    private String etternavn;
    private String eierBilMerke;
    private String eierBilModel;

    public Kunde(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public Kunde() {
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEierBilMerke() {
        return eierBilMerke;
    }

    public void setEierBilMerke(String eierBilMerke) {
        this.eierBilMerke = eierBilMerke;
    }

    public String getEierBilModel() {
        return eierBilModel;
    }

    public void setEierBilModel(String eierBilModel) {
        this.eierBilModel = eierBilModel;
    }
}
