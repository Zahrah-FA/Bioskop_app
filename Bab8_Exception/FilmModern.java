/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8_Exception;

/**
 *
 * @author Zahrah
 */
class FilmModern extends Film {
    private boolean imax;

    public FilmModern(String judul, String genre, int durasi, boolean imax) {
        super(judul, genre, durasi);
        this.imax = imax;
    }

    @Override
    public String getInfo() {
        return "Modern - Judul: " + judul + ", Genre: " + genre + ", Durasi: " + durasi + " menit, IMAX: " + (imax ? "Ya" : "Tidak");
    }

    @Override
    public String getKategori() {
        return "Film Modern";
    }
}
