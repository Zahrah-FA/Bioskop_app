/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_Overloading_dan_Overriding;

/**
 *
 * @author Zahrah
 */
public class BioskopApp {
    public static void main(String[] args) {
        Film film = new Film("The Godfather", "Crime", 175);
        System.out.println(film.tampilkanInfo());
        System.out.println(film.tampilkanInfo("Studio 1"));

        FilmKlasik filmKlasik = new FilmKlasik("Casablanca", "Romance", 102, "Michael Curtiz");
        System.out.println(filmKlasik.tampilkanInfo());

        FilmModern filmModern = new FilmModern("Avengers: Endgame", "Action", 181, true);
        System.out.println(filmModern.tampilkanInfo());
    }
}
