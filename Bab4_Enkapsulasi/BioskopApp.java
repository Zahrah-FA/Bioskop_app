/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4_Enkapsulasi;

/**
 *
 * @author Zahrah
 */
// Main Class for Testing
public class BioskopApp {
    public static void main(String[] args) {
        Film film = new Film("The Godfather", "Crime", 175);
        System.out.println("Judul: " + film.getJudul() + ", Genre: " + film.getGenre() + ", Durasi: " + film.getDurasi() + " menit");

        FilmKlasik filmKlasik = new FilmKlasik("Casablanca", "Romance", 102, "Michael Curtiz");
        System.out.println("Judul: " + filmKlasik.getJudul() + ", Genre: " + filmKlasik.getGenre() + ", Durasi: " + filmKlasik.getDurasi() + " menit, Sutradara: " + filmKlasik.getSutradara());

        FilmModern filmModern = new FilmModern("Avengers: Endgame", "Action", 181, true);
        System.out.println("Judul: " + filmModern.getJudul() + ", Genre: " + filmModern.getGenre() + ", Durasi: " + filmModern.getDurasi() + " menit, Teknologi IMAX: " + (filmModern.isTeknologiIMAX() ? "Ya" : "Tidak"));
    }
}

