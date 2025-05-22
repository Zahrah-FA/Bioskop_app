/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polimorfisme;

/**
 *
 * @author Zahrah
 */
public class FilmModern extends Film {
    private boolean isIMAX;

    public FilmModern(String judul, String genre, int durasi, boolean isIMAX) {
        super(judul, genre, durasi);
        this.isIMAX = isIMAX;
    }

    @Override
    public String getKategori() {
        return "Film Modern";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", IMAX: " + (isIMAX ? "Ya" : "Tidak") + ", Kategori: " + getKategori();
    }
}
