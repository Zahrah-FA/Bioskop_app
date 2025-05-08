/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6_Abstract;

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
    public String getInfo() {
        return "Modern - " + judul + " | Genre: " + genre + " | Durasi: " + durasi + " menit | IMAX: " + (isIMAX ? "Ya" : "Tidak");
    }

    @Override
    public String getKategori() {
        return "Film Modern";
    }

    public boolean isIMAX() {
        return isIMAX;
    }

    public void setIMAX(boolean IMAX) {
        isIMAX = IMAX;
    }
}

