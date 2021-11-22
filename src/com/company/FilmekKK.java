package com.company;

public class FilmekKK {
    private final String nyilvantartasiSzam;
    private final String cim;
    private final int evSzam;
    private String mufaj;
    private int filmHossza; //Mp
    private final int koltsegvetes; //Dollar


    public FilmekKK(String nyilvantartasiSzam, String cim, int evSzam, String mufaj, int filmHossza, int koltsegvetes) {
        this.nyilvantartasiSzam = nyilvantartasiSzam;
        this.cim = cim;
        this.evSzam = evSzam;
        this.mufaj = mufaj;
        this.filmHossza = filmHossza;
        this.koltsegvetes = koltsegvetes;

    }

    public FilmekKK(String nyilvantartasiSzam, String cim, int evSzam, int filmHossza, int koltsegvetes) {
        this.nyilvantartasiSzam = nyilvantartasiSzam;
        this.cim = cim;
        this.evSzam = evSzam;
        this.filmHossza = filmHossza;
        this.koltsegvetes = koltsegvetes;
        this.mufaj = "idk";

    }

    final public String getNyilvantartasiSzam() {
        return nyilvantartasiSzam;
    }

    final public String getCim() {
        return cim;
    }


    final public int getEvSzam() {
        return evSzam;
    }

    final public String getMufaj() {

        return mufaj;
    }

    final public void setMufaj(String mufaj) {
        if (mufaj == null || mufaj.equals("")) {
            this.mufaj = "idk";
        } else {
            this.mufaj = mufaj;
        }

    }

    final public int getFilmHossza() {
        return filmHossza;
    }

    final public void setFilmHossza(int filmHossza) {
        this.filmHossza = filmHossza;
    }

    final public int getKoltsegvetes() {
        return koltsegvetes;
    }

    final int getFilmkockak() {
        return (24 * filmHossza);
    }

    final int getKategoria() {

        if (koltsegvetes < 1000) {
            return 0;
        }
        if (koltsegvetes > 1000 && koltsegvetes <= 10000) {
            return 1;
        }
        if (koltsegvetes > 10000 && koltsegvetes <= 100000) {
            return 2;
        }
        if (koltsegvetes > 100000 && koltsegvetes <= 1000000) {
            return 3;
        }
        if (koltsegvetes > 1000000 && koltsegvetes <= 10000000) {
            return 4;
        }
        if (koltsegvetes > 10000000) {
            return 5;
        }
        return 0;
    }

    public int getMufajErtekeles() {
        return 0;
    }

    public final int getErtekeles() {
        return getMufajErtekeles() + getKategoria();
    }

    @Override
    public String toString() {
        return "Nyilvántartási szám: " + nyilvantartasiSzam + '\n'
                + "Cim: " + cim + '\n'
                + "Évszám: " + evSzam + '\n'
                + "Műfaj: " + mufaj + '\n'
                + "A film hossza: " + filmHossza + " Mp" + '\n'
                + "Költségvetés: " + koltsegvetes + " $" + '\n'
                ;
    }
}
