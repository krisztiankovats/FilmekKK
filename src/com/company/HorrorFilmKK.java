package com.company;

public final class HorrorFilmKK extends FilmekKK {

    private boolean voltBenneSzellem;
    private boolean voltBenneSzornyeteg;


    public HorrorFilmKK(String nyilvantartasiSzam, String cim, int evSzam, String mufaj, int filmHossza, int koltsegvetes, boolean voltBenneSzellem, boolean voltBenneSzornyeteg) {
        super(nyilvantartasiSzam, cim, evSzam, mufaj, filmHossza, koltsegvetes);
        this.voltBenneSzellem = voltBenneSzellem;
        this.voltBenneSzornyeteg = voltBenneSzornyeteg;
    }

    public HorrorFilmKK(String nyilvantartasiSzam, String cim, int evSzam, int filmHossza, int koltsegvetes) {
        super(nyilvantartasiSzam, cim, evSzam, filmHossza, koltsegvetes);
    }

    public boolean isVoltBenneSzellem() {
        return voltBenneSzellem;
    }

    public void setVoltBenneSzellem(boolean voltBenneSzellem) {
        this.voltBenneSzellem = voltBenneSzellem;
    }

    public boolean isVoltBenneSzornyeteg() {
        return voltBenneSzornyeteg;
    }

    public void setVoltBenneSzornyeteg(boolean voltBenneSzornyeteg) {
        this.voltBenneSzornyeteg = voltBenneSzornyeteg;
    }

    @Override
    public int getMufajErtekeles() {
        if (voltBenneSzornyeteg && voltBenneSzellem) {
            return 5;
        } else if (voltBenneSzornyeteg) {
            return 3;
        } else if (voltBenneSzellem) {
            return 2;
        } else
            return 0;
    }
}
