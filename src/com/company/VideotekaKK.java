package com.company;

public class VideotekaKK {

    private final int meret;
    private final FilmekKK[] filmek;

    public VideotekaKK(int meret, FilmekKK[] filmek) {
        this.meret = meret;
        this.filmek = filmek;

    }

    public void addFilmek(FilmekKK film) {
        for (int i = 0; i < filmek.length; i++) {
            if (filmek[i] == null) {
                filmek[i] = film;
                return;
            }
        }
        throw new RuntimeException();
    }

    public void listaz() {

        for (int i = 0; i < filmek.length; i++) {
            FilmekKK film = filmek[i];
            if (film != null) {
                System.out.println(film);
                System.out.println();
            }
        }
    }

    public void filmekMufajSzerint(String mufaj) {

        for (int i = 0; i < filmek.length; i++) {
            FilmekKK film = filmek[i];
            if (film.getMufaj().equals(mufaj)) {
                System.out.println(film);
                System.out.println();
            }
        }

    }


    public void filmekEvszamSzerint(int evszam) {

        for (int i = 0; i < filmek.length; i++) {
            FilmekKK film = filmek[i];
            if (film.getEvSzam() == evszam) {
                System.out.println(film);
                System.out.println();
            }
        }


    }

    public void filmekErtekelesSzerint(int minErtekeles) {
        for (int i = 0; i < filmek.length; i++) {
            FilmekKK film = filmek[i];
            if (film.getErtekeles() >= minErtekeles) {
                System.out.println(film);
                System.out.println();
            }
        }
    }

    public void szellemesFilmek() {
        for (int i = 0; i < filmek.length; i++) {
            FilmekKK film = filmek[i];
            if (film instanceof HorrorFilmKK) {
                HorrorFilmKK horrorok = (HorrorFilmKK) film;
                if (horrorok.isVoltBenneSzellem()) {
                    System.out.println(film);
                    System.out.println();
                }
            }
        }
    }

    public void hazassagokSzam() {
        int hazassagok = 0;

        for (int i = 0; i < filmek.length; i++) {
            FilmekKK film = filmek[i];
            if (film instanceof RomantikusFilmKK) {
                RomantikusFilmKK romantikusFilmek = (RomantikusFilmKK) film;
                if (romantikusFilmek.getHazassagokSzama() > 0) {
                    hazassagok += romantikusFilmek.getHazassagokSzama();
                }
            }
        }
        System.out.println(hazassagok);
    }


}
