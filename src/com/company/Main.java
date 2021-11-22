package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        VideotekaKK blockBusters = new VideotekaKK(10, tesztAdatok());
        Scanner scanner = new Scanner(System.in);
        int szam;
        System.out.println();
        System.out.println("Szia Uram!");
        System.out.println("Válassz egy számot!");
        System.out.println();

        do {
            System.out.println("0. Viszlát!");
            System.out.println("1. Az összes film listázása");
            System.out.println("2. Western? Horror? Romantikus? Válassz egy műfajt és kilistázom a filmeket! ");
            System.out.println("3. Válassz egy évszámot és kilistázom a filmeket!");
            System.out.println("4. Ha beírsz egy értékelést, a magasabb vagy egyenlő értékelésű filmeket listázom!");
            System.out.println("5. Szellemes filmek listázása");
            System.out.println("6. Házasságok száma");
            szam = scanner.nextInt();
            scanner.nextLine();

            switch (szam) {
                case 0:
                    break;
                case 1:
                    blockBusters.listaz();
                    break;
                case 2:
                    System.out.println("Addj meg egy műfajt!");
                    String mufaj = scanner.nextLine();
                    blockBusters.filmekMufajSzerint(mufaj);
                    break;
                case 3:
                    System.out.println("Addj meg egy évszámot!");
                    int evszam = scanner.nextInt();
                    blockBusters.filmekEvszamSzerint(evszam);
                    break;
                case 4:
                    System.out.println("Add meg a minimum pontszámot");
                    int minPont = scanner.nextInt();
                    blockBusters.filmekErtekelesSzerint(minPont);
                    break;
                case 5:
                    blockBusters.szellemesFilmek();
                    break;
                case 6:
                    blockBusters.hazassagokSzam();
                    break;
                default:
                    System.out.println("Rossz input!");
                    break;
            }
        } while (szam != 0);

    }

    static FilmekKK[] tesztAdatok() {
        return new FilmekKK[]{
                new HorrorFilmKK("478", "Devil in Me", 2022, "Horror", 14000, 16000, true, false),
                new RomantikusFilmKK("112", "Life is Strange", 2016, "Romantikus", 15000, 10000, 2),
                new WesternFilmKK("366", "Red Dead", 2013, "Western", 17000, 200000, true),
                new HorrorFilmKK("477", "Little Hope", 2020, "Horror", 16000, 12000, true, false),
                new HorrorFilmKK("546", "Until Dawn", 1994, "Horror", 54788, 456, false, true),
                new HorrorFilmKK("123", "House of Ashes", 2021, "Horror", 600, 46000, false, true),
                new RomantikusFilmKK("744", "Remember Me", 2009, "Romantikus", 600, 46000, 3),
                new WesternFilmKK("784", "West World", 2006, "Western", 600, 46000, false),
                new RomantikusFilmKK("794", "Detroit", 2007, "Romantikus", 600, 46000, 0),
                new HorrorFilmKK("897", "Obscure", 2004, "Horror", 10000, 5000, false, true)
        };
    }
}
