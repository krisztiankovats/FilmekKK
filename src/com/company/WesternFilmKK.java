package com.company;

public final class WesternFilmKK extends FilmekKK {

    private boolean voltakBenneIndianok;

    public WesternFilmKK(String nyilvantartasiSzam, String cim, int evSzam, String mufaj, int filmHossza, int koltsegvetes,boolean voltakBenneIndianok) {
        super(nyilvantartasiSzam, cim, evSzam, mufaj, filmHossza, koltsegvetes);
        this.voltakBenneIndianok = voltakBenneIndianok;
    }

    public WesternFilmKK(String nyilvantartasiSzam, String cim, int evSzam, int filmHossza, int koltsegvetes) {
        super(nyilvantartasiSzam, cim, evSzam, filmHossza, koltsegvetes);
    }

    public boolean isVoltakBenneIndianok() {
        return voltakBenneIndianok;
    }

    public void setVoltakBenneIndianok(boolean voltakBenneIndianok) {
        this.voltakBenneIndianok = voltakBenneIndianok;
    }

    @Override
    public int getMufajErtekeles() {
        if (voltakBenneIndianok) {
            return 5;
        } else
            return 0;
    }
}
