/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6_Abstract;

/**
 *
 * @author Zahrah
 */
public class FilmKlasik extends Film {
    private String sutradara;

    public FilmKlasik(String judul, String genre, int durasi, String sutradara) {
        super(judul, genre, durasi);
        this.sutradara = sutradara;
    }

    @Override
    public String getInfo() {
        return "Klasik - " + judul + " | Genre: " + genre + " | Durasi: " + durasi + " menit | Sutradara: " + sutradara;
    }

    @Override
    public String getKategori() {
        return "Film Klasik";
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }
}
