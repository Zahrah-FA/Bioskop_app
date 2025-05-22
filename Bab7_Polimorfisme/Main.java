/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polimorfisme;

/**
 *
 * @author Zahrah
 */
public class Main {
    public static void main(String[] args) {
        // Array of parent class with child class objects
        Film[] daftarFilm = new Film[2];

        daftarFilm[0] = new FilmKlasik("Pahlawan Lama", "Sejarah", 120, "Budi Santoso");
        daftarFilm[1] = new FilmModern("Aksi Masa Kini", "Action", 110, true);

        for (Film film : daftarFilm) {
            System.out.println(film.getInfo());
        }
    }
}
