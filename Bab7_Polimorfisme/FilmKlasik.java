/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polimorfisme;

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
    public String getKategori() {
        return "Film Klasik";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Sutradara: " + sutradara + ", Kategori: " + getKategori();
    }
}
