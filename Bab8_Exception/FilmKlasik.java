/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8_Exception;

/**
 *
 * @author Zahrah
 */
// Class turunan 1
class FilmKlasik extends Film {
    private String sutradara;

    public FilmKlasik(String judul, String genre, int durasi, String sutradara) {
        super(judul, genre, durasi);
        this.sutradara = sutradara;
    }

    @Override
    public String getInfo() {
        return "Klasik - Judul: " + judul + ", Genre: " + genre + ", Durasi: " + durasi + " menit, Sutradara: " + sutradara;
    }

    @Override
    public String getKategori() {
        return "Film Klasik";
    }
}
