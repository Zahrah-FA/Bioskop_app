/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6_Abstract;

/**
 *
 * @author Zahrah
 */
public class Main {
    public static void main(String[] args) {
        Film klasik = new FilmKlasik("Petualangan Si Unyil", "Drama", 90, "Sutradara A");
        Film modern = new FilmModern("Avengers: Endgame", "Aksi", 180, true);

        System.out.println(klasik.getKategori() + "\n" + klasik.getInfo() + "\n");
        System.out.println(modern.getKategori() + "\n" + modern.getInfo());

    }
}

