package com.example.obrazzopisem;

public class ObrazZOpisem extends Obraz {
    private String opis;


    public ObrazZOpisem(String idObrazka, String opis) {
        super(idObrazka);
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
