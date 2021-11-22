package com.company;

public final class RomantikusFilmKK extends FilmekKK {

    private int hazassagokSzama;

    public RomantikusFilmKK(String nyilvantartasiSzam, String cim, int evSzam, String mufaj, int filmHossza, int koltsegvetes, int hazassagokSzama) {
        super(nyilvantartasiSzam, cim, evSzam, mufaj, filmHossza, koltsegvetes);
        this.hazassagokSzama = hazassagokSzama;
    }

    public RomantikusFilmKK(String nyilvantartasiSzam, String cim, int evSzam, int filmHossza, int koltsegvetes) {
        super(nyilvantartasiSzam, cim, evSzam, filmHossza, koltsegvetes);
    }

    public int getHazassagokSzama() {
        return hazassagokSzama;
    }

    public void setHazassagokSzama(int hazassagokSzama) {
        this.hazassagokSzama = hazassagokSzama;
    }

    @Override
    public int getMufajErtekeles() {
        if (hazassagokSzama >= 5) {
            return 5;
        } else
            return hazassagokSzama;
    }
}
