package com.example.obrazzopisem;

abstract  class Obraz {
    protected int idObrazka;

    public Obraz(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
